package clase_4.clases;

public class Prueba {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona(); 
        // Llamamos al constructor, la variable pasa a ser un objeto, ermite asignar valores al objeto

        persona1.nombre = "Simon";
        persona1.apellido = "Carabajal";
        persona1.obtenerInfo();
        
        // Variable: cuando se termina la ejecución, la variable se destruye.

        Persona persona2 = new Persona();
        persona2.nombre = "Agustin";
        persona2.apellido = "Carabajal";
        persona2.obtenerInfo();

        System.out.println("persona1: " + persona1);
        System.out.println("persona2: " + persona2);
    }
}