package marketsystem;

public class Funcionario extends Pessoa implements IPessoa {
    private String email;

    public Funcionario(int id, String nome, int idade, int cpf, int telefone, String email) {
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
