package Java_segun;

import javax.swing.JOptionPane;
public class Clase5_ej22 {
    public static void main(String[] args) {
        String n;
        int dia, mes, año;
        n = JOptionPane.showInputDialog ("Introduzca un dia ");
        dia = Integer.parseInt(n);
        n =JOptionPane.showInputDialog ("Introduzca un mes ");
        mes = Integer.parseInt(n);
        n = JOptionPane.showInputDialog("Introduzca un año ");
        año = Integer.parseInt(n);
        if (dia <= 30 & mes <= 12) {
            System.out.printf("La fecha "+ dia + "/" + mes + "/" + año + " Es existente" );
        } else {
            System.out.println("La fecha no es existente");
        }
    }
}