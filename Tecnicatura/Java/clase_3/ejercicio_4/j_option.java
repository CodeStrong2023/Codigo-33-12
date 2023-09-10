package clase_3.ejercicio_4;

import javax.swing.JOptionPane;

public class j_option {
    public static void main(String[] args) {
        // Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se
        // han introducido.

        JOptionPane.showMessageDialog(null,
                "Ingresar números positivos, se indicara la cantidad de estos cuando se ingrese uno negativo.");
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        int contador = 0;
        while (numero >= 0) {
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        }
        JOptionPane.showMessageDialog(null,"Se ingresaron " + contador + " números, fin del programa.");

    }
}
