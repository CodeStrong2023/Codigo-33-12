package Java_segun;

public class Clase12_ej1 {
    public static void main(String[] args) {
        int edades [][] =  new int[3][2];
        System.out.println("Edades: " + edades);
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 11;
        edades[2][0] = 1;
        edades[2][1] = 5;
        System.out.println("Edades: 0-0: " + edades[0][0]);
        System.out.println("Edades: 0-0: " + edades[0][1]);
        System.out.println("Edades: 0-0: " + edades[1][0]);
        System.out.println("Edades: 0-0: " + edades[1][1]);
        System.out.println("Edades: 0-0: " + edades[2][0]);
        System.out.println("Edades: 0-0: " + edades[2][1]);
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("Edades: " + i + " - " + j + " = " + edades[i][j]);
            }
        }

        //sintaxis simplificada 
        String frutas [][] = {{"Limon","Naranja"},{"Durazno","Damasco"},{"Uva","Ciruela"}};
        imprimir(frutas);
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println("Frutas: " + i + " - " + j + " = " + frutas[i][j]);
            }
        }

        Clase11_ej2 personas[][] = new Clase11_ej2[2][3];
        personas[0][0] = new Clase11_ej2("Gianella");
        personas[0][1] = new Clase11_ej2("Ariel");
        personas[0][2] = new Clase11_ej2("Tomas");
        personas[1][0] = new Clase11_ej2("Carlos");
        personas[1][1] = new Clase11_ej2("Micaela");
        personas[1][2] = new Clase11_ej2("Pablo");

        imprimir(personas);


    }
    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Matriz: " + i + " - " + j + " = " + matriz[i][j]);
            }
        }
    }
}