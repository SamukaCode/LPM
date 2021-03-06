package marketsystem;

public class Produto {
    private long cod;
    private String marca;
    private String desc;
    private long corredor;
    private double valor;

    public Produto() {
    }

    public Produto(long cod, String marca, String desc, long corredor, double valor) {
        this.cod = cod;
        this.marca = marca;
        this.desc = desc;
        this.corredor = corredor;
        this.valor = valor;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getCorredor() {
        return corredor;
    }

    public void setCorredor(long corredor) {
        this.corredor = corredor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void exibir() {
        System.out.printf("Código: %d | Marca: %s | Descrição: %s | Corredor: %d | Preço: %.2f\n",getCod(),getMarca(),getDesc(),getCorredor(),getValor());
    }
}
