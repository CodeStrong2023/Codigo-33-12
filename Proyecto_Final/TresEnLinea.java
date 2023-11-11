package Proyecto_Final;

import java.util.Scanner;

/**
 * @author JessicaPagano
 */
public class TresEnLinea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, n, jugador;
        char[] vector = new char[10];

        System.out.println("                                     «« BIENVENIDO »»");
        System.out.println("");
        System.out.println("     ------------------------------------ REGLAS ----------------------------------------------------");
        System.out.println("");
        System.out.println("           - El primer jugador coloca la ficha en cualquiera de los casilleros del tablero.");
        System.out.println("           - El segundo hará lo mismo con su primera ficha.");
        System.out.println("");
        System.out.println("                         Se continúa las otras jugadas respetando los turnos.");
        System.out.println("        Si el jugador consigue alinear tres marcas del mismo tipo (horizontal, vertical o diagonal)");
        System.out.println("                                Ese jugador HACE ¡TA -TE -TI!");
        System.out.println("");
        System.out.println("     -------------------------------------------------------------------------------------------------");

        for (x = 1; x <= 9; x++) {
            vector[x] = ' ';
        }

        x = 1;
        jugador = (int) (Math.random() * 2) + 1;

        while (x <= 9) {
            System.out.println("Ingresa una posicion jugador: " + jugador);
            System.out.println("");
            System.out.println("1,2,3    " + vector[1] + "," + vector[2] + "," + vector[3]);
            System.out.println("4,5,6    " + vector[4] + "," + vector[5] + "," + vector[6]);
            System.out.println("7,8,9    " + vector[7] + "," + vector[8] + "," + vector[9]);
            System.out.println("");
            n = scanner.nextInt();

            if (n > 0 && n < 10) {
                if (jugador % 2 == 1) {
                    if (vector[n] == ' ') {
                        vector[n] = 'X';
                        jugador = 2;

                        if (vector[1] == 'X' && vector[2] == 'X' && vector[3] == 'X'
                                || vector[4] == 'X' && vector[5] == 'X' && vector[6] == 'X'
                                || vector[7] == 'X' && vector[8] == 'X' && vector[9] == 'X'
                                || vector[1] == 'X' && vector[4] == 'X' && vector[7] == 'X'
                                || vector[2] == 'X' && vector[5] == 'X' && vector[8] == 'X'
                                || vector[3] == 'X' && vector[6] == 'X' && vector[9] == 'X'
                                || vector[1] == 'X' && vector[5] == 'X' && vector[9] == 'X'
                                || vector[3] == 'X' && vector[5] == 'X' && vector[7] == 'X') {
                            System.out.println("¡EL JUGADOR 1 HA GANADO!");
                            x = 9;
                        }
                    } else {
                        System.out.println("ESA POSICION ESTA OCUPADA");
                    }
                } else {
                    if (vector[n] == ' ') {
                        vector[n] = 'O';
                        jugador = 1;

                        if (vector[1] == 'O' && vector[2] == 'O' && vector[3] == 'O'
                                || vector[4] == 'O' && vector[5] == 'O' && vector[6] == 'O'
                                || vector[7] == 'O' && vector[8] == 'O' && vector[9] == 'O'
                                || vector[1] == 'O' && vector[4] == 'O' && vector[7] == 'O'
                                || vector[2] == 'O' && vector[5] == 'O' && vector[8] == 'O'
                                || vector[3] == 'O' && vector[6] == 'O' && vector[9] == 'O'
                                || vector[1] == 'O' && vector[5] == 'O' && vector[9] == 'O'
                                || vector[3] == 'O' && vector[5] == 'O' && vector[7] == 'O') {
                            System.out.println("¡EL JUGADOR 2 HA GANADO!");
                            x = 9;
                        }
                    } else {
                        System.out.println("ESA POSICION ESTA OCUPADA");
                    }
                }
            } else {
                System.out.println("POSICION INCORRECTA");
            }

            x++;
        }

        System.out.println("");
        System.out.println("                    «« RESULTADO DEL JUEGO »»");
        System.out.println("");
        System.out.println("1,2,3    " + vector[1] + "," + vector[2] + "," + vector[3]);
        System.out.println("4,5,6    " + vector[4] + "," + vector[5] + "," + vector[6]);
        System.out.println("7,8,9    " + vector[7] + "," + vector[8] + "," + vector[9]);
        System.out.println("");
    }

}
