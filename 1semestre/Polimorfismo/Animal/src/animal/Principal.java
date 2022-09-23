package animal;

public class Principal {

    
    public static void main(String[] args) {
        Animal c1 = new Cachorro();
        Animal v1 = new Cavalo();
        Animal p1 = new Preguica();
        
        c1.emiteSom();
        v1.emiteSom();
        p1.emiteSom();
        
        Cachorro ca = (Cachorro) c1;
        ca.correr();
        Cavalo c = (Cavalo) v1;
        c.correr();
        Preguica p2 = (Preguica) p1;
        p2.sobeArvore();
       
        
        
    }
    
}
