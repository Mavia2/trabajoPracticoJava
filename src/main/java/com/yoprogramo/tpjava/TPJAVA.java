/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.yoprogramo.tpjava;

/**
 *
 * @author pasqu
 */
public class TPJAVA {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Marcela", "Viana", "Programador web full stack junior", "34112346", "mavia2@gmail", "Estudiante de Programación FullStack, Relacionista Pública, Ceremonialista y Organizadora de Eventos", "www.mifoto.com");
        Domicilio domicilio1= new Domicilio();
        Domicilio domicilio2= new Domicilio("Catamarca", 123, 2, "a", "Rosario", "2000", "Santa Fe", "Argentina", 1);
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario(1,"Marcela","contrasecreta" , 1);
        Tecnologia tecnologia1= new Tecnologia();
        Tecnologia tecnologia2= new Tecnologia("Java", 30, 1);
        Experiencia experiencia1 = new Experiencia();
        Experiencia experiencia2 = new Experiencia ("Globant", null, "gerente", "full time", "desarrollo y supervision de proyectos en LA.", true, null, null, "Rosario", 1);
        Proyecto proyecto1 = new Proyecto();
        Proyecto proyecto2 = new Proyecto("Portofolio", "Angular, Java, etc", "es como un linkedin", "desarrollandola al 100%", true, "Argentina Programa", "www.porfolio.com", 1);
                
        
       
        
        
        
        persona2.trabajar();
        System.out.println("Hello World!");
        
        
        domicilio2.vivir();
        System.out.println(domicilio2.toString());
        System.out.println(domicilio1.toString());
        usuario2.bajar();
        usuario2.subir();
        
        System.out.println(usuario2.toString());
        usuario2.getIdPersona();
        System.out.println(" El nombre del usuario es: " + usuario2.getNombre());
        System.out.println(tecnologia1.getNombre());
        System.out.println("Ahora se programar en: "+ tecnologia2.getNombre());
        tecnologia1.setNombre("Angular");
        System.out.println("Ahora se programar en: " + tecnologia1.getNombre());
        tecnologia2.programar();
        experiencia2.trabajar();
        proyecto2.desarrollar();
        System.out.println(proyecto2.getCliente());
        proyecto1.setCliente("Inti");
        System.out.println("Hola, soy Proyecto 1 y ahora trabajo en un proyecto para el " + proyecto1.getCliente()+ ".");
        
        
    }

}
