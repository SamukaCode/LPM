package model;

public class Produto {
    private String cod;
    private String desc;
    private double preco;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String cod, String desc, double preco) {
        this.cod = cod;
        this.desc = desc;
        this.preco = preco;
    }
    
}
