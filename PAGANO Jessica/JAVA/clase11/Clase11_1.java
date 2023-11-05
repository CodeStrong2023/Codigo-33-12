/*
Leer 5 numeros, guardarlos en un areglo y mostrarlos en el orden inverso al introducido
 */
package clase11;

import java.util.Scanner;

public class Clase11_1 {

    public static void main(String[] args) {
       Scanner datos = new Scanner(System.in);
        int numeros[] = new int[5];

        System.out.println("\nDIGITE LOS NUMEROS");

        for (int i = 0; i < 5; i++) {
            System.out.print("DIGITE UN NUMERO: ");
            numeros[i] = datos.nextInt();
        }

        System.out.println("\nMOSTRAR LOS NUMEROS: ");

        for (int i = 4; i >= 0; i--) {
            System.out.println("NUMERO " + (i + 1) + ": " + numeros[i]);
        }
        datos.close();
    }
    
}
