package Java_segun;

import javax.swing.JOptionPane;

public class Clase5_ej12 {
    public static void main(String[] args) {
        String n;
        int num, enteros;
        n = JOptionPane.showInputDialog ("Ingrese un número: ");
        num = Integer.parseInt(n);
        enteros = 1;
        while (enteros <= num ) {
            System.out.println(enteros);
            enteros++;
        }
    }
}
