package Java_segun;

import java.util.Scanner;

public class Clase6_ej1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese el ancho: ");
        int ancho = n.nextInt();
        System.out.println("Ingrese el largo: ");
        int largo = n.nextInt();
        System.out.println("Ingrese la profundidad: ");
        int profundidad = n.nextInt();
        int cuenta;
        cuenta = ancho * largo * profundidad;
        System.out.printf("El volumen es: " + cuenta);
    }
}
