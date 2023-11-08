package clase_3.ejercicio_5;

import javax.swing.JOptionPane;

public class j_option {
    public static void main(String[] args) {
        // Ejercicio 5: Realizar un juego para adivinar un número, para ello generar un
        // número
        // aleatorio entre 0-100, y luego ir pidiendo números indicando "es mayor" o "es
        // menor" según sea mayor o menor con respecto a N
        // El proceso termina cuando el usuario acierta y mostramos el número de
        // intentos hechos.
        JOptionPane.showMessageDialog(null, "JUEGO: ADIVINA EL NÚMERO");
        JOptionPane.showMessageDialog(null,
                "Ingresa números entre el 0 y el 100, se te daran pistas hasta adivinar el número.");
        int numero, azar, contar = 0;
        azar = (int) (Math.random() * 100);
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));

        do {
            if (numero < azar) {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Prueba con un número mayor."));
            } else if (numero > azar) {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Prueba con un número menor"));
            } else {
                JOptionPane.showMessageDialog(null, "¡Haz acertado! El número era " + numero);
            }
            contar++;
        } while (numero != azar);
        JOptionPane.showMessageDialog(null, "Adivinaste en tu intento número " + contar);
    }
}
