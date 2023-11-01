package clase_10.Paquete.ar.com.codesystem;

// Forma 1:
// import clase_10.Paquete.ar.com.codesystem.Utileria;

// Forma 2:
// import static clase_10.Paquete.ar.com.codesystem.Utileria.imprimir;

public class Test {
    public static void main(String[] args) {

        // Forma 1:
        // Utileria.imprimir("Hola mundo");
        
        // Forma 2:
        // imprimir("Adiós mundo");

        // Forma 3: no recomendable
        clase_10.Paquete.ar.com.codesystem.Utileria.imprimir("Nos vemos mundo");
    }
}