/*
Pedir un número N, y mostrar todos los números del 1 al N
 */
package clase5;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author JessicaPagano
 */
public class Clase5 {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("DIGITE UN NUMERO -> LUEGO SE MUESTRA DEL 1 AL NUMERO INGRESADO: ");
        int limite = Integer.parseInt(numero.nextLine());
        int i = 1;

        while (i <= limite) {
            System.out.println(i);
            i++;
        }

        numero.close();

        /*
        int numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO -> LUEGO SE MUESTRA DEL 1 AL NUMERO INGRESADO: "));
        int i = 1;
        while (i <= numero) {
            JOptionPane.showMessageDialog(null, i);
            i++;
        }
         */
    }

}
