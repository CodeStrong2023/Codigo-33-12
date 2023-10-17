package Java_segun;

import java.util.Scanner;

public class Clase6_ej2 {
    public static void main(String[] args) {
        Scanner n = new Scanner( System.in);
        int suma, ingresos;
        suma = 0;
        ingresos = 0;
        do {
            System.out.println("Ingrese un número: ");
            int num = n.nextInt();
            suma = suma + num;
            ingresos = ingresos + 1;
            
        } while (ingresos != 10); 
        System.out.printf("La suma de sus números es: " + suma);

    }
}
