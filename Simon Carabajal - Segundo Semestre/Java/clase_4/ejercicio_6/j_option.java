package clase_4.ejercicio_6;

import javax.swing.JOptionPane;

public class j_option {
    public static void main(String[] args) {

        // Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos
        // los números introducidos.

        JOptionPane.showMessageDialog(null,
                "Ingrese cualquier número, al finalizar precionando 0 se mostrará la suma de todos los números introducidos");
        int numero, sumar = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            sumar += numero;

        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "La suma de los números ingresados es de " + sumar);
    }
}
