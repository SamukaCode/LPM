package testafuncionarios;

public class TESTAFUNCIONARIOS {

    public static void main(String[] args) {
        Gerentes g1 = new Gerentes("Roberto",15000,"robertinho12","senharoberto");
        
        System.out.printf("O aumento de %s será de R$%.2f\n",g1.getNome(),g1.CalculaBonificacao());
                
        Telefonistas t1 = new Telefonistas("Cláudia",2100,12);
        
        System.out.printf("O aumento de %s será de R$%.2f\n",t1.getNome(),t1.CalculaBonificacao());
        
        Secretarias s1 = new Secretarias("Ivone",1800,556);
        
        System.out.printf("O aumento de %s será de R$%.2f\n",s1.getNome(),s1.CalculaBonificacao());
        System.out.println(g1.MostraDados());
        System.out.println(t1.MostraDados());
        System.out.println(s1.MostraDados());
        
    }
    
}
