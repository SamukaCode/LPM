package imovel;

public class Imovel {
    private int cod;
    private String end;
    protected double preco;

    public Imovel(int cod, String end, double preco) {
        this.cod = cod;
        this.end = end;
        this.preco = preco;
    }
    
    
        /*Crie uma classe IMÓVEL, que possui um código, endereço e preço. Defina um construtor para
a classe IMÓVEL passando esses três atributos como argumento. Crie uma classe NOVO que
herda de IMÓVEL e possui um preço adicional. Crie métodos de acesso e impressão deste preço
adicional. Crie também uma classe USADO, que herda de IMÓVEL e possui um desconto no
preço. Crie métodos de acesso e impressão para este desconto. Crie objetos do tipo Imóvel NOVO
e USADO. Conforme o objeto, imprima o valor final do imóvel. Use a técnica de sobrescrita
(ou redefinição) de métodos.*/

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
        
}
    

