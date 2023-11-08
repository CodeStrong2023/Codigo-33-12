package Java_segun;

import javax.swing.JOptionPane;

public class Clase4_ej22 {
    public static void main(String[] args) {
        String n;
        int num, contador, suma, media;
        n = JOptionPane.showInputDialog ("Introduzca un número");
        num = Integer.parseInt(n);
        suma = 0;
        contador = 0;
        while (num >= 0) {
            suma = suma + num;
            contador = contador + 1;
            n = JOptionPane.showInputDialog ("Introduzca un número");
            num = Integer.parseInt(n);
            
        } 
        media = suma / contador;
        System.out.printf("La media de los números ingresados es: " + media );
    }
}
