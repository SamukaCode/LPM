package exfuncionario;

public class ExFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        f1.setNome("Samuel");
        f1.setSobrenome("Camargo");
        f1.setSalario(1000);
        
        f2.setNome("Robertinho");
        f2.setSobrenome("Silva");
        f2.setSalario(2000);
        
        System.out.printf("O salário anual de %s é R$%.2f\n",f1.getNome(),f1.getSalario()*12);
        System.out.printf("O salário anual de %s é R$%.2f\n\n",f2.getNome(),f2.getSalario()*12);
        System.out.println("Receberam 10% de aumento:\n");
        
        f1.setSalario(f1.getSalario()+(f1.getSalario())*0.1);
        f2.setSalario(f2.getSalario()+(f2.getSalario())*0.1);
        System.out.printf("O salário anual de %s agora é R$%.2f\n",f1.getNome(),f1.getSalario()*12);
        System.out.printf("O salário anual de %s agora é R$%.2f\n\n",f2.getNome(),f2.getSalario()*12);
    }
    
}
