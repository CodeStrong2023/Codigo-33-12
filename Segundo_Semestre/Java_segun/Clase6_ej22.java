package Java_segun;

import javax.swing.JOptionPane;

public class Clase6_ej22 {
    public static void main(String[] args) {
        String n ;
        int num, suma, ingresos;
        suma = 0;
        ingresos = 0;
        do {
             n = JOptionPane.showInputDialog("Ingrese un número: ");
             num = Integer.parseInt(n);
             suma = suma + num;
             ingresos = ingresos + 1;
        } while (ingresos != 10);

        System.out.printf("La sumatoria de los números que ingreso es: " + suma);

    }
}
