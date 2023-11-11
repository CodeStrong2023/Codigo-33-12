package Proyecto_Final;

import java.util.Scanner;

public class MenuDeJuegos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Bienvenido al Menú de Juegos");
        System.out.println("1. Palabras Encadenadas");
        System.out.println("2. Piedra papel o tijeras");
        System.out.println("3. Adivina el numero");
        System.out.println("4. El Buscaminas");
        System.out.println("5. Adivino tu edad");
        System.out.println("6. Juego de Aprendizaje");
        System.out.println("7. Tres En Linea");
        System.out.println("");

        System.out.print("Elige un juego (1/7): ");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1) {
            System.out.println("");
            JuegoPalabras.main(args);

        } else if (opcion == 2) {
            System.out.println("");
            Piedra_papel_O_tijera.main(args);
        
        } else if (opcion == 3) {
            System.out.println("");
            ProyectoIntJava.main(args);
        
        } else if (opcion == 4) {
            System.out.println("");
            ElBuscaminas.main(args);
        
        } else if (opcion == 5) {
            System.out.println("");
            AdivinarEdad.main(args);
        
        } else if (opcion == 6) {
            System.out.println("");
            JuegoDeAprendizaje.main(args);
        
        } else if (opcion == 7) {
            System.out.println("");
            TresEnLinea.main(args);

        } else {
            System.out.println("Opción no válida. Saliendo del Menú de Juegos.");
        }

        scanner.close();
    }
}
