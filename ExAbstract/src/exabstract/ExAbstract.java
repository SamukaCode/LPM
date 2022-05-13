
package exabstract;

import java.util.ArrayList;

public class ExAbstract {

   
    public static void main(String[] args) {
        double total=0;
        
        Assalariado a1 = new Assalariado(1000,"Davie","Fonseca","1235478");
        Assalariado a2 = new Assalariado(1800,"Samuel","Camargo","4789678");
        Comissionado c1 = new Comissionado(3000,0.15,"Pedro","Mello","1626356");
        Comissionado c2 = new Comissionado(4000,0.15,"Newton","Peninha","123937854");
        Horista h1 = new Horista(20,98,"Renato","Oliveira","1235857");
        Horista h2 = new Horista(20,95,"Felipe","Furlani","1843753");
        
        ArrayList <Empregado> lista = new ArrayList();
        lista.add(a1);
        lista.add(a2);
        lista.add(c1);
        lista.add(c2);
        lista.add(h1);
        lista.add(h2);
        
        
        
        for (Empregado e: lista) {
            if (e instanceof Comissionado) {
                Comissionado c =(Comissionado) e;
                total+=c.getTotalVenda();
            }
        }
        System.out.println("Total de vendas: R$ " + total);
        
    }
    
}
