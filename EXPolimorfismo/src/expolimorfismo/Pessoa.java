package expolimorfismo;

public class Pessoa {
    private String nome;
    
    public final void mostraDados() {
        System.out.println("É um pessoa.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
