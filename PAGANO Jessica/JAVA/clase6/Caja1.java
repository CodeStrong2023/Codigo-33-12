package clase6;

/**
 * @author JessicaPagano
 */
public class Caja1 {

    public static void main(String[] args) { // metodo main
        // Variables locales
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProfundidad = 6;

        Caja caja1 = new Caja(); // Nuevo objeto - constructor vacio
        // Pasar valores al objeto
        caja1.ancho = medidaAncho;
        caja1.alto = medidaAlto;
        caja1.profundidad = medidaProfundidad;
        int resultado = caja1.volumen(); // Llamar al metodo

        // Resultado 1
        System.out.println("Volumen de la caja 1: " + resultado);

        Caja caja2 = new Caja(2, 4, 6); // Nuevo objeto - constructor con argumentos
        // Resultado 2
        System.out.println("Volumen de la caja 2: " + caja2.volumen());
    }
}
