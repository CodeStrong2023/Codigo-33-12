package clase_2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class parte_2 {
    public static void main(String[] args) {

        // Ejercicio 2: Leer un número e indicar si es positivo o negativo. El proceso
        // se repetira hasta que se introduzca un cero.

        // Con la clase Scanner:

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número, el 0 finaliza el programa:");
        var numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero > 0) {
                System.out.println("El número ingresado es positivo.");
            } else {
                System.out.println("El número es negativo.");
            }

            System.out.println("Ingrese un número:");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El número es 0, fin del programa.");
        entrada.close();

        // Con la clase JOptionPane:

        var num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número, el 0 finaliza el programa:"));
        while (num != 0) {
            if (num > 0) {
                JOptionPane.showMessageDialog(null,"El número ingresado es positivo.");
            } else {
                JOptionPane.showMessageDialog(null,"El número ingresado es negativo.");
            }

            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        }
        JOptionPane.showMessageDialog(null,"El número es 0, fin del programa.");
    }
}
