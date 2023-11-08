package Ejercicio3_Switch;

import java.util.Scanner;

public class Ejercicio3_Switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número entre 0 y 10: ");
        var califacion = Integer.parseInt(entrada.nextLine());
        var notaFinal = "Nota desconocida";
        
        switch(califacion) {
            case 10:
            case 9:
                notaFinal = "A";
                break;
            case 8:
            case 7:
                notaFinal = "B";
                break;
            case 6: 
                notaFinal = "C";
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                notaFinal = "F";
                break;
        }
        System.out.println("notaFinal = " + notaFinal);
    }
}
