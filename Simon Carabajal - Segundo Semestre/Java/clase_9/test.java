package clase_9;

import java.util.Date;

public class test {
    public static void main(String[] args) {
        // Objeto 1 - Empleado
        empleado empleado1 = new empleado("Ramón", 70500.0);
        System.out.println("Empleado 1: " + empleado1);

        // Objeto 2 - Cliente
        cliente cliente1 = new cliente(new Date(), true, "Mariana", 'F', 23, "Las frambuesas 342");
        // (Date fecha, int idCliente, String nombre, boolean vip, char genero, int edad, String direccion)
        System.out.println("Cliente 1: " + cliente1);
    }
}