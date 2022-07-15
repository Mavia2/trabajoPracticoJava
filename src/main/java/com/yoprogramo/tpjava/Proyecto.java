/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.tpjava;

/**
 *
 * @author pasqu
 */
public class Proyecto {
    private String nombre; 
    private String tecnologias;
    private String descripcion;
    private String tipoParticipación;
    private Boolean esProyectoActual;
    private String cliente;
    private String linkProyecto;
    private int idPersona; 

//constructor vacio y con parametros

    public Proyecto() {
    }

    public Proyecto(String nombre, String tecnologias, String descripcion, String tipoParticipación, Boolean esProyectoActual, String cliente, String linkProyecto, int idPersona) {
        this.nombre = nombre;
        this.tecnologias = tecnologias;
        this.descripcion = descripcion;
        this.tipoParticipación = tipoParticipación;
        this.esProyectoActual = esProyectoActual;
        this.cliente = cliente;
        this.linkProyecto = linkProyecto;
        this.idPersona = idPersona;
    }

    // getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoParticipación() {
        return tipoParticipación;
    }

    public void setTipoParticipación(String tipoParticipación) {
        this.tipoParticipación = tipoParticipación;
    }

    public Boolean getEsProyectoActual() {
        return esProyectoActual;
    }

    public void setEsProyectoActual(Boolean esProyectoActual) {
        this.esProyectoActual = esProyectoActual;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getLinkProyecto() {
        return linkProyecto;
    }

    public void setLinkProyecto(String linkProyecto) {
        this.linkProyecto = linkProyecto;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    
    //tostring

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", tecnologias=" + tecnologias + ", descripcion=" + descripcion + ", tipoParticipaci\u00f3n=" + tipoParticipación + ", esProyectoActual=" + esProyectoActual + ", cliente=" + cliente + ", linkProyecto=" + linkProyecto + ", idPersona=" + idPersona + '}';
    }
     
//metodo
    public void desarrollar () {
        System.out.println(" Ahora estoy desarrolando el proyecto " + nombre + " con tecnologia " + tecnologias );
    }      


}


