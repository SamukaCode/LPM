package controller;

import model.Aluno;
import java.util.ArrayList;

public class AlunoController {
    private ArrayList<Aluno> lista;
            
    public AlunoController() {
     lista = new ArrayList();
}
    
    public void cadastrar (String nome, int idade) {
        Aluno al = new Aluno(nome, idade);
        lista.add(al);
        mostrar();
    }
    
    public void mostrar() {
        for (Aluno a: lista) {
            System.out.println(a.getNome() + " | " + a.getIdade() + "\n");
        }
    }
    
}
