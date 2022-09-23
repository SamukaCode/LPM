package exeabstract;

public class ExeAbstract {


    public static void main(String[] args) {
        // Animal a = new Animal();
        Animal a = new Cachorro();
        a.falar();
        
        Animal a2 = new Gato();
        a2.falar();
        // a2.arranha();
        Gato g1 = (Gato) a2;
        g1.arranha(); 
    }
    
}
