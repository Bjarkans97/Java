package Persona.PruebaPersona;

import Persona.PersonaEN;

public class pruebaPersona {
    public static void main(String[] args) {
        System.out.println("**** Creacion de clase y objetos persona");
        var objeto1 = new PersonaEN();
        objeto1.nombre = "Benjamin";
        objeto1.apellidoP = "Ramírez";

        objeto1.mostrarPersona();
    }
}
