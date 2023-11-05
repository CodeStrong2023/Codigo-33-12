/*
LEER NUMEROS HASTA QUE SE INTRODUZCA UN 0 PARA CADA UNO INDICAR SI ES PAR O IMPAR
PRIMERO CLASE SCANNER Y LUEGO CON JOPTIONPANE
 */
package clase3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JessicaPagano
 */
public class Clase3 {

    public static void main(String[] args) {
        //CLASE SCANNER
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE UN NUMERO: ");
        var numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero > 0) {
                System.out.println("EL NUMERO " + numero + " es POSITIVO");
            } else {
                System.out.println("EL NUMERO " + numero + " es NEGATIVO");
            }
            System.out.println("DIGITE OTRO NUMERO: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("EL NUMERO " + numero + " FINALIZA EL PROGRAMA");

        //CLASE JOptionPane
        
        /*
        var num = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));
        while (num != 0) {
            if (num > 0) {
                JOptionPane.showMessageDialog(null, "EL NUMERO INGRESADO ES POSITIVO");
            } else {
                JOptionPane.showMessageDialog(null, "EL NUMERO INGRESADO ES NEGATIVO");
            }

            num = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OTRO NUMERO: "));
        }
        JOptionPane.showMessageDialog(null, "SE FINALIZA EL PROGRAMA");
         */
    }
}
