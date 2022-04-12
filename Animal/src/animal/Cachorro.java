package animal;

public class Cachorro extends Animal {
    
    @Override
    public void emiteSom() {
        System.out.println("Au!");
    }
    
    public void correr() {
        System.out.println("O cachorro está correndo!");
    }
    
}
