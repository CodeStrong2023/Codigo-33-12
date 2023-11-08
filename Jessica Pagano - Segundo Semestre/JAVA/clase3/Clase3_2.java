/*
Realizar un juego para adivinar un número, para ello generar un número aleatorio entre 0-100
luego ir pidiendo números indicando "es mayor" o "es menor" según sea mayor o menor con respecto a N
El proceso termina cuando el usuario acierta y mostramos el número de intentos hechos.
 */
package clase3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JessicaPagano
 */
public class Clase3_2 {

    public static void main(String[] args) {
        
        System.out.println("-ADIVINA EL NUMERO-");
        System.out.println("DIGITE NUMEROS ENTRE 0 - 100");
        Scanner dato = new Scanner(System.in);
        int numero, azar, contador = 0;
        azar = (int) (Math.random() * 100);

        do {
            System.out.println("DIGITE UN NUMERO: ");
            numero = Integer.parseInt(dato.nextLine());

            if (numero < azar) {
                System.out.println("DIGITE UN NUMERO MAYOR: ");
            } else if (numero > azar) {
                System.out.println("DIGITE UN NUMERO MENOR: ");
            } else {
                System.out.println("Haz acertado! EL NUMERO ES: " + numero);
            }
            contador++;
        } while (numero != azar);
        System.out.println("ADIVINASTE EN TU INTENTO NUMERO:  " + contador);
        dato.close();

        /*
        JOptionPane.showMessageDialog(null, "-ADIVINA EL NUMERO-");
        JOptionPane.showMessageDialog(null,
                "DIGITE NUMEROS ENTRE 0 - 100");
        int numero, azar, contador = 0;
        azar = (int) (Math.random() * 100);
        numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));

        do {
            if (numero < azar) {
                numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO MAYOR: "));
            } else if (numero > azar) {
                numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO MENOR: "));
            } else {
                JOptionPane.showMessageDialog(null, "Haz acertado! EL NUMERO ES: " + numero);
            }
            contador++;
        } while (numero != azar);
        JOptionPane.showMessageDialog(null, "ADIVINASTE EN TU INTENTO NUMERO:  " + contador);
          */
    }

}
