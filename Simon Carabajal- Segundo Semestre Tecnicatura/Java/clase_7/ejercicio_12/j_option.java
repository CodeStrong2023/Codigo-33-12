package ejercicio_12;

import javax.swing.JOptionPane;

public class j_option {
    public static void main(String[] args) {
        // Ejercicio 12: Pedir un número y calcular su factorial
        int factorial = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar un número, se devolverá su factorial: "));
        for (int i=1; i<=numero; i++){
            factorial *= i;
        } 
        JOptionPane.showMessageDialog(null, "El factorial de "+numero+" es "+factorial);
    }
}