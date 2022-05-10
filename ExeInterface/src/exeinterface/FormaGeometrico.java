package exeinterface;

public class FormaGeometrico {
    private double perimetro;
    private double area;

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public double calcArea() {
        System.out.println("calculando área");
        return 0;
    }
}
