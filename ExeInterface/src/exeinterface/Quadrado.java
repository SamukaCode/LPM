package exeinterface;

public class Quadrado extends FormaGeometrico implements IForma, IBidimensional {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado(double lado) {
        if (lado<=0)
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero).");
        else
        this.lado = lado;
    }
    
    @Override
    public double calcArea() {
        setArea(lado*lado);
        return getArea();
        
    }

    @Override
    public void ehBidimensional() {
        System.out.println("Bidimensional.");
    }
    
    
    
    
}
