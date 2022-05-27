package exeinterface;

public class Retangulo implements IForma {
    private double base,altura;

    @Override
    public double calcArea() {
        return base*altura;
    }
    
    public Retangulo(double base, double altura) {
        if (base<=0||altura<=0)
            throw new IllegalArgumentException("Valor inválido, os valores esperados são maiores que 0 (zero)");
        else if (base==altura)
            throw new IllegalArgumentException("Valor inválido, modifique um dos valores a fim de torná-los diferentes.");
        else
        this.base = base;
        this.altura = altura;
    }
    
}
