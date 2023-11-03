package clase_8.ContextoEstatico;

public class Persona {

    // Atributos
    private int idPersona; // Este esta asociado a un objeto, por lo que se va a reiniciar en 0
    private static int contadorPersona; // Este esta asociado a la clase, por lo que no se reinicia 
    private String nombre;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;

        // Incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++; // No usar this, se usa el nombre de la clase y el atributo

        // Asignar valor a la variable idPersona
        this.idPersona = Persona.contadorPersona; // No es estatico, se reinicia a 0
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre; // Se suguiere agregar el this.
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override // Agrega informacion extra al metodo
    public String toString() {
        return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
        // Se sobreescribe el metodo
    }   
}