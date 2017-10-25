/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectamss;

import java.sql.*;

/**
 *
 * @author Jose
 */
public class FinalProjectAMSS {
    private static final String username = "root";
    private static final String password = "alvarado";
    private static final String Conn_string = "jdbc:mysql://localhost:3306/bddpf";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(Conn_string, username, password);
            System.out.println("Connected!");
        } catch(SQLException e){
            System.err.println(e);
        }
        InterfaceForm pantalla = new InterfaceForm();
        pantalla.setVisible(true);
    }
    
}
