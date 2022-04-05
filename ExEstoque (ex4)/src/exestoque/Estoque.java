package exestoque;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;
    
    public Estoque() {
        nome = "";
        qtdAtual=0;
        qtdMinima=0;
    }
    
    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        if(qtdAtual<1)
            System.out.println("Erro");
        else
            this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        if(qtdMinima<1)
            System.out.println("Erro");
        else
        this.qtdMinima = qtdMinima;
    }
    
    public void repor(int qtd) {
        if((qtdAtual+qtd)<0)
            System.out.println("Erro!");
        else
            qtdAtual = qtdAtual+qtd;
    }
    
    public void darBaixa(int qtd) {
        if((qtdAtual-qtd)<0)
            System.out.println("Erro!");
        else
            qtdAtual = qtdAtual-qtd;
    }
    
    public String mostra() {
        return "Nome do produto: " + nome + ". Quantidade atual: " + qtdAtual + ". Quantidade mínima: " + qtdMinima;
    }
    
    public boolean precisaRepor() {
        if (qtdAtual<=qtdMinima)
            return true;
        else
            return false;
    }
}
