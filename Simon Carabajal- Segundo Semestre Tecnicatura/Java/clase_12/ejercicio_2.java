package clase_12;

public class ejercicio_2 {
    public static void main(String[] args) {

        // Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos de la
        // diagonal principal sean 1 y el resto 0.

        int matriz[][] = new int[7][7];

        for (int fila = 0; fila < 7; fila++) {
            for (int columna = 0; columna < 7; columna++) {
                if(fila==columna){
                    matriz[fila][columna] = 1;
                }
                else{
                    matriz[fila][columna] = 0;
                }
            }
        }

        System.out.println();
        for (int fila = 0; fila < 7; fila++) {
            for (int columna = 0; columna < 7; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}