/*
Ejercicio 11
Diseñar un programa que muestre el producto de los 10 primeros números impares
 */
package clase7;

import javax.swing.JOptionPane;

/**
 * @author JessicaPagano
 */
public class Clase7 {
    public static void main(String[] args) {
        int producto = 1;
        for (int i = 1; i <= 20; i += 2) { //aumento para los numeros impares
            producto *= i;
        }
        JOptionPane.showMessageDialog(null, "El producto de los 10 primeros numeros impares es " + producto);
    }
}
