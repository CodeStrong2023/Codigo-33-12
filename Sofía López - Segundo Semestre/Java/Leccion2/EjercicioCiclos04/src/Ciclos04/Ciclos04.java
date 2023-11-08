/*
Ejercicio 4: Pedir numeros hasta que teclee uno negativo
y mostrar cuantos numeros se han introducido.
Primero con clase Scanner , luego JOptionPane
>>>>>>>> Scanner 
*/
package Ciclos04;

import java.util.Scanner;

public class Ciclos04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0;
        System.out.println("Ingrese un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
            System.out.println("El número "+numero+" es Positivo");
            conteo++;
            System.out.println("Ingrese otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Ha ingresado "+conteo+" numeros que no son negativos");
    }
}
