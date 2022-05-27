/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste2;

/**
 *
 * @author aluno
 */
public class Aluno {
    private int ra;
    private String nome;
    
    public Aluno()
    {
        ra = 0;
        nome = "";
    }
    
    public Aluno(int ra, String nome)
    {
        this.ra = ra;
        this.nome = nome;
    }
    
    public Aluno(int ra)
    {
        this.ra = ra;
        this.nome = "";
    }
    
    public Aluno (String nome)
    {
        this.ra = 0;
        this.nome = nome;
    }
    
    
    
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void verifica(int ra) {
        if (ra<0)
            System.out.println("Erro");
        else
            this.ra = ra;
    }
    
    public void verifica(String nome) {
        if (nome.equals(""))
            System.out.println("Erro");
        else
            this.nome = nome;
    }
    
}
