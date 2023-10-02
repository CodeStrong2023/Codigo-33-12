package Java_segun;

import java.util.Scanner;

public class Clase3_ej12 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = n.nextInt();
        int a, b;
        a = num % 2;
        while (num != 0) {
            if (a == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
            System.out.println("Ingrese un número: ");
            num = n.nextInt();
            a = num % 2;
        }
    }
}
