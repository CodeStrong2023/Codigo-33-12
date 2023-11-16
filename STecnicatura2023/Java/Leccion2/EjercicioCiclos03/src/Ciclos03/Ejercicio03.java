/* 
Ejercicio 3: Leer números hasta que se instruduzca un cero
Para cada uno indicar si es par o impar
Primero lo haremos con la clase Scanner
Luego con la clase JOptionPane
*/
package Ciclos03;

import javax.swing.JOptionPane;


public class Ejercicio03 {
    public static void main(String[] args){
    int numero;
    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
    while(numero != 0){
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El número ingresado "+numero+" es PAR");
               System.out.println("El número ingresado "+numero+" es PAR");  
            }
            else{
                JOptionPane.showMessageDialog(null, "El número ingresado "+numero+" es IMPAR");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        JOptionPane.showMessageDialog(null, "El número ingresado es "+numero+" finaliza el programa"); 
    }   
}