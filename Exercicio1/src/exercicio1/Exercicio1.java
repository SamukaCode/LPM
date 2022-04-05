package exercicio1;

public class Exercicio1 {
    
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Disciplina disciplina1 = new Disciplina();
        Disciplina disciplina2 = new Disciplina();
        Computador pc1 = new Computador();
        Computador pc2 = new Computador();
        
        aluno1.nome = "Roberto Marinho";
        aluno1.ra = 123456;
        aluno1.matri = true;
        aluno1.nascimento = "20/10/2005";
        aluno1.cancelaMatr();
        
        aluno2.nome = "Cláudio Silva";
        aluno2.ra = 435645;
        aluno2.matri = false;
        aluno2.nascimento = "14/06/2005";
        
        disciplina1.nome = "Matemática";
        disciplina1.cod = 12;
        disciplina1.cargaH = 400;
        disciplina1.turno = "Diurno";
        disciplina1.mudarTurno();
        
        disciplina2.nome = "Mecânica";
        disciplina2.cod = 18;
        disciplina2.cargaH = 300;
        disciplina2.turno = "Noturno";
        
        pc1.marca = "HP";
        pc1.cod = 29;
        pc1.sala = 12;
        pc1.perifericos = true;
        pc1.atividade = true;
        pc1.manutencao();
        
        pc2.marca = "Positivo";
        pc2.cod = 32;
        pc2.sala = 10;
        pc2.perifericos = true;
        pc2.atividade = false;
        pc2.tirarPerifericos();
        
    }
    
}
