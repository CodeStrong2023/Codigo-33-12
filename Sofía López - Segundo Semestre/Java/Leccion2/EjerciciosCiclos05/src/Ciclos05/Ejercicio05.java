/*
Ejercicio 5: Realizar un juego para adivinar un número,
para ello generar un número aleatorio entre 0-100, y
luego ir pidiendo números indicando "es mayor" o
"es menor" según sea mayor o menor con respecto a N 
El proceso termina cuando el usuario acierta y mostramos
el número de intents hechos.
*/
package Ciclos05;

import javax.swing.JOptionPane;

public class Ejercicio05 {
    public static void main(String[] args) {
        int num, a, contador = 0;
        a = (int)(Math.random() * 100);
        do { 
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            if (num < a) {
                JOptionPane.showMessageDialog(null, "El numero debe ser mayor");
            }
            else if (num > a) {
                JOptionPane.showMessageDialog(null, "El numero debe ser menor");
            }
            else {
                JOptionPane.showMessageDialog(null, "Bien hecho encontraste el número");
            }
            contador++;
        } while (num != a);
        System.out.println("Has adivinado el número en:"+contador+" intentos :D");
    }
}
