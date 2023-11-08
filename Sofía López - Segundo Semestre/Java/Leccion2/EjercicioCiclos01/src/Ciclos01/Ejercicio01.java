/*
Ejercicio1: Leer un número y mostrar su cuadrado, repetir
 el proceso hasta que se introduzca un número negativo
>>>>>>> Con JOptionPane
*/
package Ciclos01;

import javax.swing.JOptionPane;

public class Ejercicio01 {
    public static void main(String[] args) {
        int numero, cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero >= 0){
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El número "+numero+" elevado al cuadrado es: "+cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        }    
        System.out.println("El programa a finalizado por número negativo");     
    }   
}