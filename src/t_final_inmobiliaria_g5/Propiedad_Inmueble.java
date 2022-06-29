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
    
  private  int idLocal;
  private  String accesibilidad;
  private String caracteristicas;
  private  String direccion;
  private  String zona;
  private  char estadoLocal;
  private  char tipoDeLocal;
 
  private  int superficieMinima;
  private  String forma;
  private  float precioTazado;
// public Inspector revisor;      en el uml no existe la clase y en las cosnignas no figura revisor...preguntar porque esta el atriburo
    
   public Inquilino ocupante;
   public Propietario dueño;

    public Propiedad_Inmueble(int idLocal, String accesibilidad, String caracteristicas, String direccion, String zona, char estadoLocal, char tipoDeLocal, int superficieMinima, String forma, float precioTazado, Inquilino ocupante, Propietario dueño) {
        this.idLocal = idLocal;
        this.accesibilidad = accesibilidad;
        this.caracteristicas = caracteristicas;
        this.direccion = direccion;
        this.zona = zona;
        this.estadoLocal = estadoLocal;
        this.tipoDeLocal = tipoDeLocal;
        this.superficieMinima = superficieMinima;
        this.forma = forma;
        this.precioTazado = precioTazado;
        this.ocupante = ocupante;
        this.dueño = dueño;
    }

    public Propiedad_Inmueble(String accesibilidad, String caracteristicas, String direccion, String zona, char estadoLocal, char tipoDeLocal, int superficieMinima, String forma, float precioTazado, Inquilino ocupante, Propietario dueño) {
        this.accesibilidad = accesibilidad;
        this.caracteristicas = caracteristicas;
        this.direccion = direccion;
        this.zona = zona;
        this.estadoLocal = estadoLocal;
        this.tipoDeLocal = tipoDeLocal;
        this.superficieMinima = superficieMinima;
        this.forma = forma;
        this.precioTazado = precioTazado;
        this.ocupante = ocupante;
        this.dueño = dueño;
    }

    public Propiedad_Inmueble() {
    }

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public String getAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(String accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public char getEstadoLocal() {
        return estadoLocal;
    }

    public void setEstadoLocal(char estadoLocal) {
        this.estadoLocal = estadoLocal;
    }

    public char getTipoDeLocal() {
        return tipoDeLocal;
    }

    public void setTipoDeLocal(char tipoDeLocal) {
        this.tipoDeLocal = tipoDeLocal;
    }

    public int getSuperficieMinima() {
        return superficieMinima;
    }

    public void setSuperficieMinima(int superficieMinima) {
        this.superficieMinima = superficieMinima;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public float getPrecioTazado() {
        return precioTazado;
    }

    public void setPrecioTazado(float precioTazado) {
        this.precioTazado = precioTazado;
    }

    public Inquilino getOcupante() {
        return ocupante;
    }

    public void setOcupante(Inquilino ocupante) {
        this.ocupante = ocupante;
    }

    public Propietario getDueño() {
        return dueño;
    }

    public void setDueño(Propietario dueño) {
        this.dueño = dueño;
    }
    
    
   
    
    
}


