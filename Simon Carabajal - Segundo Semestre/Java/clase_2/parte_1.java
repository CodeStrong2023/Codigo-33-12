package clase_2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class parte_1 {
    public static void main(String[] args) {

        // Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.

        // Con la clase Scanner:
        Scanner dato = new Scanner(System.in);
        int num, cuadrado;
        System.out.println(
                "Ingrese un número, se devolvera su cuadrado correspondiente siempre que sea un número positivo.");
        num = Integer.parseInt(dato.nextLine());

        while (num >= 0) {
            cuadrado = (int) Math.pow(num, 2);
            System.out.println("El número " + num + " elevado al cuadrado es " + cuadrado + ".");
            System.out.println(
                    "Ingrese un número, se devolvera su cuadrado correspondiente siempre que sea un número positivo.");
            num = Integer.parseInt(dato.nextLine());
        }
        System.out.println("Se ingreso un número negativo.");
        dato.close();

        // Con la clase JOptionPane:

        int num1, cuadrado1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese un número, se devolvera su cuadrado correspondiente siempre que sea un número positivo."));
        // JOptionPane: Ofrece una alternativa a la consola, ofrece una ventana
        // emergente.
        while (num1 >= 0) {
            cuadrado1 = (int) Math.pow(num1, 2);
            System.out.println("El número " + num1 + " elevado al cuadrado es " + cuadrado1 + ".");
            num1 = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese un número, se devolvera su cuadrado correspondiente siempre que sea un número positivo."));
        }
        System.out.println("Se ingreso un número negativo.");
    }
}
