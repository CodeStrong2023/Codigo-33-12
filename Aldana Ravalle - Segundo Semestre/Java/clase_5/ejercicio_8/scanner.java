package clase_5.ejercicio_8;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // Ejercicio 8: Pedir un número N, y mostrar todos los números del 1 al N

        Scanner numero = new Scanner(System.in);
        System.out.print("Mostrar todos los números del 1 al: ");
        int limite = Integer.parseInt(numero.nextLine());
        int i = 1;

        while (i <= limite) {
            System.out.println(i);
            i++;
        }

        numero.close();
    }
}