package exeinterface;

public class Circulo implements IForma {
    private double raio;
    
    @Override
    public double calcArea() {
        return Math.PI*raio*raio;
    }
    
}    
