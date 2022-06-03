package marketsystem;

public class Cliente extends Pessoa implements IPessoa {
    
    private String email;

    public Cliente(String email, int id, String nome, int idade, int cpf, int telefone) {
        super(id, nome, idade, cpf, telefone);
        this.email = email;
    }

    @Override
    public void exibir() {
        System.out.printf("| %d | %s | %d | %d | %d | %s |",getId(),getNome(),getIdade(),getCpf(),getTelefone(),getEmail());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
