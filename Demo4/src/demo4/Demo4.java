package demo4;


public class Demo4 {


    public static void main(String[] args) {
        //criando uma instância(objeto)
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();
        Veiculo carro = new Veiculo();
        
        cli1.nome = "Jorgin";
        cli1.idade = 28;
        cli1.cpf = "12345";
        cli1.deMaior = false;
        cli1.verifica();
        System.out.println("Valor do atributo deMaior: " + cli1.deMaior);
        
        cli2.nome = "Robertinho";
        cli2.idade = 15;
        cli2.cpf = "45678";
        cli2.deMaior = false;
        System.out.println("Valor do atributo deMaior: " + cli2.deMaior);
        
        carro.cor = "azul";
        carro.marca = "chevrolet";
        carro.dirigir();
        System.out.println("Cor: " + carro.cor);
    }
    
}
