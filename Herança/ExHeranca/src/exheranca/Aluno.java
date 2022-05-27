
package exheranca;

public class Aluno extends Pessoa{
    private int ra;
    
    public Aluno(String nome, int idade, int ra)
    {
        super (nome, idade);
        this.ra = ra;
    }
    
    @Override
    public void mostra() {
        super.mostra();
        System.out.println("É um aluno.");
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
}
