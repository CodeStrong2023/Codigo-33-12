/*
Ejercicio 3: Leer 5 números por teclado, almacenarlos en
un arreglo y a continuacion realizar la media de los 
números positivos, la media de los negativos y contar el
número de ceros
*/
package arreglos_ejercicio_3;

import java.util.Scanner;

public class Arreglos_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float negativos = 0, positivos = 0, mediaNegativos, mediaPositivos;
        int conteo0 = 0, conteoNegativos = 0, conteoPositivos = 0;
        
        System.out.println("Guardamos los elementos del arreglo");
        for(int i = 0; i < 5; i++){
            System.out.println((i+1)+". Ingrese un número: ");
            numeros[i] = entrada.nextFloat();
            if(numeros[i] > 0){
                positivos += numeros[i]; 
                conteoPositivos++;
            }
            else if(numeros[i] < 0){
                negativos += numeros[i];    
            }
            else {
                conteo0++;
            }
        }
        
        if(conteoPositivos == 0){
            System.out.println("No se puede sacar la media de los números positivos");    
        }
        else{
            mediaPositivos = positivos/conteoPositivos;
            System.out.println("La media de los números positivos es: "+mediaPositivos);
        }
        
        if(conteoNegativos == 0){
            System.out.println("No se puede sacar la media de los números negativos");
        }
        else{
            mediaNegativos = negativos/conteoNegativos;
            System.out.println("La media de los números negativos es: "+mediaNegativos);
        }
        
        System.out.println(conteo0+"La cantidad de ceros es");
    }
}
