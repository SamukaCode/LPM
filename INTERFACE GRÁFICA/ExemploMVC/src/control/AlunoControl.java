package control;

import java.util.ArrayList;
import model.Aluno;

public class AlunoControl {
    private ArrayList<Aluno> listaAl;

    public AlunoControl() {
        listaAl = new ArrayList<>();
    }
    
    public void cadastrarAluno(int ra, String nome) {
        Aluno al = new Aluno(ra, nome);
        listaAl.add(al);
    }
    
    public ArrayList<Aluno> buscarTodos() {
        return listaAl;
    }
}
