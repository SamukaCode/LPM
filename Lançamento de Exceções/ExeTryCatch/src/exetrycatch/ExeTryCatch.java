package exetrycatch;

public class ExeTryCatch {
    
    public static void aumentarLetra()
    {
        String teste = "Rapaizzzzzz";
        
        try {
        System.out.println(teste.toUpperCase());
        }
        catch(NullPointerException e) {
            System.out.println("Desculpe!" + " A string não pode ser null");
        }
        finally {
            System.out.println("Opa, passei por aqui!");
        }
    }

    public static void main(String[] args) {
        aumentarLetra();
    }
    
}
