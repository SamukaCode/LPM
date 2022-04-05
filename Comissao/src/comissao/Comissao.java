package comissao;

import java.util.Scanner;

public class Comissao {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        float salFixo,valorVendas,totalReceber;
        System.out.print("Digite o nome do vendedor: ");
        nome = teclado.nextLine();
        System.out.print("Digite o salário fixo: R$");
        salFixo = teclado.nextFloat();
        System.out.print("Digite o total de vendas: R$");
        valorVendas = teclado.nextFloat();
        totalReceber = (float) (salFixo+(valorVendas*0.15));
        System.out.printf("Total a receber pelo vendedor " + nome + " é R$%.2f \n",totalReceber);   
    }
}
