package Java_segun;

import javax.swing.JOptionPane;

public class Clase3_ej32 {
    public static void main(String[] args) {
        String num;
        int n, intentos, a;
        num = JOptionPane.showInputDialog("Introduzca un número: ");
        n = Integer.parseInt(num);
        intentos = 1;
        a = (int)(Math.random() * 100 + 1);
        do {
            if (n > a ) {
                System.out.println("Es menor");
            } else if (n < a) {
                System.out.print("Es mayor");
                
            }
            intentos ++;
            num = JOptionPane.showInputDialog("Introduzca un número: ");
            n = Integer.parseInt(num);

        } while (n == a);
        System.out.println(a);
        System.out.println("Bien hecho");
        System.out.printf("Lo lograste en " + intentos + "Intentos");


    }
}
