package Java_segun;
import java.util.Scanner;

public class Clase2_ej1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese un número:  ");
        int num = n.nextInt();
        
        int cuadrado=0;

        while (num > 0 ) {
            cuadrado = ( num *num );
            System.out.printf("El cuadrado del número es: " + cuadrado);
            System.out.print("");
            System.out.print("Ingrese un nuevo numero");
            num = n.nextInt();
        }
    }
    
}
