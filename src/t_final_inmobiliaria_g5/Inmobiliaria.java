/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_final_inmobiliaria_g5;

import conexion.Conexion;
import inmo_data.InquilinoData;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author mseba
 */
public class Inmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Conexion conexion = new Conexion();          
        Connection cn = conexion.getConexion();  
        
               
    }
    
    
    
    
}
