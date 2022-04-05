package exfuncionario;

public class Funcionario {
private String nome;
private String sobrenome;
private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario<0)
            salario=0;
        else
            this.salario = salario;
    }
    
    public Funcionario() {
        nome="";
        sobrenome="";
        salario=0;
    }
    
    public Funcionario(String nome, String sobrenome, double salario) {
        this.nome=nome;
        this.sobrenome=sobrenome;
        if(salario<0)
            this.salario=0;
        else
            this.salario = salario;
    }
}
