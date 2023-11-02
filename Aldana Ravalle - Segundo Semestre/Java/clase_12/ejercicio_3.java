package clase_12;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        // Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la suma de
        // cada fila y de cada columna.

        Scanner dato = new Scanner(System.in);
        int matriz[][], nFilas, nColumnas, sumaFilas, sumaColumnas;
        int posFila, posColumna;

        System.out.print("\nIngrese el numero de filas: ");
        nFilas = dato.nextInt();

        System.out.print("\nIngrese el numero de columnas: ");
        nColumnas = dato.nextInt();

        matriz = new int[nFilas][nColumnas];
        int filas[] = new int[nFilas];
        int columnas[] = new int[nColumnas];

        System.out.println("\nLlenar la matriz");

        for (int fila = 0; fila < nFilas; fila++) {
            for (int columna = 0; columna < nColumnas; columna++) {
                System.out.print("Matriz " + fila + " - " + columna + ": ");
                matriz[fila][columna] = dato.nextInt();
            }
        }
        System.out.println();

        System.out.println("Matriz original: ");
        for (int fila = 0; fila < nFilas; fila++) {
            for (int columna = 0; columna < nColumnas; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
            dato.close();

        }

        // Sumar filas
        posFila = 0;
        for (int fila = 0; fila < nFilas; fila++) {
            sumaFilas = 0;
            for (int columna = 0; columna < nColumnas; columna++) {
                sumaFilas += matriz[fila][columna];
            }
            filas[posFila] = sumaFilas;
            posFila++;
        }

        // Sumar columnas
        posColumna = 0;
        for (int columna = 0; columna < nColumnas; columna++) {
            sumaColumnas = 0;
            for (int fila = 0; fila < nFilas; fila++) {
                sumaColumnas += matriz[fila][columna];
            }
            columnas[posColumna] = sumaColumnas;
            posColumna++;
        }

        System.out.println("\nLa suma de las filas es:");
        for (int fila = 0; fila < nFilas; fila++) {
            System.out.print(filas[fila] + " - ");
        }

        System.out.println();

        System.out.println("\nLa suma de las columnas es:");
        for (int fila = 0; fila < nColumnas; fila++) {
            System.out.print(columnas[fila] + " - ");
        }
        System.out.println();

    }
}
