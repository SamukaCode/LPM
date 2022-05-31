package marketsystem;

public class Cliente extends Pessoa implements IPessoa {

    public Cliente(String nome, int idade, int cpf, int telefone, String email) {
        super(nome, idade, cpf, telefone, email);
    }

    @Override
    public void exibir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
