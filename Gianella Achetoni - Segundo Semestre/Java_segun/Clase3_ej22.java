package Java_segun;

import javax.swing.JOptionPane;

public class Clase3_ej22 {
    public static void main(String[] args) {
    String num;
    int n, a;
    num= JOptionPane.showInputDialog ("Introduzca un número: ");
    n = Integer.parseInt(num);
    a = 0;
    while (n >= 0) {
        a ++;
        num= JOptionPane.showInputDialog ("Introduzca un número: ");
        n = Integer.parseInt(num);
        
    }
    System.out.printf("La cantidad de números ingresada es: "+ a);

    }
}
