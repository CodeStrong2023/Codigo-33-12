
import java.util.Scanner;


public class Ejercicio2 {
    // Leer 5 numeros, guardarlos en un areglo y mostrarlos en el orden inverso al
    // introducido

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);
        int numeros[] = new int[5];

        System.out.println("\nIngresar los numeros");

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número:  ");
            numeros[i] = datos.nextInt();
        }

        System.out.println("\nMostrar los numeros");

        for (int i = 4; i >= 0; i--) {
            System.out.println("Numero " + (i + 1) + ": " + numeros[i]);
        }
        datos.close();
    }
}
