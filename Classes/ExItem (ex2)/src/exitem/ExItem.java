package exitem;

    import java.util.Scanner;

public class ExItem {
    

    public static void main(String[] args) {

        Item t1 = new Item();
        Item t2 = new Item();
        Scanner teclado = new Scanner(System.in);
        
        System.out.printf("Digite a descrição do produto: ");
        t1.setDesc(teclado.nextLine());
        System.out.printf("Digite o código do produto: ");
        t1.setCod(teclado.nextInt());
        System.out.printf("Digite a quantidade do produto comprado: ");
        t1.setQnt(teclado.nextInt());
        System.out.printf("Digite o preço do produto: R$");
        t1.setPrec(teclado.nextFloat());
        
        teclado.nextLine(); // Limpa o buffer
        
        System.out.printf("Digite a descrição do produto: ");
        t2.setDesc(teclado.nextLine());
        System.out.printf("Digite o código do produto: ");
        t2.setCod(teclado.nextInt());
        System.out.printf("Digite a quantidade do produto comprado: ");
        t2.setQnt(teclado.nextInt());
        System.out.printf("Digite o preço do produto: R$");
        t2.setPrec(teclado.nextFloat());
        
        System.out.printf("Serão gastos R$%.2f em produtos de código %d, cuja descrição é: %s\n\n",t1.getTotal(),t1.getCod(),t1.getDesc());
        System.out.printf("Serão gastos R$%.2f em produtos de código %d, cuja descrição é: %s\n\n",t2.getTotal(),t2.getCod(),t2.getDesc());
    }
    
}
