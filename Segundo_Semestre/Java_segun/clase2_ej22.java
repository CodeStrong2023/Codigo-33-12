package Java_segun;

import javax.swing.JOptionPane;

public class clase2_ej22 {
    public static void main(String[] args) {
    String num;
    int n;
    num= JOptionPane.showInputDialog ("Introduzca un número: ");
    n = Integer.parseInt(num);
    while (n != 0) {
        if (n > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("negativo");
        }
        num= JOptionPane.showInputDialog ("Introduzca un número: ");
         n = Integer.parseInt(num);
    }
        
    }
    
}
