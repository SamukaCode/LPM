package exarraylist;

public class Corrente extends Conta {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void mostra() {
        System.out.println("É corrente");
    }
    
}
