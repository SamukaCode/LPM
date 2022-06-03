package marketsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketSystem {
    private static ArrayList<Cliente> clientArray;
    private static ArrayList funcArray;
    private static Scanner input = new Scanner(System.in);
    private static int id;
    
    public static void menu() {
        System.out.println("MENU: Qual item você quer acessar?");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Remover Cliente");
        System.out.println("3 - Mostrar Clientes");
        int i = input.nextInt();
        
        switch(i) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                apagarCliente();
                break;
            case 3:
                mostraCliente();
                break;
            default:
                System.out.println("Valor inválido. Reiniciando operação.");
                menu();
        }
    }

    public static void initItems() {
        clientArray = new ArrayList();
        funcArray = new ArrayList();
        id=0;
    }
    
    public static void cadastrarCliente() {
        input.nextLine();
        
        System.out.println("Qual o nome do Cliente?");
        String nome = input.nextLine();  
        
        System.out.println("Qual a Idade do Cliente?");
        int idade = input.nextInt();
        
        System.out.println("Qual o CPF do Cliente?");
        int cpf = input.nextInt();
        
        System.out.println("Qual o telefone do Cliente?");
        int telefone = input.nextInt();
        clearBuffer(input);
        
        System.out.println("Qual o Email do Cliente?");
        String email = input.nextLine();
        
        if (nome == null||idade<0||cpf<0||telefone<0||email == null)
        {
            System.out.println("Um dos dados informados está inválido. Não são permitidos valores vazios ou negativos.");
        }
        else {
            id++;
            Cliente c = new Cliente(email, id, nome, idade, cpf, telefone); 
            clientArray.add(c);
        }
        System.out.println("Operação Finalizada. Deseja voltar ao item de adicionar cliente? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                menu();
                break;
            default:
                System.out.println("Não é uma entrada válida. Por padrão, voltando ao menu.");
                menu();
                break;
        }
    }
    
    public static void apagarCliente() {
        input.nextLine();
        boolean found=false;
        System.out.println("Qual o ID do cliente a ser removido?");
        int value = input.nextInt();
        for (Cliente c: clientArray) {
            if(c.getId()==value) {
                clientArray.remove(c);
                found=true;
                break;
            }
        }
            if (!found) {
                System.out.println("Nenhum ID encontrado. Deseja voltar ao item de remover clientes? 1 = Sim; 2 = Não");
                int s = input.nextInt();
                switch (s) {
                case 1:
                    apagarCliente();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("Não é uma entrada válida. Por padrão, voltando ao menu.");
                    menu();
                    break;
                }
            }
        System.out.println("Operação Finalizada. Deseja voltar ao item de remover clientes? 1 = Sim; 2 = Não");
        int a = input.nextInt();
            switch (a) {
                case 1:
                    apagarCliente();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("Não é uma entrada válida. Por padrão, voltando ao menu.");
                    menu();
                    break;
                }
            }
    
    public static void mostraCliente() {
        System.out.println("  ===========================================\n" + "| ID | NOME COMPLETO | IDADE | CPF | TELEFONE |  EMAIL  |\n" + "  -------------------------------------------");
        System.out.println("| 12 | João Arquimedes | 12 | 12356356234 | 126262346243 | joao@gamil.com");
        System.out.println("| 12 | Maria Joaquina | 12 | 12356356234 | 126262346243 | maria@gmail.com");
        for (Cliente c: clientArray) {
            c.exibir();
        }
        System.out.println("  ===========================================");
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
        
    }
    
      private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
    
    public static void main(String[] args) {
        initItems();
        menu();
    }
}
