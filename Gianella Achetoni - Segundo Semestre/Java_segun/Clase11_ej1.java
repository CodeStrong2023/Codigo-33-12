package Java_segun;

public class Clase11_ej1 {
    public static void main(String[] args) {
        int edades[] =  new int[3];
        System.out.println("Edades: " + edades);
        edades[0] = 17;
        System.out.println("Edades 0: "+ edades[0]);
        edades[1] = 21;
        System.out.println("Edades 1: "+ edades[1]);
        edades[2] = 24;
        System.out.println("Edades 2: " + edades[2]);

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edades y sus elementos: "+i+" : "+edades[i]);
        }
    }
}
