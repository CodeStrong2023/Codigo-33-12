package Java_segun;
 
public class Clase7_ej1 {

    public static void main(String[] args) {
        int multiplicacion, numnega;
        numnega = 10;
        multiplicacion = 1;
        for (int i = 0; i <= 20; i++) {
          if (i % 2  == 0) {
           numnega = numnega - 1;
          } else {
            multiplicacion = multiplicacion * i;
          }
        }
       System.out.printf("La multiplicacion de los Impares es: " + multiplicacion);
    }
}
