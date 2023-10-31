package Java_segun;
import java.util.Date;

public class Clase9testHerencia {
    public static void main(String[] args) {
        Clase9_ej2 empleado1= new Clase9_ej2("Gianella", 899.0000);
        System.out.printf("El empleado uno es:  " + empleado1);
        System.out.println("");


        Clase9_ej3 cliente = new Clase9_ej3(new Date(), true, "viviana", (char) 0, 28, "Valverdi 1500");
        System.out.println(cliente);
    }
}
