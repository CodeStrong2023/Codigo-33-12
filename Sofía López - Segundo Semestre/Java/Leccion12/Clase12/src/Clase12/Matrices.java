
package Clase12;

public class Matrices {
    public static void main(String[] args) {

        // Iniciallizar la matriz
        int edades[][] = new int[3][2];
        System.out.println("Edades: " + edades);

        // Llenar la matriz manualmente
        edades[0][0] = 5;
        edades[0][1] = 10;

        edades[1][0] = 15;
        edades[1][1] = 20;

        edades[2][0] = 25;
        edades[2][1] = 30;

        // Mostrar la matriz
        System.out.println("\nMatriz manual");
        System.out.println("Edades 0 - 0: " + edades[0][0]);
        System.out.println("Edades 0 - 1: " + edades[0][1]);
        System.out.println("Edades 1 - 0: " + edades[1][0]);
        System.out.println("Edades 1 - 1: " + edades[1][1]);
        System.out.println("Edades 2 - 0: " + edades[2][0]);
        System.out.println("Edades 2 - 1: " + edades[2][1]);
        
        System.out.println("\nMatriz iterada");
        for (int fila = 0; fila < edades.length; fila++) {
            for (int columna = 0; columna < edades[fila].length; columna++) {
                System.out.println("edades " + fila + " - " + columna + ": " + edades[fila][columna]);
            }
        }

        // Sintaxis simplificada
        System.out.println("\nMatriz frutas");
        String frutas[][] = { { "Manzana Roja", "Manzana Verde" }, { "Banana", "Platano" },
                { "Naranja", "Mandarina" } };
        imprimir(frutas);
        
         /*
         * for (int fila = 0; fila < frutas.length; fila++) {
         * for (int columna = 0; columna < frutas[fila].length; columna++) {
         * System.out.println("frutas " + fila + " - " + columna + ": " +
         * frutas[fila][columna]);
         * }
         * }
         */

        System.out.println("\nMatriz personas");

        // Creamos una matriz de objetos
        Persona personas[][] = new Persona[2][3];

        // Asignamos valores a la matriz
        personas[0][0] = new Persona("Marcelo");
        personas[0][1] = new Persona("Mariela");
        personas[0][2] = new Persona("Aldana");

        personas[1][0] = new Persona("Abril");
        personas[1][1] = new Persona("Lautaro");
        personas[1][2] = new Persona("Cleo");

        imprimir(personas);
    }
    // Metodo imprimir
    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz " + i + " - " + j + ": " + matriz[i][j]);
            }
        }
    }    

    private static class Persona {

        public Persona() {
        }

        private Persona(String marcelo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
