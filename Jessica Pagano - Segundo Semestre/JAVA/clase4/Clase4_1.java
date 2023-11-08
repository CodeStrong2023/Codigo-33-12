/*
 Pedir números hasta que se introduzca uno negativo y calcular la media
 */
package clase4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author JessicaPagano
 */
public class Clase4_1 {

    public static void main(String[] args) {

        //CLASE SCANNER
        Scanner dato = new Scanner(System.in);
        System.out.println(
                "DIGITE NUMEROS POSITIVOS - FINALIZA INTRODUCIENDO NUMEROS NEGATIVOS -");
        System.out.println("SE MOSTRARA LA MEDIA");
        int numero, contador = 0, cantidad = 0;
        float media = 0;
        System.out.println("DIGITE UN NUMERO: ");
        numero = Integer.parseInt(dato.nextLine());

        while (numero >= 0) {
            contador += numero;
            cantidad++;
            System.out.println("DIGITE UN NUMERO: ");
            numero = Integer.parseInt(dato.nextLine());

        }
        media = (float) contador / cantidad;
        System.out.println("LA MEDIA DE LOS NUMEROS INGRESADOS ES: " + media);
        dato.close();

        // CLASE JOptionPane
        /*
        JOptionPane.showMessageDialog(null, "DIGITE NUMEROS POSITIVOS - FINALIZA INTRODUCIENDO NUMEROS NEGATIVOS -");
        JOptionPane.showMessageDialog(null, "SE MOSTRARA LA MEDIA");
        int numero, contador = 0, cantidad = 0;
        float media = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));
        while (numero >= 0){
            contador += numero;
            cantidad ++;
        numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));

        }
        media = (float)contador / cantidad;
        JOptionPane.showMessageDialog(null, "LA MEDIA DE LOS NUMEROS INGRESADOS ES: " + media);
        
         */
    }

}
