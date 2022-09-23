package control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;
import model.Aluno;
import model.DAO.AlunoDAO;

public class AlunoControl {
    private ArrayList<Aluno> listaAl;

    public AlunoControl() {
        listaAl = new ArrayList<>();
    }
    
    public void cadastrarAluno(int ra, String nome) throws SQLException {
        Aluno al = new Aluno(ra, nome);
        AlunoDAO aldao = new AlunoDAO();
        aldao.inserirAluno(al);
    }
    
    public void excluirAluno(int ra) throws SQLException {
        AlunoDAO aldao = new AlunoDAO();
        aldao.excluirAluno(ra);
    }
    
    public ArrayList<Aluno> buscarTodos() {
        return listaAl;
    }
}
