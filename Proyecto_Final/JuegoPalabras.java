package Proyecto_Final;

import java.util.Scanner;

public class JuegoPalabras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Juego de Aldana Ravalle
        // Reglas del juego
        System.out.println();
        System.out.println("  ______________________________________________________________________________");
        System.out.println(" |                                                                              |");
        System.out.println(" |                  - Bienvenido al Juego Palabras Encadenadas -                |");
        System.out.println(" |                                                                              |");
        System.out.println(" |   Este juego consiste en ingresar una palabra por turno.                     |");
        System.out.println(" |   Para ganar, la primera sílaba de las palabras ingresadas debe coincidir    |");
        System.out.println(" |   con la última sílaba de la palabra anterior.                               |");
        System.out.println(" |   El jugador que se equivoque, pierde.                                       |");
        System.out.println(" |______________________________________________________________________________|");

        System.out.println();

        // Ingresar nombres de los jugadores
        String jugador1, jugador2;

        System.out.print("Ingrese el nombre del Jugador 1: ");
        jugador1 = scanner.nextLine();

        System.out.print("Ingrese el nombre del Jugador 2: ");
        jugador2 = scanner.nextLine();

        // Definir variables
        String palabraAnterior = "";
        String jugadorActual = jugador1;
        String jugadorSiguiente = jugador2;
        boolean juegoActivo = true;

        // Ciclo del juego
        while (juegoActivo) {
            System.out.println("\nPalabra anterior: " + palabraAnterior);
            System.out.print(jugadorActual + ", ingresa una palabra: ");
            String palabra = scanner.nextLine();

            // Comparar silabas
            if (palabraAnterior.isEmpty()
                    || obtenerUltimaSilaba(palabraAnterior).equalsIgnoreCase(obtenerPrimeraSilaba(palabra))) {
                palabraAnterior = palabra;
                String temp = jugadorActual;
                jugadorActual = jugadorSiguiente;
                jugadorSiguiente = temp;
            } else {
                System.out.println();

                System.out.println(jugadorActual + " ha perdido. La palabra no coincide.");
                juegoActivo = false;
            }
        }
        scanner.close();
        System.out.println("¡" + jugadorSiguiente + " ha ganado el juego!");
    }

    // Funciones para obtener silabas
    private static String obtenerUltimaSilaba(String palabra) {
        palabra = palabra.toLowerCase();
        int longitud = palabra.length();
        if (longitud < 2) {
            return palabra;
        }
        return palabra.substring(longitud - 2);
    }

    private static String obtenerPrimeraSilaba(String palabra) {
        palabra = palabra.toLowerCase();
        int longitud = palabra.length();
        int indiceEspacio = palabra.indexOf(" ");
        if (indiceEspacio == -1 || indiceEspacio >= longitud - 1) {
            return palabra.substring(0, 2);
        }
        return palabra.substring(0, 2) + palabra.substring(indiceEspacio);
    }
}
