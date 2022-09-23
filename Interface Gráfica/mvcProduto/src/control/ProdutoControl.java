package control;

import java.util.ArrayList;
import model.Produto;

public class ProdutoControl {
    private ArrayList<Produto> listaP;

    public ProdutoControl() {
        this.listaP = new ArrayList<>();
    }


    
    public void cadastrarProduto(String cod, String desc, double preco) {
        Produto pl = new Produto(cod, desc, preco);
        listaP.add(pl);
    }
    
    public ArrayList<Produto> buscarProduto(String desc) {
        ArrayList<Produto> listabusca = new ArrayList<>();
        for (Produto p: listaP) {
            if (p.getDesc().contains(desc)) {
                listabusca.add(p);
            }
        }
        return listabusca;
    }
    
    public void excluiProduto(String cod) {
        for (Produto p: listaP) {
            if (p.getCod().equals(cod))
                listaP.remove(p);
        }
    }
    
}
