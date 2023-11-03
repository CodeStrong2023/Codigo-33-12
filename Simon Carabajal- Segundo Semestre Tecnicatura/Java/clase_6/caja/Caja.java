package clase_6.caja;

// Ejericicio: Crear un proyecto según las especificaciones mostradas a continuación:
// La formula es volumen = ancho * alto * profundidad

public class Caja { // Clase publica

    // Atributos
    int ancho;
    int alto;
    int profundidad;

    // Métodos y constructores
    public Caja() { // Constructor 1 -> vacio
    }

    public Caja(int ancho, int alto, int profundidad) { // Constructor 2 -> recibe parametros
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;

    }

    public int volumen() { // Constructor 3 -> metodo para calcular
        return ancho * alto * profundidad;
    }
}