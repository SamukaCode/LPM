package marketsystem;

public class Funcionario extends Pessoa implements IPessoa {

    public Funcionario(int id, String nome, int idade, int cpf, int telefone) {
        super(id, nome, idade, cpf, telefone);
    }

    @Override
    public void exibir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
