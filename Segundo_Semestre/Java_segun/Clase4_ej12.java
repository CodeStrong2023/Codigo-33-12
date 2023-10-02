package Java_segun;

import javax.swing.JOptionPane;

public class Clase4_ej12 {
 public static void main(String[] args) {
    String num ;
    int n, suma;
    num = JOptionPane.showInputDialog ("Introduzca un número");
    n = Integer.parseInt(num);
    suma = 0;
    do {
        suma = suma + n;
        num = JOptionPane.showInputDialog ("Introduzca un número");
        n = Integer.parseInt(num);
        
    } while (n != 0);
    System.out.printf("LA suma de los números ingresados es: " + suma);
 }
}
