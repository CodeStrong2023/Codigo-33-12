package clase_4.ejercicio_7;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // Ejercicio 7: Pedir números hasta que se introduzca uno negativo y calcular la
        // media

        Scanner dato = new Scanner(System.in);
        System.out.println(
                "Ingrese números positivos, al terminar la ejecución introduciendo un número negativo se mostrará la media");
        int numero, contador = 0, cantidad = 0;
        float media = 0;
        System.out.println("Ingrese un número");
        numero = Integer.parseInt(dato.nextLine());

        while (numero >= 0) {
            contador += numero;
            cantidad++;
            System.out.println("Ingrese un número");
            numero = Integer.parseInt(dato.nextLine());

        }
        media = (float)contador / cantidad;
        System.out.println("La media de los números ingresados es " + media);
        dato.close();
    }
}
