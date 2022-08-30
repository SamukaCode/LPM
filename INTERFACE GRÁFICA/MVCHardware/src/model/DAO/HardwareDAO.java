package model.DAO;

import conection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Hardware;


public class HardwareDAO {
    Connection con;
    
    public void inserirProduto(Hardware h) throws SQLException
    { 
            con = new Conexao().getConnection();
            String sql = "INSERT INTO HardwareJava (cod,marca,modelo,tipo,preco) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, h.getCod());
            stmt.setString(2, h.getMarca());
            stmt.setString(3, h.getModelo());
            stmt.setString(4, h.getTipo());
            stmt.setDouble(5, h.getPreco());
            stmt.execute();
            stmt.close();
            con.close();    
    }
    
    public void excluirProduto(int cod) throws SQLException {
            con = new Conexao().getConnection();
            String sql = "DELETE FROM HardwareJava WHERE cod = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cod);
            stmt.execute();
            stmt.close();
            con.close();    
    }
    
}
