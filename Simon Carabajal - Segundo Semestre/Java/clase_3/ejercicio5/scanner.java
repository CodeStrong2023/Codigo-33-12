package clase_3.ejercicio_5;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // Ejercicio 5: Realizar un juego para adivinar un número, para ello generar un
        // número
        // aleatorio entre 0-100, y luego ir pidiendo números indicando "es mayor" o "es
        // menor" según sea mayor o menor con respecto a N
        // El proceso termina cuando el usuario acierta y mostramos el número de
        // intentos hechos.

        System.out.println("JUEGO: ADIVINA EL NÚMERO");
        System.out.println("Ingresa números entre el 0 y el 100, se te daran pistas hasta adivinar el número.");
        Scanner dato = new Scanner(System.in);
        int numero, azar, contar = 0;
        azar = (int) (Math.random() * 100);

        do {
            System.out.println("Ingrese un número: ");
            numero = Integer.parseInt(dato.nextLine());

            if (numero < azar) {
                System.out.println("Prueba con un número mayor.");
            } else if (numero > azar) {
                System.out.println("Prueba con un número menor");
            } else {
                System.out.println("¡Haz acertado! El número era " + numero);
            }
            contar++;
        } while (numero != azar);
        System.out.println("Adivinaste en tu intento número " + contar);
        dato.close();
    }

}
