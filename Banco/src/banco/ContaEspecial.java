package banco;

public class ContaEspecial extends ContaBancaria {
    private float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    @Override
        public void sacar(double valor) {
        if (getSaldo()-valor < limite)
            System.out.println("Erro!");
        else
            setSaldo(getSaldo()-valor);
    }
}
