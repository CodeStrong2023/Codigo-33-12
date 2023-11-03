package ejercicio_12;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // Ejercicio 12: Pedir un número y calcular su factorial
        
        Scanner dato = new Scanner(System.in);
        int numero, factorial = 1;
        System.out.print("Ingrese un número, se devolverá su factorial: ");
        numero = Integer.parseInt(dato.nextLine());
        for(int i=1; i<=numero; i++ ){
            factorial *= i;
        }
        System.out.println("El factorial de "+numero+" es "+factorial);
        dato.close();
    }
}