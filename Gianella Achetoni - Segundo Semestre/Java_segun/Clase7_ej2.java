package Java_segun;

import java.util.Scanner;

public class Clase7_ej2 {
    public static void main(String[] args) {
        Scanner n = new Scanner( System.in);
        System.out.println("Ingrese un número: ");
        int num = n.nextInt();
        int factorial, pasadas;
        factorial = 1; 
        pasadas= 1;
        while (num != pasadas) {
            factorial = factorial * pasadas;
            pasadas= pasadas + 1; 

        }
        factorial = factorial * num;
        System.out.printf("El factorial del número es: "+ factorial);
    }
}
