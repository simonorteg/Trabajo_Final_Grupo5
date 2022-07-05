/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_final_inmobiliaria_g5;

/**
 *
 * @author mseba
 */
public class Propiedad_Inmueble {
    
  private  int idPropiedad;
  private String codigo;
   public Inquilino inquilino;
   public Propietario propietario;
  private String zona;
  private  String direccion;
  private double superficie;
  private String tipo;

   
  private double precio;
  boolean disponible;

    public Propiedad_Inmueble(/*int idPropiedad,*/ Inquilino inquilino, Propietario propietario, String zona, String direccion, double superficie, String tipo, double precio, boolean disponible) {
        //this.idPropiedad = idPropiedad;
        this.inquilino = inquilino;
        this.propietario = propietario;
        this.zona = zona;
        this.direccion = direccion;
        this.superficie = superficie;
        this.tipo = tipo;
        this.precio = precio;
        this.disponible = disponible;
        this.codigo = tipo+idPropiedad;
    }

    public Propiedad_Inmueble(Propietario propietario, String zona, String direccion, double superficie, String tipo, double precio, boolean disponible) {
       
        this.propietario = propietario;
        this.zona = zona;
        this.direccion = direccion;
        this.superficie = superficie;
        this.tipo = tipo;
        this.precio = precio;
        this.disponible = disponible;
    }

    public Propiedad_Inmueble() {
    }

    public int getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(int idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getCodigo() {
        return codigo;
    }
     public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
  

   
}


