package Java_segun;

import java.util.Date;

public class Clase9_ej3 extends Clase9_ej1 {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    public Clase9_ej3( Date fechaRegistro, boolean vip, String nombre,
             char genero,int edad, String direccion){
        super(nombre, genero,edad,direccion);
        this.idCliente = ++Clase9_ej3.contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
 
    public int getIdCliente(){
        return this.idCliente;
    }

    public Date getFechaRegistro(){
        return this.fechaRegistro;
    }
    public void setFechaRegistro(Date fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }

    public boolean getVip(){
        return this.vip;
    }
    public void setVip(boolean vip){
        this.vip = vip;
    }
    public String toString(){
        StringBuilder bs = new StringBuilder();
        bs.append("Cliente: [ idCliente:  ").append(idCliente);
        bs.append(", Fecha de Registro: ").append(fechaRegistro);
        bs.append(", Vip : ").append(vip);
        bs.append(", ").append(super.toString());
        bs.append("]");
        return bs.toString();
    }
}
