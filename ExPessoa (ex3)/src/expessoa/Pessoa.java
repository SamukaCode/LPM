
package expessoa;


public class Pessoa {
    private int idade;
    private int dia;
    private int mes;
    private int ano;
    private String nome;


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia>0 && dia<32)
            this.dia = dia;
        else
            System.out.println("Erro");
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes>0 && mes<13)
            this.mes = mes;
        else
            System.out.println("Erro");
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano>999)
            this.ano = ano;
        else
            System.out.println("Erro");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void calculaIdade() {
        this.idade = 2022-ano;
    }
    
    public int informaIdade() {
        return idade;
    }
    
    public String informaNome() {
        return nome;
    }
    
    public Pessoa(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Pessoa(int dia, int mes, int ano, String nome) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.nome = nome;
    }
}