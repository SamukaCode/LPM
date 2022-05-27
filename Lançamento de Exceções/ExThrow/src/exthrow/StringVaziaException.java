package exthrow;


public class StringVaziaException extends RuntimeException {
    @Override
    public String getMessage(){
        return "A string (nome) não pode ser vazia";
    }
    
}
