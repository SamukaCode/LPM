package medico;

public class Cirurgiao extends Medico {

    @Override
    public void atendePaciente() {
        System.out.println("O cirurgião está atendendo o paciente.");
    }
    
    public void fazerIncisao() {
        System.out.println("O cirurgião está fazendo uma incisão, cuidado!");
    }
}
