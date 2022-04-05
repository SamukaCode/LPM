package demo4;


public class Cliente {
    //atributos
    String nome;
    int idade;
    String cpf;
    boolean deMaior;
    
    //métodos
    void verifica() {
        if(idade>=18)
            deMaior = true;
        else
            deMaior = false;

    }
}
