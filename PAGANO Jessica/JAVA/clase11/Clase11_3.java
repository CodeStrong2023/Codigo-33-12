/*
Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo y a continuación 
realizar la media de los números positivos, la media de los negativos y contar el número de ceros.
 */
package clase11;

import java.util.Scanner;

public class Clase11_3 {


    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int numeros[] = new int[5];
        int negativos = 0, positivos = 0, mediaNegativos, mediaPositivos;
        int conteoCeros = 0, conteoNegativos = 0, conteoPositivos = 0;

        System.out.println("\n-INGRESAR LOS NUMEROS-");

        for (int i = 0; i < 5; i++) {
            System.out.print("DIGITE UN NUMERO:  ");
            numeros[i] = datos.nextInt();
            if (numeros[i] > 0) {
                positivos += numeros[i];
                conteoPositivos++;
            } else if (numeros[i] < 0) {
                negativos += numeros[i];
                conteoNegativos++;
            } else {
                conteoCeros++;
            }
        }

        System.out.println("\n - NUMEROS POSITIVOS - ");
        if (conteoPositivos == 0) {
            System.out.println("NO HAY NUMEROS POSITIVOS");
        } else {
            mediaPositivos = positivos / conteoPositivos;
            System.out.println("La media de los numeros positivos es: " + mediaPositivos);
        }

        System.out.println("\n - NUMEROS NEGATIVOS - ");
        if (conteoNegativos == 0) {
            System.out.println("NO HAY NUMEROS NEGATIVOS");
        } else {
            mediaNegativos = negativos / conteoNegativos;
            System.out.println("LA MEDIA DE LOS NUMEROS NEGATIVOS ES DE: " + mediaNegativos);
        }

        System.out.println("\n - CEROS - ");
        System.out.println("LA CANTIDAD DE CEROS ES DE: " + conteoCeros);

        datos.close();
    }
    
}
