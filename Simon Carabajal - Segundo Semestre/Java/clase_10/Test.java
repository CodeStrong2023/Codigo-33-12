package clase_10;

public class Test {
    public static void main(String[] args) {
        var resultado1 = Operaciones.sumar(4, 6);
        System.out.println("resultado1: " + resultado1);

        var resultado2 = Operaciones.sumar(6.4, 3.6);
        System.out.println("resultado2: " + resultado2);

        var resultado3 = Operaciones.sumar(4, 6L); // Ejecutara double
        System.out.println("resultado3: " + resultado3);


    }


    
}
