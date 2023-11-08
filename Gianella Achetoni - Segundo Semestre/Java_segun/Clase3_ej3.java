package Java_segun;

import java.util.Scanner;
public class Clase3_ej3 {
    public static void main(String[] args) {
        Scanner n = new Scanner( System.in);
        System.out.println("Ingrese un número");
        int num = n.nextInt();
        int a, intentos;
        a = (int)(Math.random() * 100 + 1);
        intentos = 1;
        do {
            if (num > a) {
                System.out.println("El número es menor");   
            } else if (num < a) {
                System.out.println("El número es mayor");
            }
            intentos ++;
            System.out.println("Ingrese un número");
            num = n.nextInt();
        } while (num == a);
        System.out.println("Bien hecho encontraste el número");
        System.out.println(a);
        System.out.printf("Intentos: "+ intentos );

    }
}
