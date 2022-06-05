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
        System.out.println("\nMENU: Qual item você quer acessar?\n");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Remover Cliente");
        System.out.println("3 - Mostrar Clientes");
        System.out.println("4 - Busca Cliente\n");
        
        System.out.println("5 - Cadastrar Funcionários");
        System.out.println("6 - Remover Funcionário");
        System.out.println("7 - Mostrar Funcionário");
        System.out.println("8 - Busca Funcionário\n");
        
        System.out.println("9 - Cadastrar Produtos");
        System.out.println("10 - Remover Produto");
        System.out.println("11 - Mostrar Produto");
        System.out.println("12 - Buscar Produto\n");
        
        System.out.println("13 - Ver cliente mais jovem");
        System.out.println("14 - Ver cliente mais velho");
        System.out.println("15 - Ver quantos clientes são maiores de 60 anos");
        System.out.println("16 - Ver quantos clientes são menores de 18 anos");
        System.out.println("17 - Ver a média da idade dos clientes\n");
        
        System.out.println("18 - Ver produto mais caro");
        System.out.println("19 - Ver produto mais barato");
        System.out.println("20 - Ver média dos preços dos produtos");
        System.out.println("21 - Ver produtos com preço acima da média\n");
        
        System.out.print("Digite o número do item a ser acessado: ");
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
                cadastrarFuncionario();
                break;
            case 6:
                apagarFuncionario();
                break;
            case 7:
                mostraFuncionario();
                break;
            case 8:
                buscaFuncionario();
                break;
            case 9:
                cadastrarProduto();
                break;
            case 10:
                apagarProduto();
                break;
            case 11:
                mostraProduto();
                break;
            case 12:
                buscaProduto();
                break;
            case 13:
                menorIdade();
                break;
            case 14:
                maiorIdade();
                break;
            case 15:
                clienteMaior();
                break;
            case 16:
                clienteMenor();
                break;
            case 17:
                idadeMedia();
                break;
            case 18:
                maiorValor();
                break;
            case 19:
                menorValor();
                break;
            case 20:
                mediaValor();
                break;
            case 21:
                acimaMedia();
                break;

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
    
    public static void buscaProduto() {
        System.out.println("\nDeseja buscar produto por qual informação?");
        System.out.println("1 - Preço");
        System.out.println("2 - Descrição");
        System.out.println("3 - Código");
        System.out.print("\nDigite o número da opção escolhida: ");
        int a = input.nextInt();
        switch(a) {
            case 1:
                buscaProdutoValor();
                break;
            case 2:
                buscaProdutoDesc();
                break;
            case 3:
                buscaProdutoCod();
                break;
            default:
                System.out.println("Entrada inválida, por padrão, voltando ao menu.");
                menu();
        }
    }
    
    public static void buscaFuncionario() {
        clearBuffer(input);
        
        boolean found=false;
        
        System.out.println("\nDigite o nome (ou parte do nome) do funcionário: ");
        String pt = input.nextLine();
        
        for(Funcionario f: funcArray) {
            if (f.getNome().contains(pt)) {
                System.out.println("\nRegistro encontrado:");
                f.exibir();
                found=true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("\nNenhum registro encontrado. Deseja reiniciar a operação ou sair? 1 = Reiniciar; 2 = Sair.");
            int a = input.nextInt();
            switch(a) {
                case 1:
                    buscaFuncionario();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("\nEntrada inválida. Por padrão, voltando ao menu.");
                    menu();
            }
        }
        
        System.out.println("\nOperação Finalizada. Deseja buscar mais algum funcionário? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                buscaFuncionario();
                break;
            case 2:
                menu();
                break;
            default:
                System.out.println("\nNão é uma entrada válida. Por padrão, voltando ao menu.");
                menu();
                break;
        }
        
    }
    
    public static void buscaCliente() {
        clearBuffer(input);
        
        boolean found=false;
        
        System.out.println("\nDigite o nome (ou parte do nome) do cliente:");
        String pt = input.nextLine();
        
        for(Cliente c: clientArray) {
            if (c.getNome().contains(pt)) {
                System.out.println("\nRegistro encontrado:");
                c.exibir();
                found=true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("\nNenhum registro encontrado. Deseja reiniciar a operação ou sair? 1 = Reiniciar; 2 = Sair.");
            int a = input.nextInt();
            switch(a) {
                case 1:
                    buscaCliente();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("\nEntrada inválida. Por padrão, voltando ao menu.");
                    menu();
            }
        }
        
        System.out.println("\nOperação Finalizada. Deseja buscar mais algum cliente? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                buscaCliente();
                break;
            case 2:
                menu();
                break;
            default:
                System.out.println("\nNão é uma entrada válida. Por padrão, voltando ao menu.");
                menu();
                break;
        }
        
    }
    
    public static void cadastrarCliente() {
        clearBuffer(input);
        
        System.out.println("\nQual o nome do Cliente?");
        String nome = input.nextLine();  
        
        clearBuffer(input);
        
        System.out.println("\nQual a Idade do Cliente?");
        int idade = input.nextInt();
        
        clearBuffer(input);
        
        System.out.println("\nQual o CPF do Cliente?");
        int cpf = input.nextInt();
        
        clearBuffer(input);
        
        System.out.println("\nQual o telefone do Cliente?");
        int telefone = input.nextInt();
        
        clearBuffer(input);
       
        
        if (nome.isEmpty()||idade<0||cpf<0||telefone<0)
        {
            System.out.println("\nUm dos dados informados está inválido. Não são permitidos valores vazios ou negativos. Reiniciando operação.");
            cadastrarCliente();
        }
        else {
            idc++;
            Cliente c = new Cliente(idc, nome, idade, cpf, telefone); 
            clientArray.add(c);
        }
        System.out.println("\nOperação Finalizada. Deseja adicionar mais algum cliente? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                menu();
                break;
            default:
                System.out.println("\nNão é uma entrada válida. Por padrão, voltando ao menu.");
                menu();
                break;
        }
        
       
    }
    
    public static void cadastrarFuncionario() {
        clearBuffer(input);
        
        System.out.println("\nQual o nome do funcionário?");
        String nome = input.nextLine();
        
        clearBuffer(input);
        
        System.out.println("\nQual a idade do funcionário?");
        int idade = input.nextInt();
        
        clearBuffer(input);
        
        System.out.println("\nQual o CPF do funcionário?");
        int cpf = input.nextInt();
        
        clearBuffer(input);
        
        System.out.println("\nQual o telefone do funcionário?");
        int telefone = input.nextInt();
        
        clearBuffer(input);
        
        System.out.println("\nQual o email do funcionário?");
        String email = input.nextLine();
        
        clearBuffer(input);
        
        if (nome.isEmpty()||idade<0||cpf<0||telefone<0||email.isEmpty())
        {
            System.out.println("\nUm dos dados informados está inválido. Não são permitidos valores vazios ou negativos. Reiniciando operação.");
            cadastrarFuncionario();
        }
        else {
            idf++;
            Funcionario f = new Funcionario(idf, nome, idade, cpf, telefone, email); 
            funcArray.add(f);
        }
        System.out.println("\nOperação Finalizada. Deseja voltar ao item de adicionar funcionário? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                cadastrarFuncionario();
                break;
            case 2:
                menu();
                break;
            default:
                System.out.println("\nNão é uma entrada válida. Por padrão, voltando ao menu.");
                menu();
                break;
        }
    }
    
    public static void apagarFuncionario() {
        clearBuffer(input);
        
        boolean found=false;
        System.out.println("\nQual o ID do funcionário a ser removido?");
        int value = input.nextInt();
        for (Funcionario f: funcArray) {
            if(f.getId()==value) {
                funcArray.remove(f);
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nNenhum ID encontrado. Deseja retomar a operação? 1 = Sim; 2 = Não");
            int s = input.nextInt();
            switch (s) {
                case 1:
                    apagarFuncionario();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("\nNão é uma entrada válida. Por padrão, voltando ao menu.");
                    menu();
            }
        }
        System.out.println("\nOperação Finalizada. Deseja apagar mais algum registro? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                apagarFuncionario();
                break;
            case 2:
                menu();
                break;
            default:
                System.out.println("\nNão é uma entrada válida. Por padrão, voltando ao menu.");
                menu();
                break;
        }
    }
    
    public static void apagarCliente() {
        clearBuffer(input);
        boolean found=false;
        System.out.println("\nQual o ID do cliente a ser removido?");
        int value = input.nextInt();
        for (Cliente c: clientArray) {
            if(c.getId()==value) {
                clientArray.remove(c);
                found=true;
                break;
            }
        }
            if (!found) {
                System.out.println("\nNenhum ID encontrado. Deseja reiniciar a operação? 1 = Sim; 2 = Não");
                int s = input.nextInt();
                switch (s) {
                case 1:
                    apagarCliente();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("\nNão é uma entrada válida. Por padrão, voltando ao menu.");
                    menu();
                    break;
                }
            }
        System.out.println("\nOperação Finalizada. Deseja remover mais algum cliente? 1 = Sim; 2 = Não");
        int a = input.nextInt();
            switch (a) {
                case 1:
                    apagarCliente();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("\nNão é uma entrada válida. Por padrão, voltando ao menu.");
                    menu();
                    break;
                }
            }
    
    public static void mostraCliente() {
        System.out.println("\nMostrando todos os clientes registrados:\n");
        for (Cliente c: clientArray) {
            c.exibir();
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void mostraFuncionario() {
        System.out.println("\nMostrando todos os funcionários registrados:\n");
        for (Funcionario f: funcArray) {
            f.exibir();
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void cadastrarProduto() {
        clearBuffer(input);
        System.out.println("\nQual o código do produto?");
        long cod = input.nextLong();
        
        clearBuffer(input);
        
        System.out.println("\nQual a marca do produto?");
        String marca = input.nextLine();
        
        clearBuffer(input);
        
        System.out.println("\nQual a descrição do produto?");
        String desc = input.nextLine();
        
        clearBuffer(input);
        
        System.out.println("\nEm qual corredor o produto está?");
        int corredor = input.nextInt();
        
        clearBuffer(input);
        
        System.out.println("\nQual o preço do produto?");
        double valor = input.nextDouble();
        
        clearBuffer(input);
        
        if (marca.isEmpty()||corredor<0||valor<0||cod<0||desc.isEmpty())
        {
            System.out.println("\nUm dos dados informados está inválido. Não são permitidos valores vazios ou negativos. Reiniciando operação");
            cadastrarFuncionario();
        }
        else {
            Produto p = new Produto(cod, marca, desc, corredor, valor); 
            productArray.add(p);
        }
        System.out.println("\nOperação Finalizada. Deseja cadastrar mais algum funcionário? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                cadastrarFuncionario();
                break;
            case 2:
                menu();
                break;
            default:
                System.out.println("\nNão é uma entrada válida. Por padrão, voltando ao menu.");
                menu();
                break;
        }   
    }
    
    public static void apagarProduto() {
        clearBuffer(input);
        boolean found=false;
        System.out.println("\nQual o código do produto a ser removido?");
        int value = input.nextInt();
        for (Produto p: productArray) {
            if(p.getCod()==value) {
                clientArray.remove(p);
                found=true;
                break;
            }
        }
            if (!found) {
                System.out.println("\nNenhum ID encontrado. Deseja reiniciar a operação? 1 = Sim; 2 = Não");
                int s = input.nextInt();
                switch (s) {
                case 1:
                    apagarProduto();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("\nNão é uma entrada válida. Por padrão, voltando ao menu.");
                    menu();
                    break;
                }
            }
        System.out.println("\nOperação Finalizada. Deseja remover mais algum produto? 1 = Sim; 2 = Não");
        int a = input.nextInt();
            switch (a) {
                case 1:
                    apagarProduto();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("\nNão é uma entrada válida. Por padrão, voltando ao menu.");
                    menu();
                    break;
                }
    }
    
    public static void mostraProduto() {
        System.out.println("\nMostrando produtos cadastrados:\n");
        for (Produto p: productArray) {
            p.exibir();
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void buscaProdutoDesc() {
        clearBuffer(input);
        
        boolean found=false;
        
        System.out.println("\nDigite a descrição (ou parte da descrição) do produto:");
        String desc = input.nextLine();
        
        clearBuffer(input);
        
        for(Produto p: productArray) {
            if (p.getDesc().contains(desc)) {
                System.out.println("\nRegistro encontrado:");
                p.exibir();
                found=true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("\nNenhum registro encontrado. Deseja reiniciar a operação? 1 = Reiniciar; 2 = Sair.");
            int a = input.nextInt();
            switch(a) {
                case 1:
                    buscaProdutoDesc();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("\nEntrada inválida. Por padrão, voltando ao menu.");
                    menu();
            }
        }
        
        System.out.println("\nOperação Finalizada. Deseja buscar mais algum produto? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                buscaProduto();
                break;
            case 2:
                menu();
                break;
            default:
                System.out.println("nNão é uma entrada válida. Por padrão, voltando ao menu.");
                menu();
                break;
        }
        
    }
    
    public static void buscaProdutoCod() {
        clearBuffer(input);
        
        boolean found=false;
        
        System.out.println("\nDigite o código do produto:");
        long cod = input.nextLong();
        
        for(Produto p: productArray) {
            if (p.getCod() == cod) {
                System.out.println("\nRegistro encontrado:");
                p.exibir();
                found=true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("\nNenhum registro encontrado. Deseja reiniciar a operação? 1 = Reiniciar; 2 = Sair.");
            int a = input.nextInt();
            switch(a) {
                case 1:
                    buscaProdutoCod();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("\nEntrada inválida. Por padrão, voltando ao menu.");
                    menu();
            }
        }
        
        System.out.println("\nOperação Finalizada. Deseja buscar mais algum produto? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                buscaProduto();
                break;
            case 2:
                menu();
                break;
            default:
                System.out.println("\nNão é uma entrada válida. Por padrão, voltando ao menu.");
                menu();
                break;
        }
        
    }
    
    public static void buscaProdutoValor() {
        clearBuffer(input);
        
        boolean found=false;
        
        System.out.println("\nDigite o preço do produto:");
        double val = input.nextDouble();
        
        for(Produto p: productArray) {
            if (p.getValor() == val) {
                System.out.println("Registro encontrado:");
                p.exibir();
                found=true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Nenhum registro encontrado. Deseja reiniciar a operação? 1 = Reiniciar; 2 = Sair.");
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
        
        System.out.println("Operação Finalizada. Deseja buscar mais algum produto? 1 = Sim; 2 = Não");
        int s = input.nextInt();
        switch (s) {
            case 1:
                buscaProduto();
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
        clearBuffer(input);
        
        if(productArray.isEmpty()) {
            System.out.println("\nNão há nenhum produto cadastrado. Voltando ao menu.");
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
        System.out.println("\nProduto mais caro:");
        p1.exibir();
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void menorValor() {
        clearBuffer(input);
        
        if(productArray.isEmpty()) {
            System.out.println("\nNão há nenhum produto cadastrado. Voltando ao menu.");
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
            System.out.println("\nProduto mais barato:");
        p1.exibir();
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void mediaValor() {
        clearBuffer(input);
        if(productArray.isEmpty()) {
            System.out.println("\nNão há nenhum produto cadastrado. Voltando ao menu.");
            menu();
        }
        else {
        double med=0;
        
        for (Produto p: productArray) {
            med += p.getValor();
        }
        med = med/productArray.size();
        System.out.println("\nMédia: R$" + med);   
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void acimaMedia() {
        clearBuffer(input);
        if(productArray.isEmpty()) {
            System.out.println("\nNão há nenhum produto cadastrado. Voltando ao menu.");
            menu();
        }
        else {
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
        
        System.out.println("\nQuantidade de produtos com preço acima da média: " + a);
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
    
    public static void maiorIdade() {
        clearBuffer(input);
        if(clientArray.isEmpty()) {
            System.out.println("\nNão há nenhum cliente cadastrado. Voltando ao menu.");
            menu();
        }
        else {
        
        Cliente c1;
        c1 = clientArray.get(0);
        
        for (Cliente c: clientArray) {
            if (c1.getIdade()<c.getIdade())
                c1 = c;
        }
        
        System.out.println("\nCliente de maior idade:");
        c1.exibir();
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void menorIdade() {
        clearBuffer(input);
        
        if(clientArray.isEmpty()) {
            System.out.println("\nNão há nenhum cliente cadastrado. Voltando ao menu.");
            menu();
        }
        else {
        
        Cliente c1;
        c1 = clientArray.get(0);
        
        for (Cliente c: clientArray) {
            if (c1.getIdade()>c.getIdade())
                c1 = c;
        }
        
        System.out.println("\nCliente de menor idade:");
        c1.exibir();
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void clienteMaior() {
        clearBuffer(input);
        if(clientArray.isEmpty()) {
            System.out.println("\nNão há nenhum cliente cadastrado. Voltando ao menu.");
            menu();
        }
        else {
        int a=0;
        
        for(Cliente c: clientArray) {
            if(c.getIdade()>60)
                a++;
        }
        System.out.println("\nClientes com mais de 60 anos: " + a);
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void clienteMenor() {
        clearBuffer(input);
        if(clientArray.isEmpty()) {
            System.out.println("\nNão há nenhum cliente cadastrado. Voltando ao menu.");
            menu();
        }
        else {
        int a=0;
        
        for(Cliente c: clientArray) {
            if(c.getIdade()<18)
                a++;
        }
        System.out.println("\nClientes com menos de 18 anos: " + a);
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void idadeMedia() {
        clearBuffer(input);
        if(clientArray.isEmpty()) {
            System.out.println("\nNão há nenhum cliente cadastrado. Voltando ao menu.");
            menu();
        }
        else {
        double med=0;
        
        for(Cliente c: clientArray) {
            med += c.getIdade();
        }
        
        med = med/clientArray.size();
        System.out.println("\nMédia da idade dos clientes: " + med);
        }
        System.out.println("\nOperação Finalizada. Voltando ao menu.");
        menu();
    }
    
    public static void main(String[] args) {
        initItems();
        menu();
    }
}
