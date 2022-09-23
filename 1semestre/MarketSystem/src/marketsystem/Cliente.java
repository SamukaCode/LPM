package marketsystem;

public class Cliente extends Pessoa implements IPessoa {

    public Cliente(long id, String nome, long idade, long cpf, long telefone) {
        super(id, nome, idade, cpf, telefone);
    }

    @Override
    public void exibir() {
        System.out.printf("ID: %d | Nome: %s | Idade: %d | CPF: %d | Telefone: %d\n",getId(),getNome(),getIdade(),getCpf(),getTelefone());
    }
}
