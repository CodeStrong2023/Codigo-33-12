
package Java_segun;

public class Clase12_ej2 {
    public static void main(String[] args) {
        int numeros[][] = new int[3][3];
        numeros[0][0] = 1;
        numeros[0][1] = 4;
        numeros[0][2] = 6;
        numeros[1][0] = 9;
        numeros[1][1] = 12;
        numeros[1][2] = 2;
        numeros[2][0] = 4;
        numeros[2][1] = 5;
        numeros[2][2] = 7;
        imprimi(numeros);
    }
    public static void imprimi(int[][] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Matriz: "+ i +" - "+ j +" = "+numeros[i][j]);
            }
        }
    }
}