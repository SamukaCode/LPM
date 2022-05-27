package exabstract;

public class Horista extends Empregado {
    private double precoHora;
    private double horasTrabalhadas;

    public Horista(double precoHora, double horasTrabalhadas, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double vencimento() {
        return precoHora*horasTrabalhadas;
    }
    
}
