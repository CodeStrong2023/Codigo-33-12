/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

import java.util.Date;

/**
 * @author JessicaPagano
 */

    public class Cliente extends Persona {
    // Atributos
    private int idCliente;
    private Date fecha;
    private boolean vip;
    private static int contadorCliente;

    // Constructor
    public Cliente(Date fecha, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fecha = fecha;
        this.vip = vip;
    }

    // Getters and setters
    public int getIdCliente() {
        return this.idCliente;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Metodo toString - String Builder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente {ID Cliente: ").append(idCliente);
        sb.append(", Fecha: ").append(fecha);
        sb.append(", VIP: ").append(vip);
        sb.append(", : ").append(super.toString());
        sb.append("}");
        return sb.toString();
    }   
}

