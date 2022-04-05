package testafuncionarios;

public class Telefonistas extends Funcionario {
    int codEst;

    public int getCodEst() {
        return codEst;
    }

    public void setCodEst(int codEst) {
        this.codEst = codEst;
    }
    
    public String MostraDados(){
       
    return super.MostraDados() + ". Código de Estação de Trabalho: " + codEst ;
    }

    public Telefonistas(String nome, double salario, int codEst) {
        super(nome, salario);
        this.codEst = codEst;
    }
    

}
