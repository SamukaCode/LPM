package exeinterface;

public class Circulo implements IForma {
    private double raio;
    
    @Override
    public double calcArea() {
        return Math.PI*raio*raio;
    }

    @Override
    public double calcPerimetro() {
        return Math.PI*2*raio;
    }

    @Override
    public double calcSeccao() {
        return 0;
    }

    @Override
    public void mostrar() {
        System.out.println("É um círculo");
    }    
}
