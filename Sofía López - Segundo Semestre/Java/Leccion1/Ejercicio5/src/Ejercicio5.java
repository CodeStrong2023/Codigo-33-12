
import java.util.Scanner;

//Hacer un programa que calcule e imprima la suma de 3 calificaciones.
//Pedir las clasificaciones al usuario.
public class Ejercicio5 {

    public static void main(String[] args) {
        //Hacer un programa que calcule e imprima la suma de tres calificaciones
        //Pedir las calificaciones al usuario 

        Scanner calificaciones = new Scanner(System.in);
        System.out.println("Ingrese la primera calificación: ");
        Float nota1 = Float.parseFloat(calificaciones.nextLine());
        System.out.println("Ingrese la segunda calificación: ");
        Float nota2 = Float.parseFloat(calificaciones.nextLine());
        System.out.println("Ingrese la tercera calificación: ");
        Float nota3 = Float.parseFloat(calificaciones.nextLine());

        Float sumaCalificaciones = (nota1 + nota2 + nota3);

        System.out.println("Calificacion = " + sumaCalificaciones);

    }
}
