/*
Pedir el dia, mes y año de una fecha e indicar 
si la fecha es correcta. Suponiendo que todos los
meses son de 30 dias
*/
package Ciclos09;

import java.util.Scanner;

public class Ciclos09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el día: ");
        int dia = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el mes: ");
        int mes = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el año: ");
        int anio = Integer.parseInt(entrada.nextLine());
        if((dia !=0)&&(mes <= 30)) {
            if((mes !=0)&&(mes <= 12)){
                System.out.println("La fecha ingresada es:"+dia+"/"+mes+"/anio");
            }
            else{
                System.out.println("Fecha incorrecta, año incorrecto");
            }
        }
        else{
           System.out.println("Fecha incorrecta, dia incorrecto"); 
        }
    }
}
