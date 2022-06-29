/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author saimon
 */
public class Conexion {
    private String url = "jdbc:mysql://localhost/inmobiliaria";
    private String usuario = "root";
    private String password = "";

    private Connection conexion;

    public Conexion(){
       try{
           
        Class.forName("org.mariadb.jdbc.Driver");//equivale a un  new org.mariadb.jdbc.Driver();
      
       
       }catch(ClassNotFoundException ex){
           JOptionPane.showMessageDialog(null,"Error al cargar drivers de conexion");
       }
      

    }
    
    

    public Connection getConexion() {
        
        try{
             if (conexion == null) {
            // Setup the connection with the DB
            conexion = DriverManager
                    .getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                            + "&user=" + usuario + "&password=" + password);
        }
        }catch(SQLException ex){
              JOptionPane.showMessageDialog(null,"Error al conectarse a la Base de Datos");
        }
       
        return conexion;
    }
    
 
         
}
   


    

