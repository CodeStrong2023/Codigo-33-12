package Java_segun;

import java.util.Scanner;

public class Clase3_ej2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num, contador;
        System.out.println("Ingrese un número: ");
        num = n.nextInt();
        contador = 0;
        while (num >= 0) {
            contador  ++ ;

            System.out.println("Ingrese un número: ");
            num = n.nextInt();
        }
        System.out.printf("La cantidad de números ingresados es: "+ contador);

    }
    
}