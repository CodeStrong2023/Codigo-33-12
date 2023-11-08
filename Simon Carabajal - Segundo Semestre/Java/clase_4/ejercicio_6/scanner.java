package clase_4.ejercicio_6;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos
        // los números introducidos.
        Scanner dato = new Scanner(System.in);
        System.out.println(
                "Ingrese cualquier número, al finalizar precionando 0 se mostrará la suma de todos los números introducidos");
        int numero, sumar = 0;
        do {
            System.out.println("Ingrese un número: ");
            numero = Integer.parseInt(dato.nextLine());
            sumar += numero;
        } while (numero != 0);
        System.out.println("La suma de los números ingresados es de " + sumar);
        dato.close();
    }
}
