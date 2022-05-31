package marketsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketSystem {
    private static ArrayList<Cliente> clientArray = new ArrayList();
    private static ArrayList funcArray = new ArrayList();
    private static Scanner input = new Scanner(System.in);
    
    public static void menu() {
        System.out.println("MENU: Qual item você quer acessar?");
        System.out.println("1 - Cadastrar Cliente");
        int i = input.nextInt();
        switch(i) {
            case 1:
                cadastrarCliente();
                break;
        }
        
        
    }
    
    public static void cadastrarCliente() {
        input.nextLine();
        System.out.println("Qual o nome do Cliente?");
        String nome = input.nextLine();
        System.out.println("Qual a Idade do Cliente?");
        int idade = input.nextInt();
        input.nextLine();
        System.out.println("Qual o CPF do Cliente?");
        int cpf = input.nextInt();
        input.nextLine();
        System.out.println("Qual o telefone do Cliente?");
        int telefone = input.nextInt();
        input.nextLine();
        System.out.println("Qual o email do Cliente?");
        String email = input.nextLine();
        
        Cliente c = new Cliente(nome, idade, cpf, telefone, email); 
        clientArray.add(c);
        
        
    }
    
    public static void main(String[] args) {
          menu();
    }
}
