
package com.yoprogramo.tpjava;

public class Persona {
    
    //declaro atributos
    private String nombre;
    private String apellido;
    private String profesion;
    private String telefono;
    private String correo;
    private String acercaDe;
    private String urlFoto;

    //constructores constructor vacio y constructor con parametros
    public Persona() {
    }

    public Persona(String nombre, String apellido, String profesion, String telefono, String correo, String acercaDe, String urlFoto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.telefono = telefono;
        this.correo = correo;
        this.acercaDe = acercaDe;
        this.urlFoto = urlFoto;
    }
    
    
    // getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getAcercaDe() {
        return acercaDe;
    }

    public void setAcercaDe(String acercaDe) {
        this.acercaDe = acercaDe;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    //toString
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", profesion=" + profesion + ", telefono=" + telefono + ", correo=" + correo + ", acercaDe=" + acercaDe + ", urlFoto=" + urlFoto + '}';
    }
    
    
    
    //metodos
    
    public void trabajar () {
        System.out.println(" Soy " + profesion);
        
        
    }      
}
    
    

