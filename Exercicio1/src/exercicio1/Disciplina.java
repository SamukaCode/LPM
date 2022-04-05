package exercicio1;

public class Disciplina {
    
    String nome;
    int cod;
    int cargaH;
    String turno;
    
    void mudarTurno() {
        if (turno=="Diurno") {
            turno="Noturno";
            System.out.println("Turno alterado com sucesso para noturno.");
        }
        else {
            turno="Diurno";
            System.out.println("Turno alterado com sucesso para diurno.");
        }
    }
}
