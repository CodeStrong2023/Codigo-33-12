package Java_segun;

import java.util.Scanner;

public class Clase12_ej4 {
    public static void main(String[] args) {
        int columnassumar,filassumar, posfila, poscolumnas;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de filas: ");
        int filas = scanner.nextInt();
        System.out.println("ingrese la cantidad de columnas: ");
        int columnas = scanner.nextInt(); 
        int matriz[][] = new int[filas][columnas];
        int n_filas [] = new int[filas];
        int n_columnas [] = new int[columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingrese el numero para la matriz: "+ i + " - " + j );
                int numero = scanner.nextInt();
                matriz[i][j] = numero;
            }
        }

        posfila = 0;
        for (int i = 0; i < filas; i++) {
            filassumar = 0;
            for (int j = 0; j < columnas; j++) {
                filassumar = filassumar + matriz[i][j];
            }
            n_filas[posfila] = filassumar;
            posfila++;

        }

        poscolumnas = 0 ;
        for (int i = 0; i < columnas; i++) {
            columnassumar = 0;
            for (int j = 0; j < filas; j++) {
                columnassumar = columnassumar + matriz[j][i];
            }
            n_columnas[poscolumnas] = columnassumar;
            poscolumnas++;
        }

        System.out.println("La suma de las filas es: " );
        for (int i = 0; i < filas; i++) {
            System.out.println(n_filas[i] +" - ");
        }
        System.err.println("");

        System.out.println("La suma de las columnas es: " );
        for (int i = 0; i < columnas; i++) {
            System.out.println(n_columnas[i] +" - ");
        }
        System.err.println("");
    }
}
