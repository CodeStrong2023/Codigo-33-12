
package test;

import domain.Persona;

public class TestPersona {
    public static void main(String[] args) {

        Persona personas[] = new Persona[2];

        personas[0] = new Persona("Miguel");
        personas[1] = new Persona("Miranda");

        System.out.println("personas 1: " + personas[0]);
        System.out.println("personas 2: " + personas[1]);

        System.out.println("");

        for(int i = 0; i < personas.length; i++){
            System.out.println("persona - " + i + ": " + personas[i]);
        }

        System.out.println("");
        // Trabajamos con arreglos en la sintaxis resumida
        String frutas[] = {"Manzana", "Banana", "Naranja"};
        for(int i = 0; i < frutas.length; i++){
            System.out.println("fruta - " + i + ": " + frutas[i]);
        }
    }
}
