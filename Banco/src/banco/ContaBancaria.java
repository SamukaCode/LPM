package banco;

public class ContaBancaria {
    private String cliente;
    private int numConta;
    private double saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(double valor) {
        if ((saldo-=valor)<0)
            System.out.println("Erro!");
        else
        saldo -= valor;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
}
