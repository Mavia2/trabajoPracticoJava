/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.tpjava;

/**
 *
 * @author pasqu
 */
 public class Tecnologia {
    private String nombre;
    private int porcConocimiento;
    private int idPersona;
  
 // constructor vacio y con parametros

    public Tecnologia() {
    }
  
    public Tecnologia(String nombre, int porcConocimiento, int idPersona) {
        this.nombre = nombre;
        this.porcConocimiento = porcConocimiento;
        this.idPersona = idPersona;
    }
 
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcConocimiento() {
        return porcConocimiento;
    }

    public void setPorcConocimiento(int porcConocimiento) {
        this.porcConocimiento = porcConocimiento;
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
        return "Tecnologia{" + "nombre=" + nombre + ", porcConocimiento=" + porcConocimiento + ", idPersona=" + idPersona + '}';
    }
    
    //metodo
    public void programar(){
        System.out.println ("Estoy programando con " + nombre);
    }
    
 
}

