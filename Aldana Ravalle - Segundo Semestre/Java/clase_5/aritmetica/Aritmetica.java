package clase_5.aritmetica;

public class Aritmetica {

    // Atributos de la clase
    int a; // valor por default 0
    int b;


  // Sobrecarga de constructores

    // Constructor -> metodo especial

    public Aritmetica() { // Constructor 1 (sin parametros)
        System.out.println("Se ejecuta el constructor numero uno");
    }

    public Aritmetica(int a, int b) { // Constructor 2 (con parametros)
        this.a = a;
        this.b = b;
        System.out.println("Se ejecuta el constructor numero dos");
    }

    // Metodos
    public void sumarNumeros() {
        int resultado = a + b;
        System.out.println("Resultado: " + resultado);
    }

    public int sumarConRetorno() {

        // opcion con 2 lineas
        int resultado = a + b;
        return resultado;

        // opcion con una linea
        // return a + b;
    }

    public int sumarConArgumentos(int arg1, int arg2) {
        this.a = arg1; // el argumento 'a' se asigna al atributo 'this.a'
        this.b = arg2; // this sirve para diferenciar atributos de argumentos, aunque se llamen igual
        return a + b;
        // return sumarConRetorno(); -> llamar a otro metodo en un metodo
    }

}
