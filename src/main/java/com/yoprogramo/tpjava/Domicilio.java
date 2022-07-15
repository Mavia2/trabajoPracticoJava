package com.yoprogramo.tpjava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Domicilio {
    
    //atributos
    private String calle; 
    private int numero; 
    private int piso;
    private String departamento;
    private String localidad;
    private String codigoPostal;
    private  String provincia;
    private String pais;
    private int idPersona;

//contructor vacio y con parametros

    public Domicilio() {
    }

    public Domicilio(String calle, int numero, int piso, String departamento, String localidad, String codigoPostal, String provincia, String pais, int idPersona) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
        this.pais = pais;
        this.idPersona = idPersona;
    }

// getters y setters 

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    // to string
    
    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", departamento=" + departamento + ", localidad=" + localidad + ", codigoPostal=" + codigoPostal + ", provincia=" + provincia + ", pais=" + pais + ", idPersona=" + idPersona + '}';
    }
    
    
    //metodo
    public void vivir () {
        System.out.println(" Vivo en " + localidad);
    }      
    
    


    
}
