
package test;

public class TestArreglos {
  public static void main(String[] args) {

        int edades[] = new int[3];
        // Declaramos la variable = instanceamos el objeto
        System.out.println("edades: " + edades);

        edades[0] = 15;
        System.out.println("Edades - 1: " + edades[0]);

        edades[1] = 20;
        System.out.println("Edades - 2: " + edades[1]);

        edades[2] = 25;
        System.out.println("Edades - 3: " + edades[2]);

        System.out.println("");
        System.out.println("Iterar los elementos");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edades - " + i + ": "+ edades[i]);
        }
    }  
}
