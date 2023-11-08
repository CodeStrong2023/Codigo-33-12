package Java_segun;

public class Clase8_ej3 {
    public static void main(String[] args) {
        Clase8_ej2 persona1 = new Clase8_ej2("Gianella");
        System.out.printf("Persona1: " + persona1);
        System.out.println("");
        Clase8_ej2 persona2 = new Clase8_ej2("Ariel");
        System.out.printf("Persona1: " + persona2);
        System.out.println("");
        imprimir(persona1);
        System.out.println("");
        imprimir(persona2);
    }
    public static void imprimir (Clase8_ej2 persona ){
        System.out.printf("Persona: " + persona );

    }
}
