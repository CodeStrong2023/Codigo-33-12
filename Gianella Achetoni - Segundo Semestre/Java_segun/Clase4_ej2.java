package Java_segun;

import java.util.Scanner;

public class Clase4_ej2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int num = n.nextInt();
        int media, suma, contador ;
        suma = 0;
        contador = 0;
        while (num >= 0) {
            suma = suma + num;
            contador = contador + 1;
            System.out.println("Introduzca un número: ");
            num = n.nextInt();
        }
        media = suma / contador;
        System.out.printf("La media de los números introducidos es: " + media);

    }

}
