package produtos;

import java.util.Scanner;

public class Produtos {

    public static void main(String[] args) {
        int x;
        float valor,lucro,venda;
        Scanner teclado = new Scanner(System.in);
        
        for(x=0;x<20;x++) {
            System.out.printf("Digite o preço do produto: R$");
            valor = teclado.nextFloat();
            if(valor<100) {
                venda=valor+20;
                lucro=20;
            }
            else {
                venda=valor+50;
                lucro=50;
            }
            System.out.printf("O valor de venda do %d° produto é: R$%.2f e o lucro será de R$%.2f.\n\n",x+1,venda,lucro);
        }
    }    
}
