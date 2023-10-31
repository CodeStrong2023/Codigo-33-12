package Java_segun;

public class Clase8_ej1 {
    public static void main(String[] args) {
        Clase7_ej3 persona1 = new Clase7_ej3("Osvaldo", 57.000, false);
        System.out.printf("El nombre de la persona1 es: " + persona1.getNombre());
        System.out.println("");
        persona1.setNombre("Juan Ignacio");
        System.out.printf("El nombre cambiado de la persona1 es: "+ persona1.getNombre());
        System.out.println("");
        System.out.printf("El sueldo de la persona1 es: " + persona1.getSueldo());
        System.out.println("");
        System.out.printf("El booleano de la persona1 es: " + persona1.IsEliminado());
        System.out.println("");

        Clase7_ej3 persona2= new Clase7_ej3("Roberto", 230, true);
        System.out.printf("El nombre de la persona2 es: "+ persona2.getNombre());
        System.out.println("");
        System.out.printf("El sueldo de la persona2 es: " + persona2.getSueldo());
        System.out.println("");
        System.out.printf("El booleano de la persona2 es: " + persona2.IsEliminado());
        System.out.println("");
        persona2.setEliminado(false);
        persona2.setNombre("Lucas");
        persona2.setSueldo(240.000);
        System.out.printf("El nombre cambiado de la persona2 es: "+ persona2.getNombre());
        System.out.println("");
        System.out.printf("El sueldo cambiado de la persona2 es: " + persona2.getSueldo());
        System.out.println("");
        System.out.printf("El booleano cambiado de la persona2 es: " + persona2.IsEliminado());
        System.out.println("");

        System.out.printf("persona1: " + persona1 );
        System.out.println("");
        System.out.printf("persona2: " + persona2 );



    }
    
}
