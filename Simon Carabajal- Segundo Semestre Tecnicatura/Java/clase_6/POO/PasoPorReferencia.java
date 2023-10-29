package clase_6.POO;

import clase_4.clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); // Acceder a los atributos de la clase persona
        persona1.nombre = "Ana";
        System.out.println("persona1: " + persona1.nombre);
        cambiarValor1(persona1);
        System.out.println("El nombre en persona1 cambio a " + persona1.nombre);
        persona1 = cambiarValor2(persona1);
//        Persona persona2 = null;
//        persona2 = cambiarValor2(persona2);
    }

    public static void cambiarValor1(Persona persona) { // parametro por referencia
        persona.nombre = "José";
        // return; no es requerido en este caso porque no retorna nada
    }

    public static Persona cambiarValor2(Persona persona) {
        // return; no va al comienzo porque anula el código posterior
        if (persona == null) {
            System.out.println("El valor de persona no es válido --- NULL");
            return null;
        } else {
            persona.nombre = "Mónica";
            return persona;
        }
    }
}