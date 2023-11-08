
import java.util.Scanner;

/*
Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo,
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero que tienen 
entre los 3.
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        Float guillermo, luis, juan, dineroTotal;
        System.out.println("Ingrese la cantidad de USD de Guillermo");
        guillermo = Float.parseFloat(entradaDatos.nextLine());

        luis = guillermo / 2;
        juan = (luis + guillermo) / 2;
        dineroTotal = guillermo + luis + juan;

        System.out.println("Dinero de Guillermo: US$" + guillermo);
        System.out.println("Dinero de Luis: US$" + luis);
        System.out.println("Dinero de Juan: US$" + juan);
        System.out.println("El dinero total es de: US$" + dineroTotal);
    }
}
