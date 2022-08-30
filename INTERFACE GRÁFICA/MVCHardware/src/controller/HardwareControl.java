package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;
import model.Hardware;
import model.DAO.HardwareDAO;

public class HardwareControl {
    private ArrayList<Hardware> arrayH;

    public HardwareControl() {
        arrayH = new ArrayList<>();
    }
    
    public void cadastrarProduto(int cod, String marca, String modelo, String tipo, double preco) throws SQLException {
        Hardware h = new Hardware(cod, marca, modelo, tipo, preco);
        HardwareDAO hadao = new HardwareDAO();
        hadao.inserirProduto(h);
    }
    
    public void excluirProduto(int cod) throws SQLException {
        HardwareDAO hadao = new HardwareDAO();
        hadao.excluirProduto(cod);
    }

    
}
