/*
PEDIR NUMEROS HASTA QUE SE INTRODUZCA UN NUMERO NEGATIVO Y MOSTRAR CUANTOS NUMEROS SE HA INTRODUCIDO
PRIMERO CLASE SCANNER - LUEGO JOPTIONPANE
 */
package clase3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JessicaPagano
 */
public class Clase3_1 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        int numero, contador = 0;
        System.out.println(
                "DIGITE NUMEROS POSITIVOS - FINALIZA EL PROGRAMA INGRESANDO UN NUMERO NEGATIVO");
        System.out.println("DIGITE UN NUMERO: ");
        numero = Integer.parseInt(dato.nextLine());

        while (numero >= 0) {
            contador++;
            System.out.println("DIGITE UN NUMERO: ");
            numero = Integer.parseInt(dato.nextLine());
        }
        System.out.println("SE INGRESARON " + contador + " NUMEROS POSITIVOS");
        dato.close();
    }

    /*JOptionPane.showMessageDialog(null,
                "DIGITE NUMEROS POSITIVOS - FINALIZA EL PROGRAMA INGRESANDO UN NUMERO NEGATIVO");
        var numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));
        int contador = 0;
        while (numero >= 0) {
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO:"));
        }
        JOptionPane.showMessageDialog(null,"SE INGRESARON " + contador + " NUMEROS POSITIVOS");
     */
}
