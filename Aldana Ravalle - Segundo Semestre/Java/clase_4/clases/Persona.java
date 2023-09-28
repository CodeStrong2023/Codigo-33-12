package clase_4.clases;

public class Persona {
    // Atributos de la clase (Caracteristivas)
    public String nombre;
    public String apellido;

    // Metodos de la clase (Acciones)
    // public -> indica que le metodo se puede utilizar fuera de la clase
    // void -> no regresa información
    // () -> recibe información
    public void obtenerInfo() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);

    }
    
}