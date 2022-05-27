package imovel;

public class Usado extends Imovel {
    private double desconto;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public Usado(double desconto, int cod, String end, double preco) {
        super(cod, end, preco);
        this.desconto = desconto;
    }
    
    public void imprimeDesconto() {
        System.out.println("Desconto: R$" + desconto);
    }
    
    @Override
    public double getPreco() {
        return preco-desconto;
    }
    
    
}
