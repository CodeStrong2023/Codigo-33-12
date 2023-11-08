package clase8;

/**
 * @author JessicaPagano
 */
public class Persona {

    // Atributos
    private String nombre;
    // String nombre: -> Cuando no esta el modificador de acceso es default o package, no hace falta escribirlos
    private double sueldo;
    private boolean eliminado;

    // Constructor
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
        // this.atributo = variable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
}
