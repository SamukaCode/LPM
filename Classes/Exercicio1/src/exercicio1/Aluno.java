
package exercicio1;

public class Aluno {
    private String nome;
    private int ra;
    private boolean matri;
    private String nascimento;
    
    void cancelaMatr() {
    if (matri) {
        matri = false;
        System.out.println("Aluno desmatriculado com sucesso.");
    }
    else
        System.out.println("Erro, o aluno já está desmatriculado");
}
}
