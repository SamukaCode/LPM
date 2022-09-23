package exarraylist;

public class Poupanca extends Conta {
    private double taxa;
    
    @Override
    public void mostra() {
        System.out.println("É poupança");
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    
}
