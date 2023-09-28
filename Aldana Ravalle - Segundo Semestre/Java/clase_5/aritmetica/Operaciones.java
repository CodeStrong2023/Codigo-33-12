package clase_5.aritmetica;

public class Operaciones {
    public static void main(String[] args) {

        // Usar el constructor 1
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3; // Almacenar variables locales -> memoria stack
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        
        // Almacenar objetos o atributos -> memoria heap 
        int resultado = aritmetica1.sumarConRetorno(); 
        System.out.println("Resultado con retorno: " + resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 15);
        System.out.println("Resultado con argumentos: " + resultado);

        System.out.println("aritmerical a:" + aritmetica1.a);
        System.out.println("aritmetical b:" + aritmetica1.b);

        // Usar en constructor 2
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2: " + aritmetica2.a);
        System.out.println("aritmetica2: " + aritmetica2.b);
    }
}