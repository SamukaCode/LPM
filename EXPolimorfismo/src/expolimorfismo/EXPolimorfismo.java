package expolimorfismo;


public class EXPolimorfismo {

    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        
        // poli
        
        Pessoa p2 = new Aluno();
        p2.mostraDados();
        System.out.println(a1.calcularMedia(10, 8));
        Pessoa p3 = new Aluno();
        Aluno a3 = (Aluno) p3; // Importante!
        System.out.println(a3.calcularMedia(2, 5));
        
        if(a3 instanceof Aluno)
            System.out.println("É instância");
        else
            System.out.println("Não é instância");
        
        
        
    }
    
}
