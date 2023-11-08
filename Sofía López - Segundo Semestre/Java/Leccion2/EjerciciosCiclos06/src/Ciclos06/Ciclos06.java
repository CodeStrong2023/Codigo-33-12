/*
Ejercicio 6: Pedir numeros hasta que teclees un 0, mostrar
la suma de todos los numeros introducidos.
>>>>Scanner
*/
package Ciclos06;

import java.util.Scanner;

public class Ciclos06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        do {
            System.out.println("Ingrese un número");
            numero = Integer.parseInt(entrada.nextLine());
            suma+= numero;
        }while(numero != 0);
        System.out.println("\nLa suna de todos los números ingresados es: "+suma);
    }
}
