
package medico;

public class ClinicoGeral extends Medico {
    private boolean atendeEmCasa;

    public boolean isAtendeEmCasa() {
        return atendeEmCasa;
    }

    public void setAtendeEmCasa(boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    }
    
    public void receitar() {
        System.out.println("O médico está receitando um remédio para o paciente.");
    }
    
}
