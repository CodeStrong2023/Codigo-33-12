package clase_3.ejercicio_3;

import javax.swing.JOptionPane;

public class j_option {
    public static void main(String[] args) {

        // Ejercicio 3: Leer números hasta que se introduzca un cero.
        // Para cada uno indicar si es par o impar.

        JOptionPane.showMessageDialog(null, "Al ingresar un número, se indicara si es par o impar.");
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un número:"));

        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null,"El número es par.");
            } else {
                JOptionPane.showMessageDialog(null,"El número es impar.");
            }

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        }
        JOptionPane.showMessageDialog(null,"El número es 0, fin del programa.");
    }
}
