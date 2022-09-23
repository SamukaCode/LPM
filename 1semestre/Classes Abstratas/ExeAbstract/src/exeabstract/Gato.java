package exeabstract;

public class Gato extends Animal {
    
    @Override
    public void falar() {
        System.out.println("Miau");
    }
    
    public void arranha() {
        System.out.println("Gato arranhando");
    }
    
}
