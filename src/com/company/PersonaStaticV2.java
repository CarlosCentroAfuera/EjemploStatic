package com.company;

public class PersonaStaticV2 {


    public String nombre = "";

    public static void diTuNombre() {
        // Esto no se puede hacer ya que nombre se crea cuando se crea una variable de tipo PersonaStaticV2 y sin,
        // sin embargo, diTuNombre se puede llamar sin que ninguna variable de tipo static haya sido creada
        // System.out.println(nombre);
    }



}
