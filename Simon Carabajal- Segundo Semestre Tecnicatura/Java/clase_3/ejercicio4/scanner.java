package clase_3.ejercicio_4;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        // Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se
        // han introducido.

        Scanner dato = new Scanner(System.in);
        int numero, contador = 0;
        System.out.println(
                "Al ingresar un números positivos, se indicara la cantidad de estos cuando se ingrese uno negativo.");
        System.out.println("Ingrese un número: ");
        numero = Integer.parseInt(dato.nextLine());

        while (numero >= 0) {
            contador++;
            System.out.println("Ingrese un número:");
            numero = Integer.parseInt(dato.nextLine());
        }
        System.out.println("Se ingresaron " + contador + " números, fin del programa.");
        dato.close();
    }
}
