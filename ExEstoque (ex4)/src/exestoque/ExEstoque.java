package exestoque;

public class ExEstoque {

    public static void main(String[] args) {
            Estoque estoque1 = new Estoque("Impressora",13,6);
            Estoque estoque2 = new Estoque("Monitor",11,13);
            Estoque estoque3 = new Estoque("Mouse",6,2);
            
            /*Dar baixa em 5 unidades de estoque1.
b. Fazer a reposição de 7 unidades de estoque2.
c. Dar baixa em 4 unidades de estoque3.
d. Exibir a saída do método precisaRepor dos 3 objetos.
e. Exibir a saída do método mostra para apresentar as informações sobre os 3
objetos.*/

          estoque1.darBaixa(5);
          estoque2.repor(7);
          estoque3.darBaixa(4);
          System.out.printf("Precisa repor o estoque 1? %b. Precisa repor o estoque 2? %b. Precisa repor o estoque 3? %b",estoque1.precisaRepor(),estoque2.precisaRepor(),estoque3.precisaRepor());
          System.out.println(estoque1.mostra());
          System.out.println(estoque2.mostra());
          System.out.println(estoque3.mostra());
    }
    
}
