/*
Ejercicio 12: Pedir un número y calcular su factorial
 */
package clase7;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author JessicaPagano
 */
public class Clase7_1 {

    //CLASE SCANNER
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int numero, factorial = 1;
        System.out.print("DIGITE UN NUMERO, SE DEVOLVERA SU FACTORIAL: ");
        numero = Integer.parseInt(dato.nextLine());
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("EL FACTORIAL DEL " + numero + " ES " + factorial);
        dato.close();

        /*
        int factorial = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE UN NUMERO, SE DEVOLVERA SU FACTORIAL: "));
        for (int i=1; i<=numero; i++){
            factorial *= i;
        } 
        JOptionPane.showMessageDialog(null, "EL FACTORIAL DEL " + numero + " ES " + factorial);
         */
    }

}
