package exercicio.pkg08.pkg03;

public class Retangulo {
    private float base;
    private float altura;

    // Gets e Sets
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        if(base>=1&&base<=20)
            this.base = base;
        else
            System.out.println("Erro!");
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura>=1&&altura<=20)
            this.altura = altura;
        else
            System.out.println("Erro!");
    }
    
    // Construtores
    
    public Retangulo() {
        base=1;
        altura=1;
    }
    
    // Métodos
    
    public float peri() {
        return altura+altura+base+base;
    }
    
    public float area() {
        return altura*base;
    }
}
