package model.DAO;

import conection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public ArrayList<Hardware> buscarProduto() throws SQLException {
        ResultSet rs;
        ArrayList<Hardware> lista = new ArrayList();
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM HardwareJava";
        PreparedStatement stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();
        while (rs.next()) {
            int cod = rs.getInt("cod");
            String marca = rs.getString("marca");
            String modelo = rs.getString("modelo");
            String tipo = rs.getString("tipo");
            Double preco = rs.getDouble("preco");
            Hardware h = new Hardware(cod, marca, modelo, tipo, preco);
            lista.add(h);
        }
        stmt.close();
        con.close();
        return lista;
    }
    
        public Hardware buscarProduto(int codig) throws SQLException {
        ResultSet rs;
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM HardwareJava WHERE cod = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, codig);
        rs = stmt.executeQuery();
        rs.first();
        int cod = rs.getInt("cod");
        String marca = rs.getString("marca");
        String modelo = rs.getString("modelo");
        String tipo = rs.getString("tipo");
        Double preco = rs.getDouble("preco");
        Hardware h = new Hardware(cod, marca, modelo, tipo, preco);
        stmt.close();
        con.close();
        return h;
    }
    
}
