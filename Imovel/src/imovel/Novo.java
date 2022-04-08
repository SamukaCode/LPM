
package imovel;

public class Novo extends Imovel {
    
   private double adicional;

    public Novo(double adicional, int cod, String end, double preco) {
        super(cod, end, preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    public void imprimeAdicional() {
        System.out.println("Adicional: R$" + adicional);
    }
    
   @Override
    public double getPreco() {
        return preco+adicional;
    }
    
}
