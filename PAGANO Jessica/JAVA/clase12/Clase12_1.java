/*
Crear y cargar una matriz de tamaño 3*3, transponerla y mostrarla.
 */
package clase12;

import java.util.Scanner;

public class Clase12_1 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("\nLLENAR MATRIZ");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print("MATRIZ " + fila + " - " + columna + ": ");
                matriz[fila][columna] = dato.nextInt();
            }
        }
        System.out.println();

        System.out.println("MATRIZ ORIGINAL: ");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
            dato.close();

        }
        System.out.println();

        System.out.println("MATRIZ TRANSPUESTA: ");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(matriz[columna][fila] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

}
