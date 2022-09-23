
package imovel;

public class Principal {
    
    public static void main(String[] args) {
        Novo n1 = new Novo(1000,123,"Av. Brasil",120000);
        Usado u1 = new Usado(10000,12344,"Av. da Saudade",90000);
        
        System.out.printf("A casa nova de código %d tem como preço final R$%.2f\n",n1.getCod(),n1.getPreco());
        System.out.printf("A casa usada de código %d tem como preço final R$%.2f\n",u1.getCod(),u1.getPreco());
    }
}
   
