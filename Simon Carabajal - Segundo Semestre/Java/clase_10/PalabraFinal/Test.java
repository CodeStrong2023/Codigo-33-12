package clase_10.PalabraFinal;

import clase_10.PalabraFinal.domain.Persona;

public class Test {

    public static void main(String[] args) {

        final int Dni = 34789273;
        System.out.println("Dni:" + Dni);

        // Dni = 65789273; -> no se puede modificar

        // Persona.CONSTANTE_A = 7; -> no se puede modificar
        System.out.println("Atributo Constante: " + Persona.CONSTANTE_A);

        final Persona persona1 = new Persona();
        // persona1 = new Persona();  -> no se puede hacer referencia a un nuevo objeto

        // Si se puede modificar
        persona1.setNombre("Mauricio");
        System.out.println("nombre Persona1: " + persona1.getNombre());
        
        persona1.setNombre("Miranda");
        System.out.println("nombre Persona1: " + persona1.getNombre());

    }
}