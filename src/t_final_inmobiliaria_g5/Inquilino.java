/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_final_inmobiliaria_g5;

import java.util.ArrayList;

/**
 *
 * @author mseba
 */
class Inquilino {
    
    private int idInquilino;
    private long DNI;
    private String apellido;
    private String nombre;
    private char tipo;
    private char detalle;
    public ArrayList<Propiedad_Inmueble> inmuebles;

    public Inquilino(int idInquilino, int DNI, String apellido, String nombre, char tipo, char detalle, ArrayList<Propiedad_Inmueble> inmuebles) {
        this.idInquilino = idInquilino;
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
        this.tipo = tipo;
        this.detalle = detalle;
        this.inmuebles = inmuebles;
    }

    public Inquilino(int DNI, String apellido, String nombre, char tipo, char detalle, ArrayList<Propiedad_Inmueble> inmuebles) {
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
        this.tipo = tipo;
        this.detalle = detalle;
        this.inmuebles = inmuebles;
    }

    public Inquilino() {
    }

    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getDetalle() {
        return detalle;
    }

    public void setDetalle(char detalle) {
        this.detalle = detalle;
    }

    public ArrayList<Propiedad_Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Propiedad_Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }
    
    
    
}
