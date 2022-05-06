package exeabstract;

public abstract class Animal {
    private String nome;
    
    public abstract void falar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
