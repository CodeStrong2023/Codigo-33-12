package clase_6.ejercicio_10;

import javax.swing.JOptionPane;

public class j_option {
    // Ejercicio 10: Pedir 10 números y escribir la suma
    public static void main(String[] args) {
        int numero, suma = 0;
        for(int i = 1; i <= 10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: "));
            suma += numero;
        }
        JOptionPane.showMessageDialog(null,"\nLa suma de los numeros ingresados es "+suma);
    }
}