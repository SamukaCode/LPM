package marketsystem;

public class Funcionario extends Pessoa implements IPessoa {
    private String email;

    public Funcionario(long id, String nome, long idade, long cpf, long telefone, String email) {
        super(id, nome, idade, cpf, telefone);
        this.email = email;
    }

    @Override
    public void exibir() {
        System.out.printf("ID: %d | Nome:  %s | Idade:  %d | CPF: %d | Telefone:  %d | Email: %s |",getId(),getNome(),getIdade(),getCpf(),getTelefone(),getEmail());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
