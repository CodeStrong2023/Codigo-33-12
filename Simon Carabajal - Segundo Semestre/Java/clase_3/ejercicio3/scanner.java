package clase_3.ejercicio_3;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        // Ejercicio 3: Leer números hasta que se introduzca un cero. Para cada uno
        // indicar si es par o impar.

        Scanner dato = new Scanner(System.in);
        int numero;
        System.out.println("Al ingresar un número, se indicara si es par o impar.");
        System.out.println("Ingrese un número: ");
        numero = Integer.parseInt(dato.nextLine());

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }

            System.out.println("Ingrese un número:");
            numero = Integer.parseInt(dato.nextLine());
        }
        System.out.println("El número es 0, fin del programa.");
        dato.close();
    }
}
