/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class DbConnector {
    public static Connection getConnection() throws SQLException{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/diario?useTimezone=true&serverTimezone=UTC","root","123456");
        
        return con;
    }
}
