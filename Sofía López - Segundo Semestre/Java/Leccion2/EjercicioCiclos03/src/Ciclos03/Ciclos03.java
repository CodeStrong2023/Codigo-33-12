/*
Leer números hasta que se introduzca un cero
Para cada uno indicar si es par o impar.
Primero con clase Scanner,luego JOptionPane
*/
package Ciclos03;

import java.util.Scanner;

public class Ciclos03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un número");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero != 0){
            if(numero % 2 == 0){
                System.out.println("El número ingresado "+numero+"es Par");
            }
            else{
                System.out.println("El número ingresado "+numero+" es Impar");
            }
            System.out.println("Ingrese otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El número ingresado es: "+numero+" finaliza el programa");
    }
}
