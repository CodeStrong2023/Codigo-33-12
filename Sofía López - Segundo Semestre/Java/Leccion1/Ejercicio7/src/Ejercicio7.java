
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

/*
Una compañía de venta de carros usados,paga a su personal de ventas
un salario de $1000 mensuales más una comisión de $150 por cada carro
vendido,más el 5% del valor de la venta por carro.
Cada mes el capturista de la empresa ingresa en la computadora los
datos pertinentes.
Hacer un programa que calcule e imprima el salario mensual de un 
vendedor dado.
El salario de 1000 lo vamos a manejar como un dato constante,
para asignarlo debemos usar la palabra reservada "final".
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        final int salario = 1000;
        int comision = 150, venta;
        float salarioMensual, ventaCarro, porcentajeVenta, precioTotal;

        System.out.println("Ingrese la cantidad de carros vendidos: ");
        venta = Integer.parseInt(entradaDatos.nextLine());
        System.out.println("Ingrese el precio del carro: ");
        ventaCarro = Float.parseFloat(entradaDatos.nextLine());

        comision *= venta;
        precioTotal = ventaCarro * venta;
        porcentajeVenta = precioTotal * 0.05f;
        salarioMensual = salario + comision + porcentajeVenta;

        System.out.println("El salario mensual del vendedor es de: " + salarioMensual);

    }
}
