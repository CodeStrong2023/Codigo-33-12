package clase_8.ContextoEstatico;

public class TestPersona {
    private int contador;

    public static void main(String[] args) {
        // Atributos dentro de la clase

        Persona persona1 = new Persona("Javier");
        System.out.println("persona1 = " + persona1);

        Persona persona2 = new Persona("Jimena");
        System.out.println("persona2 = " + persona2);

        imprimir(persona1);
        imprimir(persona2);

        // Usar el atributo de la clase
        // this.contador = 10; no se puede referenciar desde el contexto estatico
        TestPersona personaP1 = new TestPersona();
        System.out.println(personaP1.getContador());
    }

    public static void imprimir(Persona persona) {
        // public void imprimir(Persona persona) { // Eso daria un error

        System.out.println("persona = " + persona);
    }

    public int getContador() {
        imprimir(new Persona("Josefina"));
        return this.contador;
    }
}
