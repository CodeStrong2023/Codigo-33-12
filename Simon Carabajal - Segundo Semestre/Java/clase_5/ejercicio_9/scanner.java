package clase_5.ejercicio_9;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si la fecha es
        // correcta. Suponiendo que todos los meses son de 30 días.
        Scanner fecha = new Scanner(System.in);
        int dia, mes, año;

        System.out.print("Ingrese un día: ");
        dia = Integer.parseInt(fecha.nextLine());

        System.out.print("Ingrese un mes: ");
        mes = Integer.parseInt(fecha.nextLine());

        System.out.print("Ingrese un año: ");
        año = Integer.parseInt(fecha.nextLine());

        if ((dia != 0) && (dia <= 30)) {
            if ((mes != 0) && (mes <= 12)) {
                if ((año != 0) && (año <= 2023)) {
                    System.out.println("La fecha ingresada "+dia+"/"+mes+"/"+año+" existe");
                } else {
                    System.out.println("el año ingresado no existe");
                }
            } else {
                System.out.println("el mes ingresado no existe");
            }
        } else {
            System.out.println("el dia ingresado no existe");
        }
        fecha.close();
    }
}