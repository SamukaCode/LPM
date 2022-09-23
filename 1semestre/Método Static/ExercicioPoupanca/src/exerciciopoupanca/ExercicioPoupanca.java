package exerciciopoupanca;

public class ExercicioPoupanca {

    public static void main(String[] args) {
        Poupanca p1 = new Poupanca(2000);
        Poupanca p2 = new Poupanca(3000);
        
        Poupanca.modificaTaxaJuro(3);
        p1.calcularJurosMensais();
        p2.calcularJurosMensais();
        System.out.println("Saldo da conta 1: R$" + p1.getSaldo());
        System.out.println("Saldo da conta 2: R$" + p2.getSaldo());
        
        Poupanca.modificaTaxaJuro(4);
        p1.calcularJurosMensais();
        p2.calcularJurosMensais();
        System.out.println("Saldo da conta 1 no próximo mês: R$" + p1.getSaldo());
        System.out.println("Saldo da conta 2 no próximo mês: R$" + p2.getSaldo());
    }
    
}
