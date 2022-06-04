package marketsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketSystem {
    private static ArrayList<Cliente> clientArray;
    private static ArrayList<Funcionario> funcArray;
    private static ArrayList<Produto> productArray;
    private static Scanner input = new Scanner(System.in);
    private static int idc,idf;
    
    public static void menu() {
        System.out.println("MENU: Qual item você quer acessar?");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Remover Cliente");
        System.out.println("3 - Mostrar Clientes");
        System.out.println("4 - Mostrar Funcionários");
        System.out.println("5 - Cadastrar Funcionário");
        System.out.println("6 - Remover Funcionário");
        System.out.println("7 - Mostrar Produtos");
        System.out.println("8 - Cadastrar Produto");
        System.out.println("9 - Remover Produto");
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
            case 4:
                mostraFuncionario();
                break;
            case 5:
                cadastrarFuncionario();
                break;
            case 6:
                apagarFuncionario();
                break;
                
                // Reajustar, Alinhar e afins.
                
            default:
                System.out.println("Valor inválido. Reiniciando operação.");
                menu();
        }
    }

    public static void initItems() {
        clientArray = new ArrayList();
        funcArray = new ArrayList();
        productArray = new ArrayList();
        idc=0;
        idf=0;
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
       
        
        if (nome == null||idade<0||cpf<0||telefone<0)
        {
            System.out.println("Um dos dados informados está inválido. Não são permitidos valores vazios ou negativos.");
        }
        else {
            idc++;
            Cliente c = new Cliente(idc, nome, idade, cpf, telefone); 
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
    
    public static void cadastrarFuncionario() {
        input.nextLine();
        
        System.out.println("Qual o nome do funcionário?");
        String nome = input.nextLine();
        input.nextLine();
        System.out.println("Qual a idade do funcionário?");
        int idade = input.nextInt();
        System.out.println("Qual o CPF do funcionário?");
        int cpf = input.nextInt();
        System.out.println("Qual o telefone do funcionário?");
        int telefone = input.nextInt();
        System.out.println("Qual o email do funcionário?");
        String email = input.nextLine();
        
        if (nome == null||idade<0||cpf<0||telefone<0||email == null)
        {
            System.out.println("Um dos dados informados está inválido. Não são permitidos valores vazios ou negativos.");
        }
        else {
            idf++;
            Funcionario f = new Funcionario(idf, nome, idade, cpf, telefone, email); 
            funcArray.add(f);
        }
        System.out.println("Operação Finalizada. Deseja voltar ao item de adicionar funcionário? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                cadastrarFuncionario();
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
    
    public static void apagarFuncionario() {
        input.nextLine();
        boolean found=false;
        System.out.println("Qual o ID do funcionário a ser removido?");
        int value = input.nextInt();
        for (Funcionario f: funcArray) {
            if(f.getId()==value) {
                clientArray.remove(f);
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("Nenhum ID encontrado. Deseja voltar ao item de remover funcionários? 1 = Sim; 2 = Não");
            int s = input.nextInt();
            switch (s) {
                case 1:
                    apagarFuncionario();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("Não é uma entrada válida. Por padrão, voltando ao menu.");
                    menu();
            }
        }
        System.out.println("Operação Finalizada. Deseja voltar ao item de apagar funcionário? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                apagarFuncionario();
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
        for (Cliente c: clientArray) {
            c.exibir();
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void mostraFuncionario() {
        for (Funcionario f: funcArray) {
            f.exibir();
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void cadastrarProduto() {
        input.nextLine();
        System.out.println("Qual o código do produto?");
        long cod = input.nextLong();
        System.out.println("Qual a marca do produto?");
        String marca = input.nextLine();
        System.out.println("Qual a descrição do produto?");
        String desc = input.nextLine();
        System.out.println("Em qual corredor o produto está?");
        int corredor = input.nextInt();
        System.out.println("Qual o preço do produto?");
        double valor = input.nextDouble();
        
        if (marca == null||corredor<0||valor<0||cod<0||desc == null)
        {
            System.out.println("Um dos dados informados está inválido. Não são permitidos valores vazios ou negativos.");
        }
        else {
            Produto p = new Produto(cod, marca, desc, corredor, valor); 
            productArray.add(p);
        }
        System.out.println("Operação Finalizada. Deseja voltar ao item de adicionar funcionário? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                cadastrarFuncionario();
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
    
    public static void apagarProduto() {
        input.nextLine();
        boolean found=false;
        System.out.println("Qual o código do produto a ser removido?");
        int value = input.nextInt();
        for (Produto p: productArray) {
            if(p.getCod()==value) {
                clientArray.remove(p);
                found=true;
                break;
            }
        }
            if (!found) {
                System.out.println("Nenhum ID encontrado. Deseja voltar ao item de remover produtos? 1 = Sim; 2 = Não");
                int s = input.nextInt();
                switch (s) {
                case 1:
                    apagarProduto();
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
        System.out.println("Operação Finalizada. Deseja voltar ao item de remover produtos? 1 = Sim; 2 = Não");
        int a = input.nextInt();
            switch (a) {
                case 1:
                    apagarProduto();
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
    
    private static void mostraProduto() {
        for (Produto p: productArray) {
            p.exibir();
        }
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
