package Java_segun;

public class Clase11_ej2 {

    private String nombre;

    public Clase11_ej2(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String toString(){
        return "Persona: [ Nombre: " + nombre + "]" + ", " + super.toString();
    }
}
