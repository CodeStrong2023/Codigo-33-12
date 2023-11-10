
import java.util.Scanner;


public class Ejercicio3 {
    /*
     * Ejercicio 3: Leer 5 números por teclado, almacenarlos en
     * un arreglo y a continuación realizar la media de los
     * números positivos, la media de los negativos y contar el
     * número de ceros.
     */

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);
        int numeros[] = new int[5];
        int negativos = 0, positivos = 0, mediaNegativos, mediaPositivos;
        int conteoCeros = 0, conteoNegativos = 0, conteoPositivos = 0;

        System.out.println("\nIngresar los numeros");

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número:  ");
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

        System.out.println("\n - Numeros positivos - ");
        if (conteoPositivos == 0) {
            System.out.println("No hay numeros positivos");
        } else {
            mediaPositivos = positivos / conteoPositivos;
            System.out.println("La media de los numeros positivos es: " + mediaPositivos);
        }

        System.out.println("\n - Numeros negativos - ");
        if (conteoNegativos == 0) {
            System.out.println("No hay numeros negativos");
        } else {
            mediaNegativos = negativos / conteoNegativos;
            System.out.println("La media de los numeros negativos es: " + mediaNegativos);
        }  
        System.out.println("\n - Ceros - ");
        System.out.println("La cantidad de ceros es: " + conteoCeros);

        datos.close();
    }
}
