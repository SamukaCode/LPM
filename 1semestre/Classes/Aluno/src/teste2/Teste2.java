package teste2;

public class Teste2 {

    public static void main(String[] args) {
        //Aluno a1 = new Aluno();
        Aluno a2 = new Aluno(12349,"Samuel");
        System.out.println("RA: " + a2.getRa());
        System.out.println("Nome: " + a2.getNome());
        
        Aluno a3 = new Aluno();
        System.out.println("RA: " + a3.getRa());
        System.out.println("Nome: " + a3.getNome());
        
        Aluno a4 = new Aluno ("Cleiton");
        System.out.println("RA: " + a4.getRa());
        System.out.println("Nome: " + a4.getNome());
        
        Aluno a5 = new Aluno (3333);
        System.out.println("RA: " + a5.getRa());
        System.out.println("Nome: " + a5.getNome());
        a5.verifica(a5.getRa());
        a5.verifica(a5.getNome());
        
    }
    
}
