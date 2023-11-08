package Java_segun;

import java.util.Scanner;

public class Clase11_ej5 {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        System.out.println("Ingrese un número: ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        numeros[0]= num;
        System.out.println("Ingrese un número: ");
        int nume = n.nextInt();
        numeros[1]= nume;
        System.out.println("Ingrese un número: ");
        int numer = n.nextInt();
        numeros[2]= numer;
        System.out.println("Ingrese un número: ");
        int numero = n.nextInt();
        numeros[3]= numero;
        System.out.println("Ingrese un número: ");
        int nu = n.nextInt();
        numeros[4]= nu;
        int numerosPositivos, positivo,negativo, numerosNegativos,ceros, numeroo;
        double mediaNegativos, mediaPositivos;
        numerosPositivos = 0;
        numerosNegativos = 0;
        positivo = 0;
        negativo = 0;
        ceros = 0;
        mediaNegativos = 0 ;
        mediaPositivos = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            numeroo = numeros[i];
            if (numeroo > 0) {
                positivo = positivo + 1;
                numerosPositivos = numerosPositivos + numeroo;
                mediaPositivos = numerosPositivos / positivo;
            } else if (numeroo < 0) {
                negativo = negativo + 1;
                numerosNegativos = numerosNegativos - numeroo;
                mediaNegativos = numerosNegativos / negativo;
            } else {
                ceros = ceros + 1;
            }{
                
            }
        }
        
       
        System.out.println("La media de los números positivos es: " + mediaPositivos);
        System.out.println("La media de números negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}
