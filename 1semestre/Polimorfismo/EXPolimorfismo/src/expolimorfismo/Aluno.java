package expolimorfismo;

public class Aluno extends Pessoa {
    private int ra;
    
    /*@Override -- DÁ ERRO POIS O MÉTODO mostraDados EM Pessoa ESTÁ COM O OPERADOR final
    public void mostraDados() {
        System.out.println("É um aluno!");
    }*/
    
    public double calcularMedia(double n1, double n2) {
        return (n1+n2)/2;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
    
}
