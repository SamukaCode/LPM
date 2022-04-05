
package exercicio1;

public class Computador {
    
    String marca;
    int cod;
    int sala;
    boolean perifericos;
    boolean atividade;
    
    void tirarPerifericos() {
        if (perifericos) {
            perifericos=false;
            System.out.println("Periféricos descadastrados.");
        }
        else {
            System.out.println("Erro: não há periféricos.");
        }
    }
    
    void manutencao() {
        if (atividade) {
            atividade=false;
            System.out.println("Computador em manutenção.");
        }
        else {
            System.out.println("Erro: o computador já está em manutenção.");
        }
    }
}
