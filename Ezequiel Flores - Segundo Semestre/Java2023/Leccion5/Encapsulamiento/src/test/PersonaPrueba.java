/*

 */
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57.000, false);
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 con su nombre: "+persona1.getNombre());
        //Modificar a traves de los metodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre ="Juan Ignacio", ya no se puede utilizar
        //System.out.println("Nombre es: "+persona1.nombre); // Error
        System.out.println("persona1 con su nombre modificado: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo:"+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano:"+persona1.isEliminado());
        //Tarea:Crear otro bojeto de tipo persona, asignar valores de manera inicial
        // e imprimir, luego modificar sus valores y volver a imprimir.
        System.out.println("persona1 = " + persona1);
    }
}
