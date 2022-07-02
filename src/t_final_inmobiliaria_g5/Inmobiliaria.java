/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_final_inmobiliaria_g5;

import conexion.Conexion;
import inmo_data.Propiedad_Inmueble_Data;
import java.sql.Connection;
import java.util.ArrayList;

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
        
         Propiedad_Inmueble_Data pIm = new Propiedad_Inmueble_Data(conexion);
        
    /*    Propietario propie = new Propietario();
        propie.setDNI(1234);
        
        Propiedad_Inmueble prop = new Propiedad_Inmueble(propie, "Sur","Calle algo", 43.56, "V", 567.56,true);
        
     
        pIm.cargarInmueble(prop, 1234);
*/
    
        ArrayList<Propiedad_Inmueble> disponibles = new ArrayList<>();
               disponibles = pIm.buscarInmDisponibles();
               
               for (Propiedad_Inmueble disponible : disponibles) {
                   System.out.println(disponible.getCodigo());
            
        }
    
      
    }
    
    
    
}
