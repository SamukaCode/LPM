package model;

public class Servico {
    private int id;
    private String desc;
    private double preco;

    public Servico() {
    }

    public Servico(int id, String desc, double preco) {
        this.id = id;
        this.desc = desc;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
}
