package testafuncionarios;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public double CalculaBonificacao() {
        return salario * 0.1;
    }
    public String MostraDados(){
        return "Nome: " + nome + ". Salário: R$" + salario;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
}
