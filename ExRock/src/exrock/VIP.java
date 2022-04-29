package exrock;

public class VIP extends Ingresso {
    private double valorAd;

    public double getValorAd() {
        return valorAd;
    }

    public void setValorAd(double valorAd) {
        this.valorAd = valorAd;
    }
    
    @Override
    public double imprimeValor() {
        return valor+valorAd;
    }

    public VIP(double valorAd, double valor) {
        super(valor);
        this.valorAd = valorAd;
    }
}
