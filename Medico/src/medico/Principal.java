
package medico;

public class Principal {


    public static void main(String[] args) {
        Cirurgiao c1 = new Cirurgiao();
        c1.setTrabalhaHospital(true);
        
        ClinicoGeral cg1 = new ClinicoGeral();
        cg1.setTrabalhaHospital(false);
        cg1.setAtendeEmCasa(true);
        
        c1.atendePaciente();
        cg1.atendePaciente();
        c1.fazerIncisao();
    }
    
}
