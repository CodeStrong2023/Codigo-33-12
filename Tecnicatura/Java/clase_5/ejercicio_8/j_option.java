package clase_5.ejercicio_8;

import javax.swing.JOptionPane;

public class j_option {
    public static void main(String[] args) {

        // Ejercicio 8: Pedir un número N, y mostrar todos los números del 1 al N

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Mostraran todos los números del 1 al: "));
        int i = 1;
        while (i <= numero) {
            JOptionPane.showMessageDialog(null, i);
            i++;
        }
    }
}
