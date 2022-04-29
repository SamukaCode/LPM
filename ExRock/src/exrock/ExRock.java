package exrock;

import java.util.ArrayList;

public class ExRock {

    public static void main(String[] args) {
        double faturamento=0;
        VIP v1 = new VIP(980,200);
        VIP v2 = new VIP(980,200);
        Comum c1 = new Comum(980);
        Comum c2 = new Comum(980);
        VIP v3 = new VIP(980,200);
        
        ArrayList <Ingresso> lista = new ArrayList();
        lista.add(v1);
        lista.add(v2);
        lista.add(v3);
        lista.add(c1);
        lista.add(c2);
        
        for (Ingresso i: lista) {
            if (i instanceof Comum) {
                Comum c = (Comum) i;
                faturamento+=c.imprimeValor();
            }
            if (i instanceof VIP) {
                VIP v = (VIP) i;
                faturamento+=v.imprimeValor();
            }
        }
        System.out.println("Faturamento total: R$" + faturamento);

    }
    
}
