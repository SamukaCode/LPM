package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Aluno;

public class AlunoDAO {
Connection con;
    
    public void inserirAluno(Aluno al) throws SQLException
    { 
            con = new Conexao().getConnection();
            String sql = "Insert into AlunoJava (ra,nome) values (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, al.getRa());
            stmt.setString(2, al.getNome());
            stmt.execute();
            stmt.close();
            con.close();    
    }    
    
    public void excluirAluno(int ra) throws SQLException {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM AlunoJava WHERE RA = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, ra);
        stmt.execute();
        stmt.close();
        con.close();
    }
}
