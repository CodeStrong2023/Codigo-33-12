/*
 * Ejercicio 2: Leer un número e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un cero.
 */
package clase2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author JessicaPagano
 */
public class clase2_1 {

    public static void main(String[] args) {
        //CON CLASE SCANNER:
        Scanner entrada = new Scanner(System.in);

        System.out.println("DIGITE UN NUMERO: ");
        var numero = Integer.parseInt(entrada.nextLine());
        while (numero
                != 0) {
            if (numero > 0) {
                System.out.println("EL NUMERO INGRESADO ES POSITIVO-");
            } else {
                System.out.println("EL NUMERO INGRESADO ES NEGATIVO-");
            }

            System.out.println("DIGITE UN NUMERO: ");
            numero = Integer.parseInt(entrada.nextLine());
        }

        System.out.println(
                "EL NUMERO INGRESADO ES 0 - SE FINALIZA PROGRAMA -");
        entrada.close();

        //CON CLASE JOptionPane
        var num = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));
        while (num != 0) {
            if (num > 0) {
                JOptionPane.showMessageDialog(null, "EL NUMERO INGRESADO ES POSITIVO-");
            } else {
                JOptionPane.showMessageDialog(null, "EL NUMERO INGRESADO ES NEGATIVO-");
            }

            num = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));
        }
        JOptionPane.showMessageDialog(null, "EL NUMERO INGRESADO ES 0 - SE FINALIZA PROGRAMA -");
    }
}
