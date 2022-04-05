package exheranca;

public class ExHeranca {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Samuel", 16);
        /*p1.setNome("Samuel");
        p1.setIdade(16);*/
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        
        Aluno al1 = new Aluno("Davie",16,123456);
        /*al1.setNome("Davie");
        al1.setIdade(16);*/
        System.out.println("Nome: " + al1.getNome());
        System.out.println("Idade: " + al1.getIdade());
        //al1.setRa(123456);
        System.out.println("RA: " + al1.getRa());
        al1.mostra();
        
        Professor prof1 = new Professor("Barreto",38,1000);
        /*prof1.setNome("Barreto");
        prof1.setIdade(38);
        prof1.setSalario(1000);*/
        System.out.println("Nome: " + prof1.getNome());
        System.out.println("Idade: " + prof1.getIdade());
        System.out.println("Salário: " + prof1.getSalario());
        
        Bolsista b = new Bolsista("Guilherme", 16, 1234, 100);
        b.mostra();
        
        
        
    }
    
}
