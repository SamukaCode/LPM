
package testafuncionarios;

public class Gerentes extends Funcionario {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public double CalculaBonificacao() {
        return getSalario() * 0.2;
    }
    
    @Override
    public String MostraDados(){
       
    return super.MostraDados() + ". Username: " + username + ". Senha: " + password;
    
    }

    public Gerentes(String nome, double salario,String username, String password) {
        super(nome, salario);
        this.username = username;
        this.password = password;
    }
    
    
}
