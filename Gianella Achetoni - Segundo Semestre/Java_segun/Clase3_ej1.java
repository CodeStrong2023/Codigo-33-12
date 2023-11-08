package Java_segun;

import javax.swing.JOptionPane;

public class Clase3_ej1 {
    public static void main(String[] args) {
    String num;
    int n, a;
    num= JOptionPane.showInputDialog ("Introduzca un número: ");
    n = Integer.parseInt(num);
    a = n % 2;
    while (n != 0) {
        if (a == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        num= JOptionPane.showInputDialog ("Introduzca un número: ");
        n = Integer.parseInt(num);
        a = n % 2;
    }

    }
}
