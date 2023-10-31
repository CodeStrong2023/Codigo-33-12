package Java_segun;

public class Clase7_ej3 {
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    public Clase7_ej3(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public boolean IsEliminado(){
        return eliminado;
    }
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }

    public String toString(){
        return "Persona [ nombre: " + this.nombre +
        ", Sueldo: " + this.sueldo +
        ", Eliminado: " + this.eliminado + " ]"  ;
    }
}
