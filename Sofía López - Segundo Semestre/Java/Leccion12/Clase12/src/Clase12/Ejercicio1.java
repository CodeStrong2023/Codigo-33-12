
package Clase12;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        // Crear y cargar una matriz de tamaño 3*3, transponerla y mostrarla

        Scanner dato = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("\nLlenar la matriz");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print("Matriz " + fila + " - " + columna + ": ");
                matriz[fila][columna] = dato.nextInt();
            }
        }
        System.out.println();

        System.out.println("Matriz original: ");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
            dato.close();
        }
        System.out.println();

        System.out.println("Matriz transpuesta: ");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(matriz[columna][fila] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }    
            
}
