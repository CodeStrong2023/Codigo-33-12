/*
Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la suma
de cada final y de cada columna.
*/
package matriz_ejercicio_5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matriz_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nCol,sumaFilas,sumaCol;
        int posFila, posCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de columnas: "));
        
        matriz = new int [nFilas][nCol];
        int filas[] = new int[nFilas];
        int columnas[] = new int [nCol];
        
        System.out.println("Rellenando la matriz: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.println("Matriz ["+i+"]["+j+"] ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nMatriz Original: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println(""); 
        }
        System.out.println("");
        
        // Sumar filas
        posFila = 0;
        for (int fila = 0; fila < nFilas; fila++) {
            sumaFilas = 0;
            for (int columna = 0; columna < nCol; columna++) {
                sumaFilas += matriz[fila][columna];
            }
            filas[posFila] = sumaFilas;
            posFila++;
        }
        
        // Sumar columnas
        posCol = 0;
        for (int columna = 0; columna < nCol; columna++) {
            sumaCol = 0;
            for (int fila = 0; fila < nFilas; fila++) {
                sumaCol += matriz[fila][columna];
            }
            columnas[posCol] = sumaCol;
            posCol++;
        }
        
        System.out.println("\nLa suma de las filas es: ");
        for (int fila = 0; fila < nFilas; fila++) {
            System.out.print(filas[fila] + " - ");
        }

        System.out.println();

        System.out.println("\nLa suma de las columnas es: ");
        for (int fila = 0; fila < nCol; fila++) {
            System.out.print(columnas[fila] + " - ");
        }
        System.out.println();   
    }
}
