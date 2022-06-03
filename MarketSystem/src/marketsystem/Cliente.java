package marketsystem;

public class Cliente extends Pessoa implements IPessoa {

    public Cliente(int id, String nome, int idade, int cpf, int telefone) {
        super(id, nome, idade, cpf, telefone);
    }

    @Override
    public void exibir() {
        System.out.printf("| %d | %s | %d | %d | %d | ",getId(),getNome(),getIdade(),getCpf(),getTelefone());
    }
}
