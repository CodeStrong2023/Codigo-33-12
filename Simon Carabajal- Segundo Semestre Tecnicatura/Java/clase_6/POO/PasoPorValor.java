package clase_6.POO;

public class PasoPorValor {
    public static void main(String[] args) {
        var valorX = 20;
        System.out.println("valorX: " + valorX);
        cambioValor(valorX); // copia el valor, no modifica el espacio de memoria de la variable
        System.out.println("valorX: "+ valorX);
    }
    public static void cambioValor(int arg1) {
        System.out.println("arg1: " + arg1);
        arg1 = 15;
        System.out.println("arg1: " + arg1);
    }   
}