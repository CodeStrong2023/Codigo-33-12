/*
 * LEER UN NUMERO Y MOSTRAR SU CUADRADO, REPETIR EL PROCESO HASTA QUE SE INTRODUZCA UN NUMERO NEGATIVO
 */
package clase2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author JessicaPagano
 */
public class Clase2 {

    public static void main(String[] args) {
        //CON CLASE SCANNER
        Scanner dato = new Scanner(System.in);
        int num, cuadrado;
        System.out.println(
                "INGRESE UN NUMERO POSITIVO, SE DEVOLVERA SU CUADRADO CORRESPONDIENTE: ");
        num = Integer.parseInt(dato.nextLine());

        while (num >= 0) {
            cuadrado = (int) Math.pow(num, 2);
            System.out.println("EL NUMERO " + num + " ELEVADO AL CUADRADO ES: " + cuadrado);
            System.out.println(
                    "INGRESE UN NUMERO POSITIVO, SE DEVOLVERA SU CUADRADO CORRESPONDIENTE: ");
            num = Integer.parseInt(dato.nextLine());
        }
        System.out.println("SE INGRESO UN NUMERO NEGATIVO");
        dato.close();

        //CON CLASE JOptionPane:
        int num1, cuadrado1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(
                "INGRESE UN NUMERO POSITIVO, SE DEVOLVERA SU CUADRADO CORRESPONDIENTE: "));
        // JOptionPane: Ofrece una alternativa a la consola, ofrece una ventana
        // emergente.
        while (num1 >= 0) {
            cuadrado1 = (int) Math.pow(num1, 2);
            System.out.println("EL NUMERO " + num1 + " ELEVADO AL CUADRADO ES: " + cuadrado1);
            num1 = Integer.parseInt(JOptionPane.showInputDialog(
                    "INGRESE UN NUMERO POSITIVO, SE DEVOLVERA SU CUADRADO CORRESPONDIENTE: "));
        }
        System.out.println("SE INGRESO UN NUMERO NEGATIVO");
    }

}
