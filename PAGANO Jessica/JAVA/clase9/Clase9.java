/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase9;

import java.util.Date;
import clase9.Cliente;

public class Clase9 {

    public static void main(String[] args) {
        // Objeto 1 - Empleado
        Empleado empleado1 = new Empleado("German", 70500.0);
        System.out.println("Empleado 1: " + empleado1);

        // Objeto 2 - Cliente
        Cliente cliente1 = new Cliente(new Date(), true, "Aldana", 'F', 22, "Diaz velez 486");
        // (Date fecha, int idCliente, String nombre, boolean vip, char genero, int edad, String direccion)
        System.out.println("Cliente 1: " + cliente1);
    }

}
