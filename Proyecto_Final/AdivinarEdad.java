
package Proyecto_Final;

import java.util.Scanner;


public class AdivinarEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado, anio, edad;
        int numeroLinea, a;
        int numeroElegido;
        int i;
        boolean opcionValida, terminado;
        char cumplePasado;
        i = 0;

        // >>>INTRO
        numeroLinea = 24; // Numero de veces que se va a imprimir el símbolo de la linea
        for (a = 1; a <= numeroLinea; a++) { // Primera línea demarcatoria
            System.out.print("~ ");
        }
        System.out.println("\n\n                |BIENVENIDO|\n\n" +
                "       ««Este juego adivinará tu edad»»\n" +
                "   Necesitarás tener una calculadora a mano\n" +
                "              ««¡EMPECEMOS!»»\n\n");
        for (a = 1; a <= numeroLinea; a++) { // Segunda línea demarcatoria
            System.out.print("~ ");
        }
        System.out.println("\n\n             ««Para continuar»»\n\n" +
                "    ««por favor presiona cualquier tecla»»");
        scanner.nextLine();
        clearScreen();

        // >>>FIN INTRO

        terminado = false;
        while (!terminado) {
            do {
                System.out.println("        ««Elige un número del 1 al 10 »»");
                numeroElegido = scanner.nextInt();
                if (numeroElegido < 1 || numeroElegido > 10) {
                    System.out.println("            ««Opción inválida»»\n");
                }
            } while (!(numeroElegido >= 1 && numeroElegido <= 10));
            clearScreen();

            resultado = ((numeroElegido * 2 + 5) * 50);

            opcionValida = false;
            while (!opcionValida) {
                System.out.println("       ««¿Tu cumpleaños ya pasó? (S para SI/N para NO)»»");
                cumplePasado = scanner.next().charAt(0);

                if (cumplePasado == 'S' || cumplePasado == 's') {
                    resultado = resultado + 1773;
                    opcionValida = true;
                } else if (cumplePasado == 'N' || cumplePasado == 'n') {
                    resultado = resultado + 1772;
                    opcionValida = true;
                }

                if (!opcionValida) {
                    System.out.println("            ««Opción inválida»»\n" +
                            "««Por favor, ingresa S si tu cumpleaños ya pasó»»\n" +
                            "          ««o N si no ha pasado»»\n");
                }
            }
            clearScreen();

            System.out.println("««¡Muy bien! Ahora vamos a necesitar que ingreses»»\n" +
                    " ««los cuatro digitos del año en el que naciste»»");
            anio = scanner.nextInt();
            clearScreen();

            // Filtro: Para evitar que ingresen un año que no corresponda a uno coherente
            if (anio <= 1924 || anio > 2023) {
                while (anio <= 1924 || anio >= 2024) {
                    System.out.println("      ««Por favor, ingresa un año válido»»");
                    anio = scanner.nextInt();
                    i = i + 1;
                }
            }
            clearScreen();
            // FIN Filtro

            edad = resultado - anio;

            for (a = 1; a <= numeroLinea; a++) { // Primera línea demarcatoria
                System.out.print("~ ");
            }
            System.out.println("\n\n           ««El resultado es: " + edad + "»»\n" +
                    "\n ««El primer número corresponde al número que»»\n\n" +
                    "        ««elegiste al principio del juego»»\n\n" +
                    "         «« y los últimos dos a tu edad »»\n\n");
            for (a = 1; a <= numeroLinea; a++) { // Segunda línea demarcatoria
                System.out.print("~ ");
            }
            System.out.println("\n\n  ««»»Para salir presione cualquier ESC(Escape)««»»");
            scanner.nextLine();
            terminado = true;
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J"); //ANSI Escape Code 
        System.out.flush();
    }
    
}
