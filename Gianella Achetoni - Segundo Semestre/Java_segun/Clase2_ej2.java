package Java_segun;
import java.util.Scanner;

public class Clase2_ej2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese un número:  ");
        int num = n.nextInt();
        while ( num != 0 ) {
            if (num > 0) {
                System.out.println("Positivo");
            } 
            else {
                System.out.println("Negativo");
            }
            System.out.println("Ingrese un número:  ");
            num = n.nextInt();
            
        }
    }
}
