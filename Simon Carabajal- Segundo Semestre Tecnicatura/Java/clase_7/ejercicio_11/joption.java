package ejercicio_11;

import javax.swing.JOptionPane;

public class joption {
    public static void main(String[] args) {
        // Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros números impares
        int producto = 1;
        for(int i = 1; i<=20;i+=2){
            producto *= i;
        }
        JOptionPane.showMessageDialog(null,"El producto de los 10 primeros numeros impares es "+producto);
    }
}