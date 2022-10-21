package model;

public class Animal {
    private int id;
    private String nome;
    private String especie;
    private int idade;
    private double peso;
    
    public Animal(int id, String nome, String especie, int idade, double peso) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public Animal() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
   
}
