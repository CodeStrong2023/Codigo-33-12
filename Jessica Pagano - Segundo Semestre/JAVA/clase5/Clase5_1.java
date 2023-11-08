/*
 Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses son de 30 días.
 */
package clase5;

import java.util.Scanner;

/**
 * @author JessicaPagano
 */
public class Clase5_1 {
    public static void main(String[] args) {
        
       Scanner fecha = new Scanner(System.in);
        int dia, mes, año;

        System.out.print("INGRESE EL DIA: ");
        dia = Integer.parseInt(fecha.nextLine());

        System.out.print("INGRESE EL MES: ");
        mes = Integer.parseInt(fecha.nextLine());

        System.out.print("INGRESE EL ANIO: ");
        año = Integer.parseInt(fecha.nextLine());

        if ((dia != 0) && (dia <= 30)) {
            if ((mes != 0) && (mes <= 12)) {
                if ((año != 0) && (año <= 2023)) {
                    System.out.println("LA FECHA INGRESADA "+dia+"/"+mes+"/"+año+" EXISTE");
                } else {
                    System.out.println("EL ANIO INGRESADO NO EXISTE");
                }
            } else {
                System.out.println("EL MES INGRESADO NO EXISTE");
            }
        } else {
            System.out.println("EL DIA INGRESADO NO EXISTE");
        }
        fecha.close();
    }
    
}
