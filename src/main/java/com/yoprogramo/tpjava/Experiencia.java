/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.tpjava;
import java.sql.Blob;
import java.util.Date;

//atributos

public class Experiencia {
    private String empresa; 
    private Blob logoEmpresa; 
    private String cargo;
    private String tipoEmpleo;
    private String descripcion;
    private Boolean esTrabajoActual;
    private Date fechaInicio;
    private Date fechaFin;
    private String localidad;
    private int idPersona;
    
    // constructor vacio y con parametros

    public Experiencia() {
    }

    public Experiencia(String empresa, Blob logoEmpresa, String cargo, String tipoEmpleo, String descripcion, Boolean esTrabajoActual, Date fechaInicio, Date fechaFin, String localidad, int idPersona) {
        this.empresa = empresa;
        this.logoEmpresa = logoEmpresa;
        this.cargo = cargo;
        this.tipoEmpleo = tipoEmpleo;
        this.descripcion = descripcion;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.localidad = localidad;
        this.idPersona = idPersona;
    }
    
    //getters y setters

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Blob getLogoEmpresa() {
        return logoEmpresa;
    }

    public void setLogoEmpresa(Blob logoEmpresa) {
        this.logoEmpresa = logoEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTipoEmpleo() {
        return tipoEmpleo;
    }

    public void setTipoEmpleo(String tipoEmpleo) {
        this.tipoEmpleo = tipoEmpleo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEsTrabajoActual() {
        return esTrabajoActual;
    }

    public void setEsTrabajoActual(Boolean esTrabajoActual) {
        this.esTrabajoActual = esTrabajoActual;
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

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
     //tosttring

    @Override
    public String toString() {
        return "Experiencia{" + "empresa=" + empresa + ", logoEmpresa=" + logoEmpresa + ", cargo=" + cargo + ", tipoEmpleo=" + tipoEmpleo + ", descripcion=" + descripcion + ", esTrabajoActual=" + esTrabajoActual + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", localidad=" + localidad + ", idPersona=" + idPersona + '}';
    }
    
    //metodo
    
    public void trabajar () {
        System.out.println(" Trabajo en " + empresa + " como " + cargo + " y me dedico a " + descripcion);
        
    }   
        
   
    
}
 





