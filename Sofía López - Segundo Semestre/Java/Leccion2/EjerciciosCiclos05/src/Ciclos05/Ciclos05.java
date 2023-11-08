/*
Ejercicio 5: Realizar un juego para adivinar un número,
para ello generar un número aleatorio entre 0-100, y
luego ir pidiendo números indicando "es mayor" o
"es menor" según sea mayor o menor con respecto a N 
El proceso termina cuando el usuario acierta y mostramos
el número de intents hechos.
>>>>>> Scanner
*/
package Ciclos05;

import java.util.Scanner;

public class Ciclos05 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
       
        int num, a, contador = 0;
        a = (int)(Math.random() * 100);
       
        do { 
            System.out.println("Ingrese un número");
            num = Integer.parseInt(n.nextLine());
            if (num < a) {
                System.out.println("El numero debe ser mayor");  
            }
            else if (num > a) {
                 System.out.println("El numero debe ser menor");
            }
            else {
                System.out.println("Bien hecho encontraste el número");
            }
            contador++;
        } while (num != a);
        System.out.println("Has adivinado el número en:"+contador+" intentos :D");
    }
}
