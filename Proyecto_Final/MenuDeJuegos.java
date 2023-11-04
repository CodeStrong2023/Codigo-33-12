package Proyecto_Final;

import java.util.Scanner;

public class MenuDeJuegos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Bienvenido al Menú de Juegos");
        System.out.println("1. Juego de Palabras");
        System.out.println("2. Piedra papel o tijeras");
        System.out.println("3. Otro juego");
        System.out.println("4. Otro juego");
        System.out.println("5. Otro juego");
        System.out.println("6. Otro juego");
        System.out.println("7. Otro juego");
        System.out.println("8. Otro juego");
        System.out.println("");

        System.out.print("Elige un juego (1/8): ");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1) {
            System.out.println("");
            JuegoPalabras.main(args);

        } else if (opcion == 2) {
            System.out.println("");
            Piedra_papel_O_tijera.main(args);
        
        } else if (opcion == 3) {
            // otro juego
        
        } else if (opcion == 4) {
            // otro juego
        
        } else if (opcion == 5) {
            // otro juego
        
        } else if (opcion == 6) {
            // otro juego
        
        } else if (opcion == 7) {
            // otro juego
        
        } else if (opcion == 8) {
            // otro juego

        } else {
            System.out.println("Opción no válida. Saliendo del Menú de Juegos.");
        }

        scanner.close();
    }
}
