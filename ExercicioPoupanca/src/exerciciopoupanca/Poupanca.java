
package exerciciopoupanca;

public class Poupanca {
    private static double taxaJurosAnual;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void calcularJurosMensais() {
        saldo += (saldo * taxaJurosAnual) / 12;
    }
    public static void modificaTaxaJuro(double novaTaxa) {
        novaTaxa = novaTaxa/100;
        taxaJurosAnual = novaTaxa;
    }
    public Poupanca(double saldo) {
        this.saldo = saldo;
    }
}
