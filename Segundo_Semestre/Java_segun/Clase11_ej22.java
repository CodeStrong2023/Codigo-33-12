package Java_segun;

public class Clase11_ej22 {
    public static void main(String[] args) {
        Clase11_ej2 personas[] = new Clase11_ej2 [2];
        personas[0] = new Clase11_ej2("Alejandra");
        personas[1] = new Clase11_ej2("Tomas");
        System.out.println("Persona 0: " + personas[0]);
        System.out.println("Persona 1: " + personas[1]);

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Personas "+ i +" : "+ personas[i]);
        }

        String frutas[] = {"Banana","Cereza ","Anana"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Frutas:  "+ i + " : " + frutas[i]);
        }
    }
}
