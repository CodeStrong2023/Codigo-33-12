package clase_6.ejercicio_10;

import java.util.Scanner;

public class scanner {
    // Ejercicio 10: Pedir 10 números y escribir la suma
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int numero, suma = 0;
        for(int i = 1; i <= 10; i++){
            System.out.print("Ingrese un número: ");
            numero = Integer.parseInt(dato.nextLine());
            suma += numero;
        }
        System.out.println("\nLa suma de los numeros ingresados es "+suma);
        dato.close();
    }
}
