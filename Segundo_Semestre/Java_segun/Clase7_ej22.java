package Java_segun;

import javax.swing.JOptionPane;

public class Clase7_ej22 {
    public static void main(String[] args) {
        String n ;
        int num, pasadas, factorial;
        n = JOptionPane.showInputDialog("Ingrese un número: ");
        num = Integer.parseInt(n);
        pasadas = 1;
        factorial = 1;
        while (num != pasadas) {
            factorial = factorial *pasadas;
            pasadas = pasadas + 1;
        }
        factorial = factorial * num;
        System.out.printf("El factorial es: " + factorial);
    }
}
