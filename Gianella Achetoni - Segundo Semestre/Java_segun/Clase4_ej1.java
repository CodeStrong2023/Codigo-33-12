package Java_segun;

import java.util.Scanner;

public class Clase4_ej1 {
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("Ingrese un número");
        int num = n.nextInt();
        int suma;
        suma = 0 ;
        do {
            suma = suma + num;
            System.out.println("Ingrese un número");
            num = n.nextInt();
        } while (num != 0);
        System.out.printf("La suma de todos los números ingresados es: " + suma);
    }
}
