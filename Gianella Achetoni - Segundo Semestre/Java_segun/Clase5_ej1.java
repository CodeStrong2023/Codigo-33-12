package Java_segun;

import java.util.Scanner;

public class Clase5_ej1 {
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("ingrese un número");
        int num = n.nextInt();
        int entero;
        entero = 1; 
        while (entero <= num) {
            System.out.println(entero);
            entero++;
        }
    
    }
}
