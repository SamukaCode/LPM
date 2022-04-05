package expessoa;


public class ExPessoa {

  
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(14,3,1879,"Albert Einstein");
        Pessoa p2 = new Pessoa(4,1,1643,"Isaac Newton");
        p1.calculaIdade();
        p2.calculaIdade();
        System.out.printf("Idade de %s caso estivesse vivo: %d anos.\n",p1.informaNome(),p1.informaIdade());
        System.out.printf("Idade de %s caso estivesse vivo: %d anos.\n",p2.informaNome(),p2.informaIdade());
    }
    
}
