package clase8;
/**
 * @author JessicaPagano
 */

public class Clase8 {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Manuel", 50000, false);

        // Modificar a traves de los metodos
        persona1.setNombre("Maria");
        System.out.println("El nombre de persona1 es: " + persona1.getNombre());
        System.out.println("El sueldo de persona1 es: " + persona1.getSueldo());
        System.out.println("La valor booleano de persona1 es: " + persona1.isEliminado());

        // persona1.nombre = "Maria"; -> ya no se puede usar, error en el acceso
        // System.out.println("El nombre de persona 1 es: "+persona1.nombre);
        // Tarea, segundo objeto
        Persona persona2 = new Persona("Ismael", 40500, true);

        // Modificar
        persona2.setNombre("Ramona");
        persona2.setSueldo(30000);
        persona2.setEliminado(false);

        // Mostrar
        System.out.println("El nombre de persona1 es: " + persona2.getNombre());
        System.out.println("El sueldo de persona1 es: " + persona2.getSueldo());
        System.out.println("La valor booleano de persona1 es: " + persona2.isEliminado());

    }
}
