package banco;

public class appContas {
    
        public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria();
        cb1.setCliente("Ivone");
        cb1.setNumConta(123456);
        cb1.setSaldo(37000);
        
        System.out.printf("A conta de %s, de número %d possui R$%.2f de saldo.\n",cb1.getCliente(),cb1.getNumConta(),cb1.getSaldo());
        
        ContaPoupanca cp1 = new ContaPoupanca();
        cp1.setCliente("Samuel");
        cp1.setDiaRendimento(5);
        cp1.setNumConta(567345);
        cp1.setSaldo(100000);
        
        System.out.printf("A conta de %s, de número %d e dia de rendimento %d possui R$%.2f de saldo.\n",cp1.getCliente(),cp1.getNumConta(),cp1.getDiaRendimento(),cp1.getSaldo());
        
        ContaEspecial ce1 = new ContaEspecial();
        ce1.setCliente("Newton");
        ce1.setLimite(-2500);
        ce1.setNumConta(564345);
        ce1.setSaldo(1000);
        
        System.out.printf("A conta de %s, de número %d e limite %.2f possui R$%.2f de saldo.\n\n\n",ce1.getCliente(),ce1.getNumConta(),ce1.getLimite(),ce1.getSaldo());
        
        cb1.depositar(200);
        cp1.depositar(3000);
        ce1.depositar(100);
        
        cb1.sacar(5000);
        cp1.sacar(7000);
        ce1.sacar(3000);
        
        cp1.calcularNovoSaldo(0.5);
        
        System.out.printf("A conta de %s, de número %d agora possui R$%.2f de saldo.\n",cb1.getCliente(),cb1.getNumConta(),cb1.getSaldo());
        System.out.printf("A conta de %s, de número %d agora possui R$%.2f de saldo.\n",cp1.getCliente(),cp1.getNumConta(),cp1.getSaldo());
        System.out.printf("A conta de %s, de número %d agora possui R$%.2f de saldo.\n",ce1.getCliente(),ce1.getNumConta(),ce1.getSaldo());
   
    }
    
}
