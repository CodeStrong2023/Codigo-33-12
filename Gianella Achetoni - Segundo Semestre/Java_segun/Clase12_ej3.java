package Java_segun;

public class Clase12_ej3 {
    public static void main(String[] args) {
        int num[][] = new int[7][7];
        relleno(num);
        imprimir(num);

    }

    public static void relleno(int[][] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (i==j) {
                    num[i][j] =1;
                } else {
                    num[i][j] = 0;
                }
            }
        }
    }
    public static void imprimir(int[][] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("Matriz: "+i+" - "+j+" = "+num[i][j]);
            }
        }
    }

}
