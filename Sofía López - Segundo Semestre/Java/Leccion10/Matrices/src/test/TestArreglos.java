
package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int [3]; //el lado derec. instanciamos un obj de tipo object
        System.out.println("edades = " + edades); //el lado izq. declaramos la variable
        
        edades[0] = 17;
        System.out.println("edades = " + edades[0]);
        
        edades[1] = 22;
        System.out.println("edades = " + edades[1]);
        
        edades[2] = 18;
        System.out.println("edades = " + edades[2]);
        
        
        for(int i = 0; i < edades.length; i++){
            System.out.println(edades[i]+"Edades y sus elementos "+i+": ");
        }
    }
}
