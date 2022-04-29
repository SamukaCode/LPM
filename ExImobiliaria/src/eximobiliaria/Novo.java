package eximobiliaria;

public class Novo extends Imovel {
    private double valorAd;
    
    @Override
    public void imprimeDados() {
        System.out.println("Endereço: " + getEndereco() + " | Valor: " + getValor() + " | Valor Adicional: " + valorAd);
    }

    public double getValorAd() {
        return valorAd;
    }

    public Novo(double valorAd, String endereco, double valor) {
        super(endereco, valor);
        this.valorAd = valorAd;
    }

    public void setValorAd(double valorAd) {
        this.valorAd = valorAd;
    }
   
}
