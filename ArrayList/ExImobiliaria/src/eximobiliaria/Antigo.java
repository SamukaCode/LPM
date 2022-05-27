package eximobiliaria;

public class Antigo extends Imovel{

    public Antigo(double valorDesc, String endereco, double valor) {
        super(endereco, valor);
        this.valorDesc = valorDesc;
    }
    private double valorDesc;
    
        @Override
    public void imprimeDados() {
        System.out.println("Endereço: " + getEndereco() + " | Valor: " + getValor() + " | Valor de Desconto: " + valorDesc);
    }

    public double getValorDesc() {
        return valorDesc;
    }

    public void setValorDesc(double valorDesc) {
        this.valorDesc = valorDesc;
    }
    
}
