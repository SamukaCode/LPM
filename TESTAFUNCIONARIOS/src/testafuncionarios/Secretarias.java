package testafuncionarios;

public class Secretarias extends Funcionario {
    int ramal;

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    @Override
    public String MostraDados(){
    return super.MostraDados() + ". Ramal: " + ramal ;
    }

    public Secretarias(String nome, double salario, int ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }


}

