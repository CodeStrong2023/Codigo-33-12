package clase_9;

import java.util.Date;

public class cliente extends persona {
    // Atributos
    private int idCliente;
    private Date fecha;
    private boolean vip;
    private static int contadorCliente;

    // Constructor
    public cliente(Date fecha, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++cliente.contadorCliente;
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