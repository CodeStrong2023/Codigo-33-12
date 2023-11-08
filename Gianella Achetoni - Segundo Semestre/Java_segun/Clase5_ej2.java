package Java_segun;

import java.util.Scanner;

public class Clase5_ej2 {
    public static void main(String[] args) {
        Scanner n = new Scanner( System.in);
        System.out.println("Ingrese un dia: ");
        int dia = n.nextInt();
        System.out.println("Ingrese un mes: ");
        int mes = n.nextInt();
        System.out.println("Ingrese un año: ");
        int año = n.nextInt();
        if (dia<=30 & mes <=12 ) {
            System.out.println("Fecha existente ");
        } else {
            System.out.println("fecha inexistente ");
            
        }

    }
}
