package Java_segun;

import java.util.Scanner;

public class Clase11_ej3 {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        System.out.println("Ingrese un número: ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        numeros[0]= num;
        System.out.println("Ingrese un número: ");
        int nume = n.nextInt();
        numeros[1]= nume;
        System.out.println("Ingrese un número: ");
        int numer = n.nextInt();
        numeros[2]= numer;
        System.out.println("Ingrese un número: ");
        int numero = n.nextInt();
        numeros[3]= numero;
        System.out.println("Ingrese un número: ");
        int nu = n.nextInt();
        numeros[4]= nu;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numeros: " + i + " : " + numeros[i]);
        }



    }
}
