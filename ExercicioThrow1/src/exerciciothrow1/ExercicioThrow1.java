package exerciciothrow1;


public class ExercicioThrow1 {

    
    public static void main(String[] args) {
        Object o = null;
        try{
        o.toString();
        }
        catch(NullPointerException e){
            System.out.println("O valor é nulo");
            
        }
    }
    
}
