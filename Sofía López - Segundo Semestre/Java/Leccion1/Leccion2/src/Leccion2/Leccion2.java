package Leccion2;

import java.util.Scanner;

public class Leccion2 {

    public static void main(String[] args) {
//        var condicion = false;
//
//        if (condicion) {
//            System.out.println("Condición Verdadera");
//        } else {
//            System.out.println("Condición Falsa");
//        }
//        
//        var numero = 2;
//        var numeroTexto = "Número desconocido";
//        
//        if(numero == 1) {
//            numeroTexto = "Número uno";
//        }
//        else if(numero == 2) {
//            numeroTexto = "Número dos";
//        }
//        else if(numero == 3) {
//            numeroTexto = "Número tres";
//        }
//        else if(numero == 4) {
//            numeroTexto = "Número cuatro";
//        }
//        else {
//            numeroTexto = "Número no encontrado";
//        }
//        
//        System.out.println("numeroTexto = " + numeroTexto);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 4: ");
        var numero = Integer.parseInt(entrada.nextLine());
        var numeroTexto = "Valor Desconocido";
        switch (numero) {
            case 1:
                numeroTexto = "Número uno";
                break;
            case 2:
                numeroTexto = "Número 2";
                break;
            case 3:
                numeroTexto = "Número 3";
                break;
            case 4:
                numeroTexto = "Número 4";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }

    }
}
