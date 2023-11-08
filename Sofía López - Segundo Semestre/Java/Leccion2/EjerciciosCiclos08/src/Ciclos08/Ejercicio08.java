/*
Ejercicio 8: Pedir un número N, y mostrar todos los numeros
del 1 al N
>>>>> JOPtionPane
*/
package Ciclos08;

import javax.swing.JOptionPane;

public class Ejercicio08 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        int i = 1;
        while (i <= numero){
            JOptionPane.showMessageDialog(null, i);
            i++;
        }    
    }
}
