package com.company;

public class Main {

    public static void main(String[] args) {
        Persona carlos = new Persona();
        carlos.nombre = "Carlos";
        carlos.diTuNombre();
        Persona sergio = new Persona();
        sergio.nombre = "Sergio";
        sergio.diTuNombre();

        System.out.println("Hola, somos " + carlos.nombre + " y " + sergio.nombre);



        PersonaStatic javi = new PersonaStatic();
        PersonaStatic.nombre = "Javier";
        javi.diTuNombre();
        PersonaStatic ignacio = new PersonaStatic();
        PersonaStatic.nombre = "Ignacio";
        ignacio.diTuNombre();

        System.out.println("Hola, somos " + PersonaStatic.nombre + " y " + PersonaStatic.nombre);


        PersonaStaticV2.diTuNombre();

    }
}
