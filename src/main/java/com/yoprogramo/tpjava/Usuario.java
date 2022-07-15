/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.tpjava;


public class Usuario {
    
    //atributos
       private int idUsuario;
       private String nombre;
       private String contrasenia;
       private int idPersona;
       
       
       
       //constructor vacio y con parametros. Getters y setters

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String contrasenia, int idPersona) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.idPersona = idPersona;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", contrasenia=" + contrasenia + ", idPersona=" + idPersona + '}';
    }
       
       
       
       
       
       //metodos
       public void bajar() {
        System.out.println(" Me estoy dando de baja.");
    }
       public void subir() {
        System.out.println(" Me estoy dando de alta.");
    }
    
}
