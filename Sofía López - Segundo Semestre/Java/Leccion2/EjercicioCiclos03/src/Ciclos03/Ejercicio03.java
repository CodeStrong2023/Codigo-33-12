/*
Leer números hasta que se introduzca un cero
Para cada uno indicar si es par o impar.
Primero con clase Scanner,luego JOptionPane
>>>>>>>>> JOptionPane
*/
package Ciclos03;

import javax.swing.JOptionPane;

public class Ejercicio03 {
    public static void main(String[] args) {
        
        int numero;
        System.out.println("Ingrese un número");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        while(numero != 0){
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El número ingresado "+numero+"es Par");
            }
            else{
                 JOptionPane.showMessageDialog(null, "El número ingresado "+numero+"es Impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número"));
        }
        JOptionPane.showMessageDialog(null, "El número ingresado es: "+numero+" finaliza el programa");
    }
}
