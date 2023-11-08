/*
Ejercicio 10: Pedir 10 números y escribir la suma.
 */
package clase6;

import java.util.Scanner;

public class Clase6_1 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int numero, suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("DIGITE UN NUMERO ALEATORIO DURANTE 10 VECES: ");
            numero = Integer.parseInt(dato.nextLine());
            suma += numero;
        }
        System.out.println("\nLA SUMA DE LOS NUMEROS INGRESADOS ES: " + suma);
        dato.close();

        /*
        int numero, suma = 0;
        for(int i = 1; i <= 10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE UN NUMERO ALEATORIO DURANTE 10 VECES: "));
            suma += numero;
        }
        JOptionPane.showMessageDialog(null,"\nLA SUMA DE LOS NUMEROS INGRESADOS ES: "+suma);
        
         */
    }
}
