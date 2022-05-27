package exgetset;

public class ExGetSet {

    public static void main(String[] args) {
        
        Professor pf1 = new Professor();
        pf1.setNome("Gilberto");
        pf1.setCpf(1258976435);
        pf1.setFixo(true);
        System.out.println("O nome do professor é: " + pf1.getNome());
        System.out.println("O CPF do professor é:" + pf1.getCpf());
        System.out.println("O professor é fixo?" + pf1.getFixo());
    }
    
}
