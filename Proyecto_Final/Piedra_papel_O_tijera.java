import java.util.Scanner;

/**
 * Piedra_papel_O_tijera
 */
public class Piedra_papel_O_tijera {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int pasadas,ganadas,perdidas,empate,num1,num2;
        pasadas=0;
        ganadas=0;
        perdidas=0;
        empate=0;
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                           REGLAS");
        System.out.println("El jugador debera elegir entre PIEDRA, PAPEL O TIJERA.");
        System.out.println("La pidra rompe las tijeras, las tijeras cortan al papel y el papel envuelve a la piedra.");
        System.out.println("Es decir que la piedra gana ante las tijeras, pero a su vez pierde ante el papel, y el papel pierde ante las tijeras.");
        System.out.println("En caso de que los jugadores elijan el MISMO elemento se conciderara EMPATE y ninguno obtendra puntos.");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("¿Con las reglas claras, desea jugar con la computadora o con otro jugador?");
        System.out.println("Para jugar con la computadora ingrese 1, si desea jugar contra otro jugador ingrese 2. ");
        System.out.println("En el caso de elegir jugar contra la computadora esta ocupara el lugar del JUGADOR 2");
        int opcion = n.nextInt();
        while (opcion != 1 & opcion != 2) {
            System.out.println("Ingrese un número de entre las opciones, el 1 o 2");
            opcion = n.nextInt();
        }
        System.out.println("¿Cuantas veces desea jugar?");
        int juego = n.nextInt();
        do {
            System.out.println("1=PIEDRA, 2=PAPEL, 3=TIJERAS");
            if (opcion == 1) {
                num2 = (int)(Math.random()*3+1);
                System.out.print("Ingrese una opción: ");
                num1 = n.nextInt();

            } else {
                System.out.print("Ingrese una opción JUGADOR 1:  ");
                num1 = n.nextInt();
                System.out.print("Ingrese una opción JUGADOR 2:  ");
                num2 = n.nextInt();
            }
            if (num1 == 1) {
                System.out.println("La elección del JUGADOR 1, es piedra");
            } else if (num1 == 2) {
                System.out.println("La elección del JUGADOR 1, es papel");
            } else {
                System.out.println("La elección del JUGADOR 1, es tijera");
            }
            if (num2 == 1) {
                System.out.println("La elección del JUGADOR 2, es piedra");
            } else if (num2 == 2) {
                System.out.println("La elección del JUGADOR 2, es papel");
            } else {
                System.out.println("La elección del JUGADOR 2, es tijera");
            }
            if (num1 == num2 ) {
                System.out.println("Empate");
                empate = empate + 1;
            } else if ((num1 == 1 & num2 == 3)||(num1 == 2 & num2 == 1)||(num1 == 3 & num2 == 2)) {
                System.out.println("Gana JUGADOR 1");
                ganadas = ganadas + 1;
            } else {
               System.out.println("Gana JUGADOR 2"); 
               perdidas = perdidas + 1;
            }
            pasadas = pasadas + 1;
        } while (pasadas != juego);
        System.out.printf("La cantidad total de empates es de: "+ empate);
        System.out.println("");
        System.out.println("");
        System.out.printf("La cantidad total de veces que gano el JUGADOR 1, es de: " + ganadas);
        System.out.println("");
        System.out.println("");
        System.out.printf("La cantidad total de veces que gano el JUGADOR 2, es de: " + perdidas);
    }
}
