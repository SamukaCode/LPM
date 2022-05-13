package exabstract;

public class Assalariado extends Empregado {
    private double salario;

    public Assalariado(double salario, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double vencimento() {
        return salario;
    }
    
}
