/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_final_inmobiliaria_g5;

import java.time.LocalDate;

/**
 *
 * @author mseba
 */
public class ContratoAlquiler {
    private int codContrato;
    private String vendedor;
    private char marca;
    public Propiedad_Inmueble propiedad;
    public Inquilino inquilino;
    private LocalDate fecha_Inicio;
    private LocalDate fecha_Final;
    private LocalDate fechaRealizacion;
    //boolean vigente;           // No esta en el uml pero me parece que va a hacer falta
    
    public ContratoAlquiler(int codContrato, String vendedor, char marca, Propiedad_Inmueble propiedad, Inquilino inquilino, LocalDate fecha_Inicio, LocalDate fecha_Final, LocalDate fechaRealizacion) {
        this.codContrato = codContrato;
        this.vendedor = vendedor;
        this.marca = marca;
        this.propiedad = propiedad;
        this.inquilino = inquilino;
        this.fecha_Inicio = fecha_Inicio;
        this.fecha_Final = fecha_Final;
        this.fechaRealizacion = fechaRealizacion;
       // this.vigente =  LocalDate.now().isBefore(this.fecha_Final); //si se usa atributo vigente
    }

    public ContratoAlquiler(String vendedor, char marca, Propiedad_Inmueble propiedad, Inquilino inquilino, LocalDate fecha_Inicio, LocalDate fecha_Final, LocalDate fechaRealizacion) {
        this.vendedor = vendedor;
        this.marca = marca;
        this.propiedad = propiedad;
        this.inquilino = inquilino;
        this.fecha_Inicio = fecha_Inicio;
        this.fecha_Final = fecha_Final;
        this.fechaRealizacion = fechaRealizacion;
        //this.vigente =  (LocalDate.now().isBefore(this.fecha_Final)||LocalDate.now()==this.fecha_Final );  // //si se usa atributo vigente
    }

    public ContratoAlquiler() {
    }

    public int getCodContrato() {
        return codContrato;
    }

    public void setCodContrato(int codContrato) {
        this.codContrato = codContrato;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public char getMarca() {
        return marca;
    }

    public void setMarca(char marca) {
        this.marca = marca;
    }

    public Propiedad_Inmueble getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad_Inmueble propiedad) {
        this.propiedad = propiedad;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public LocalDate getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(LocalDate fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public LocalDate getFecha_Final() {
        return fecha_Final;
    }

    public void setFecha_Final(LocalDate fecha_Final) {
        this.fecha_Final = fecha_Final;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
    
    
    
}
