/*
Ejercicio 6: Pedir numeros hasta que teclees un 0, mostrar
la suma de todos los numeros introducidos.
>>>>>JOptionPane
*/
package Ciclos06;

import javax.swing.JOptionPane;

public class Ejercicio06 {
    public static void main(String[] args) {
        int numero, suma = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            suma+= numero;
        }while(numero != 0);
        JOptionPane.showMessageDialog(null, "\nLa suna de todos los números ingresados es: "+suma);
    }
}
