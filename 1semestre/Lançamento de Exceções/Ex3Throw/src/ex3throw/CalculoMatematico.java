package ex3throw;

public class CalculoMatematico {
    
    public static double divisao(int n1, int n2) {
        try {
            return n1/n2;
        } catch(ArithmeticException e) {
            System.out.println("Não é possível dividir por 0");
            return 0;
        }
    }
}

    
    
    

