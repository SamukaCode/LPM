package conexao;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author taniabasso
 */
public class Conexao {
    public Connection getConnection() {    
       String url = "jdbc:mysql://143.106.241.3:3306/cl201278";
       String usuario = "cl201278";
       String senha = "cl*03082005";
        try {  
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            System.out.println("Erro de conexão "+ ex.toString());
            exit (1);
            return null;
        }
    } 
}