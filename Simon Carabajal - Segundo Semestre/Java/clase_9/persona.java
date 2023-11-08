package clase_9;

public class persona {

    // Atributos de herencia
    
    // private no se hereda a las clases hijas
    // protected si se hereda a las clases hijas
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    // Constructor (Vacio)
    public persona(){ // Constrctor 1
    }

    public persona(String nombre){ // Constrctor 2
        this.nombre = nombre;
    }

    public persona(String nombre, char genero, int edad, String direccion) { // Constrctor 3
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Getters and setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    // Metodo toString - String Builder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona { Nombre: ").append(nombre);
        sb.append(", Genero: ").append(genero);
        sb.append(", Edad: ").append(edad);
        sb.append(", Direccion: ").append(direccion);
        sb.append(", ").append(super.toString());
        sb.append(" }");
        return sb.toString();
    }
}
