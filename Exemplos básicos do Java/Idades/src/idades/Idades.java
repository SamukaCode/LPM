package idades;

    import java.util.Scanner;

public class Idades {
    
    public static void main(String[] args) {
        int idade = 0 ,x = 1,y = 0;
        Scanner teclado = new Scanner(System.in);
        float media;
        
        while(idade>=0) {
            System.out.printf("Digite a idade: ");
            idade = teclado.nextInt();
            if(idade>=0)
            {
            y=y+idade;
            x++;
            }
        }
        media=y/x;
        System.out.println("A média é: " + media);
    } 
}
