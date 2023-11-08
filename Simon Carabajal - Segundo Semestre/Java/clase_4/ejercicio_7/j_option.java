package clase_4.ejercicio_7;

import javax.swing.JOptionPane;

public class j_option {
    public static void main(String[] args) {
        // Ejercicio 7: Pedir números hasta que se introduzca uno negativo y calcular la
        // media

        JOptionPane.showMessageDialog(null, "Ingrese números positivos, al terminar la ejecución introduciendo un número negativo se mostrará la media");
        int numero, contador = 0, cantidad = 0;
        float media = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while (numero >= 0){
            contador += numero;
            cantidad ++;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        }
        media = (float)contador / cantidad;
        JOptionPane.showMessageDialog(null, "La media de los números ingresados es " + media);
    }

}
