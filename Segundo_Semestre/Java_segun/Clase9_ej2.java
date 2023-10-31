package Java_segun;

public class Clase9_ej2 extends Clase9_ej1 {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;

    public Clase9_ej2(){
         this.idEmpleado = ++Clase9_ej2.contadorEmpleados;
    }

    public Clase9_ej2 ( String nombre,double sueldo){
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public int getIdEmpleados(){
        return this.idEmpleado;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado: [ idEmpleado:  ").append(idEmpleado);
        sb.append(", Sueldo: ").append(sueldo);
        sb.append("]");
        return sb.toString();

    }
}
