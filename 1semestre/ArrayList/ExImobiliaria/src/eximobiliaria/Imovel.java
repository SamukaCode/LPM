package eximobiliaria;

public class Imovel {
    protected String endereco;
    protected double valor;

    public Imovel(String endereco, double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }
    
    public void imprimeDados() {
        System.out.println("Endereço: " + endereco + " | Valor: " + valor);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
