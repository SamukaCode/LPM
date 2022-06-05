package marketsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketSystem {
    private static ArrayList<Cliente> clientArray;
    private static ArrayList<Funcionario> funcArray;
    private static ArrayList<Produto> productArray;
    private static final Scanner input = new Scanner(System.in);
    private static int idc,idf;
    
    public static void menu() {
        System.out.println("MENU: Qual item você quer acessar?");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Remover Cliente");
        System.out.println("3 - Mostrar Clientes");
        System.out.println("4 - Busca Cliente");
        System.out.println("5 - Mostrar Funcionários");
        System.out.println("6 - Cadastrar Funcionário");
        System.out.println("7 - Remover Funcionário");
        System.out.println("8 - Busca Funcionário");
        System.out.println("9 - Mostrar Produtos");
        System.out.println("10 - Cadastrar Produto");
        System.out.println("11 - Remover Produto");
        System.out.println("12 - Buscar Produto pela Descrição");
        System.out.println("13 - Buscar Produto pelo Código");
        System.out.println("14 - Buscar Produto pelo Valor");
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
                buscaCliente();
                break;
            case 5:
                mostraFuncionario();
                break;
            case 6:
                cadastrarFuncionario();
                break;
            case 7:
                apagarFuncionario();
                break;
            case 8:
                buscaFuncionario();
                break;
            case 9:
                mostraProduto();
                break;
            case 10:
                cadastrarProduto();
                break;
            case 11:
                apagarProduto();
                break;
            case 12:
                buscaProdutoDesc();
                break;
            case 13:
                buscaProdutoCod();
                break;
            case 14:
                buscaProdutoValor();
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
    
    public static void buscaFuncionario() {
        input.nextLine();
        
        boolean found=false;
        
        System.out.println("Digite o nome (ou parte do nome) do funcionário");
        String pt = input.nextLine();
        
        for(Funcionario f: funcArray) {
            if (f.getNome().contains(pt)) {
                f.exibir();
                found=true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Nenhum registro encontrado. Deseja reiniciar a operação ou sair? 1 = Reiniciar; 2 = Sair.");
            int a = input.nextInt();
            switch(a) {
                case 1:
                    buscaFuncionario();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("Entrada inválida. Por padrão, voltando ao menu.");
                    menu();
            }
        }
        
        System.out.println("Operação Finalizada. Deseja voltar ao item buscar funcionário? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                buscaFuncionario();
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
    
    public static void buscaCliente() {
        input.nextLine();
        
        boolean found=false;
        
        System.out.println("Digite o nome (ou parte do nome) do cliente");
        String pt = input.nextLine();
        
        for(Cliente c: clientArray) {
            if (c.getNome().contains(pt)) {
                c.exibir();
                found=true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Nenhum registro encontrado. Deseja reiniciar a operação ou sair? 1 = Reiniciar; 2 = Sair.");
            int a = input.nextInt();
            switch(a) {
                case 1:
                    buscaCliente();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("Entrada inválida. Por padrão, voltando ao menu.");
                    menu();
            }
        }
        
        System.out.println("Operação Finalizada. Deseja voltar ao item buscar cliente? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                buscaCliente();
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
        clearBuffer(input);
        System.out.println("Qual a idade do funcionário?");
        int idade = input.nextInt();
        clearBuffer(input);
        System.out.println("Qual o CPF do funcionário?");
        int cpf = input.nextInt();
        clearBuffer(input);
        System.out.println("Qual o telefone do funcionário?");
        int telefone = input.nextInt();
        clearBuffer(input);
        System.out.println("Qual o email do funcionário?");
        String email = input.nextLine();
        clearBuffer(input);
        
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
        clearBuffer(input);
        System.out.println("Qual a marca do produto?");
        String marca = input.nextLine();
        clearBuffer(input);
        System.out.println("Qual a descrição do produto?");
        String desc = input.nextLine();
        clearBuffer(input);
        System.out.println("Em qual corredor o produto está?");
        int corredor = input.nextInt();
        clearBuffer(input);
        System.out.println("Qual o preço do produto?");
        double valor = input.nextDouble();
        clearBuffer(input);
        
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
    
    public static void mostraProduto() {
        for (Produto p: productArray) {
            p.exibir();
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void buscaProdutoDesc() {
        input.nextLine();
        
        boolean found=false;
        
        System.out.println("Digite a descrição (ou parte da descrição) do produto");
        String desc = input.nextLine();
        
        for(Produto p: productArray) {
            if (p.getDesc().contains(desc)) {
                p.exibir();
                found=true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Nenhum registro encontrado. Deseja reiniciar a operação ou sair? 1 = Reiniciar; 2 = Sair.");
            int a = input.nextInt();
            switch(a) {
                case 1:
                    buscaProdutoDesc();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("Entrada inválida. Por padrão, voltando ao menu.");
                    menu();
            }
        }
        
        System.out.println("Operação Finalizada. Deseja voltar ao item buscar cliente? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                buscaProdutoDesc();
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
    
    public static void buscaProdutoCod() {
        input.nextLine();
        
        boolean found=false;
        
        System.out.println("Digite o código do produto");
        long cod = input.nextLong();
        
        for(Produto p: productArray) {
            if (p.getCod() == cod) {
                p.exibir();
                found=true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Nenhum registro encontrado. Deseja reiniciar a operação ou sair? 1 = Reiniciar; 2 = Sair.");
            int a = input.nextInt();
            switch(a) {
                case 1:
                    buscaProdutoCod();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("Entrada inválida. Por padrão, voltando ao menu.");
                    menu();
            }
        }
        
        System.out.println("Operação Finalizada. Deseja voltar ao item buscar cliente? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                buscaProdutoCod();
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
    
    public static void buscaProdutoValor() {
        input.nextLine();
        
        boolean found=false;
        
        System.out.println("Digite o preço do produto");
        double val = input.nextDouble();
        
        for(Produto p: productArray) {
            if (p.getValor() == val) {
                p.exibir();
                found=true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Nenhum registro encontrado. Deseja reiniciar a operação ou sair? 1 = Reiniciar; 2 = Sair.");
            int a = input.nextInt();
            switch(a) {
                case 1:
                    buscaProdutoValor();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("Entrada inválida. Por padrão, voltando ao menu.");
                    menu();
            }
        }
        
        System.out.println("Operação Finalizada. Deseja voltar ao item buscar cliente? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                buscaProdutoValor();
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
    
    public static void maiorValor() {
        input.nextLine();
        
        if(productArray.isEmpty()) {
            System.out.println("Não há nenhum produto cadastrado. Voltando ao menu.");
            menu();
        }
        else {
        
        Produto p1;
        p1 = productArray.get(0);
        
        for(Produto p: productArray) {
            if (p.getValor()>p1.getValor()) {
                p1 = p;
            }
        }
            System.out.println("Produto mais caro:");
        p1.exibir();
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void menorValor() {
        input.nextLine();
        
        if(productArray.isEmpty()) {
            System.out.println("Não há nenhum produto cadastrado. Voltando ao menu.");
            menu();
        }
        else {
        
        Produto p1;
        p1 = productArray.get(0);
        
        for(Produto p: productArray) {
            if (p.getValor()<p1.getValor()) {
                p1 = p;
            }
        }
            System.out.println("Produto mais barato:");
        p1.exibir();
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void mediaValor() {
        input.nextLine();
        
        double med=0;
        
        for (Produto p: productArray) {
            med += p.getValor();
        }
        med = med/productArray.size();
        System.out.println("Média: R$" + med);   
        
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void acimaMedia() {
        input.nextLine();
        double med=0;
        int a=0;
        
        for (Produto p: productArray) {
            med += p.getValor();
        }
        med = med/productArray.size();
        
        for (Produto p: productArray) {
            if (p.getValor()>med)
                a++;
        }
        
        System.out.println("Quantidade de produtos com preço acima da média: " + a);
        
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
    
    public static void maiorIdade() {
        input.nextLine();
        
        Cliente c1;
        c1 = clientArray.get(0);
        
        for (Cliente c: clientArray) {
            if (c1.getIdade()<c.getIdade())
                c1 = c;
        }
        
        System.out.println("Cliente de maior idade:");
        c1.exibir();
        
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void menorIdade() {
        input.nextLine();
        
        Cliente c1;
        c1 = clientArray.get(0);
        
        for (Cliente c: clientArray) {
            if (c1.getIdade()>c.getIdade())
                c1 = c;
        }
        
        System.out.println("Cliente de menor idade:");
        c1.exibir();
        
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void clienteMaior() {
        input.next();
        int a=0;
        
        for(Cliente c: clientArray) {
            if(c.getIdade()>60)
                a++;
        }
        System.out.println("Clientes com mais de 60 anos: " + a);
        
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void clienteMenor() {
        input.next();
        int a=0;
        
        for(Cliente c: clientArray) {
            if(c.getIdade()<18)
                a++;
        }
        System.out.println("Clientes com menos de 18 anos: " + a);
        
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void idadeMedia() {
        input.nextLine();
        double med=0;
        
        for(Cliente c: clientArray) {
            med += c.getIdade();
        }
        
        med = med/clientArray.size();
        System.out.println("Média da idade dos clientes: " + med);
    }
    
    public static void main(String[] args) {
        initItems();
        menu();
    }
}
