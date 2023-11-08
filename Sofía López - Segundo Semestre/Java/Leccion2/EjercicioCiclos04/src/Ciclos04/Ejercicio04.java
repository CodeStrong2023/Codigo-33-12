/*
Ejercicio 4: Pedir numeros hasta que teclee uno negativo
y mostrar cuantos numeros se han introducido.
Primero con clase Scanner , luego JOptionPane
>>>>>JOptionPane
*/
package Ciclos04;

import javax.swing.JOptionPane;

public class Ejercicio04 {
    public static void main(String[] args) {
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while(numero >= 0){
            JOptionPane.showMessageDialog(null, "El número "+numero+" es Positivo");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        }
        JOptionPane.showMessageDialog(null, "Ha ingresado "+conteo+" numeros que no son negativos");
    }
    
}
