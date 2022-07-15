/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.tpjava;
import java.sql.Blob;
import java.util.Date;

//declaro atributos
public class Educacion {
   private String tipoEducacion;
   private String institucion; 
   private String titulo;
   private boolean recibio;
   private Date fechaInicio;
   private Date fechaFin;
   private Boolean cursando;
   private Blob fotoInstitucion;
   private int idPersona;
   
   //constructor vacio y con parametros . getters y setters/ tostring

    public Educacion() {
    }

    public Educacion(String tipoEducacion, String institucion, String titulo, boolean recibio, Date fechaInicio, Date fechaFin, Boolean cursando, Blob fotoInstitucion, int idPersona) {
        this.tipoEducacion = tipoEducacion;
        this.institucion = institucion;
        this.titulo = titulo;
        this.recibio = recibio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cursando = cursando;
        this.fotoInstitucion = fotoInstitucion;
        this.idPersona = idPersona;
    }

    public String getTipoEducacion() {
        return tipoEducacion;
    }

    public void setTipoEducacion(String tipoEducacion) {
        this.tipoEducacion = tipoEducacion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isRecibio() {
        return recibio;
    }

    public void setRecibio(boolean recibio) {
        this.recibio = recibio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getCursando() {
        return cursando;
    }

    public void setCursando(Boolean cursando) {
        this.cursando = cursando;
    }

    public Blob getFotoInstitucion() {
        return fotoInstitucion;
    }

    public void setFotoInstitucion(Blob fotoInstitucion) {
        this.fotoInstitucion = fotoInstitucion;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Educacion{" + "tipoEducacion=" + tipoEducacion + ", institucion=" + institucion + ", titulo=" + titulo + ", recibio=" + recibio + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cursando=" + cursando + ", fotoInstitucion=" + fotoInstitucion + ", idPersona=" + idPersona + '}';
    }
   
   
   
   
   
   // metodos
   
public void graduar () {
        System.out.println(" Me recibí en  " + titulo);
    }      
   

   
   
   

    
}
