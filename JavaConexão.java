
package desktoptreino;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConexão {
    
public static void main(String[] args) throws SQLException {
    
        Connection conexao = new ConnectionFactory().getConnection();
        System.out.println("Conectado!");
        conexao.close();
    }
}
