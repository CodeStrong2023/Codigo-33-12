
// Primera clase
public class PrimeraClase { // Solo puede haber una clase publica
    public static void main(String[] args) {
        System.out.println("¡Hola!");

        SegundaClase usuario = new SegundaClase("Martín", "Diaz");
        System.out.println("Usuario -- " + usuario.nombre + " " + usuario.apellido);
    }
}

// Segunda clase
class SegundaClase {
    String nombre;
    String apellido;

    SegundaClase(String nombre, String apellido) { // Constructor
        // super(); // llamada al constructor padre de la clase object
        new TerceraClase().terceraclase(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto PrimeraClase usando this: " + this);
    }
}

// Tercera clase
class TerceraClase {
    public TerceraClase() {
        super();// El constructor de la clase padre, para reservar memoria
    }

    public void terceraclase(SegundaClase usuario) {
        System.out.println("Persona desde la TerceraClase: " + usuario);
        System.out.println("Impresión del objeto actual (this): " + this);
    }
}

