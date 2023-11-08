/*
 PEDIR NUMEROS HASTA QUE SE TECLEE UN 0. MOSTRAR LA SUMA DE TODOS LOS NUMEROS INTRODUCIDOS
 */
package clase4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author JessicaPagano
 */
public class Clase4 {

    public static void main(String[] args) {
        //CLASE SCANNER
        Scanner dato = new Scanner(System.in);
        System.out.println(
                "- DIGITE CUALQUIER NUMERO, FINALIZA DIGITANDO EL NUMERO 0 -");
        System.out.println("AL FINALIZAR SE SUMARAN TODOS LOS NUMEROS INGRESADOS");
        int numero, sumar = 0;
        do {
            System.out.println("DIGITE UN NUMERO: ");
            numero = Integer.parseInt(dato.nextLine());
            sumar += numero;
        } while (numero != 0);
        System.out.println("LA SUMA DE LOS NUMERO INGRESADOS ES DE: " + sumar);
        dato.close();

        //CLASE JOptionPane
        /*
        JOptionPane.showMessageDialog(null,
                "- DIGITE CUALQUIER NUMERO, FINALIZA DIGITANDO EL NUMERO 0 -");
        JOptionPane.showMessageDialog(null,"AL FINALIZAR SE SUMARAN TODOS LOS NUMEROS INGRESADOS");
        int numero, sumar = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));
            sumar += numero;

        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "LA SUMA DE LOS NUMERO INGRESADOS ES DE: " + sumar);
         */
    }

}
