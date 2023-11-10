package Proyecto_Final;

import java.util.Random;
import java.util.Scanner;

public class JuegoBuscaminas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        char[][] num = new char[7][7];
        char[][] fan = new char[7][7];
        
        char opcionNumero, retirada;
        
        do {
            limpiarPantalla();
            System.out.println("**************   BUSCA MINAS     ****************");
            System.out.println("**************   1. JUEGO NUEVO  ****************");
            System.out.println("**************   2. SALIR        ****************");
            opcionNumero = scanner.next().charAt(0);
            
            switch (opcionNumero) {
                case '1':
                    jugarBuscaminas(num, fan, random, scanner);
                    retirada = ' ';
                    break;
                case '2':
                    System.out.println("Gracias por usar este programa!!");
                    break;
                default:
                    System.out.println("Entrada no valida");
            }
        } while (opcionNumero != '2');
    }
    
    private static void jugarBuscaminas(char[][] num, char[][] fan, Random random, Scanner scanner) {
        int nivel = seleccionarNivel(scanner);
        inicializarTablero(num, fan);
        ubicarMinas(num, random, nivel);
        char retirada = ' ';
        
        do {
            limpiarPantalla();
            mostrarTablero(fan);
            int[] coordenada = leerCoordenada(scanner);
            int varX = coordenada[0];
            int varY = coordenada[1];
            
            if (esCoordenadaValida(varX, varY)) {
                char minaPisada = num[varY][varX];
                if (minaPisada != 'X') {
                    int numMinas = contarMinasCercanas(num, varX, varY);
                    fan[varY][varX] = (char) ('0' + numMinas);
                } else {
                    limpiarPantalla();
                    mostrarTablero(num);
                    System.out.println("HAS PISADO UNA MINA!!");
                    System.out.println("GAME OVER");
                    System.out.println("Perdedor");
                    retirada = solicitarRetirada(scanner);
                }
            } else if (varX == 11 || varY == 11) {
                retirada = solicitarRetirada(scanner);
            } else if (varX == 10 || varY == 10) {
                marcarMina(scanner, fan);
            }
        } while (retirada != 's' && retirada != 'S');
    }
    
    private static int seleccionarNivel(Scanner scanner) {
        int nivel = 0;
        
        do {
            limpiarPantalla();
            System.out.println("**************  NIVEL    ");
            System.out.println("**************  1. FACIL [5 minas]  ");
            System.out.println("**************  2. INTERMEDIO [10 minas]    ");
            System.out.println("**************  3. DIFICIL  [15 minas]  ");
            nivel = scanner.nextInt();
        } while (nivel < 1 || nivel > 3);
        
        switch (nivel) {
            case 1:
                return 5;
            case 2:
                return 10;
            case 3:
                return 15;
            default:
                return 0;
        }
    }
    
    private static void inicializarTablero(char[][] num, char[][] fan) {
        for (int fil = 0; fil < 7; fil++) {
            for (int col = 0; col < 7; col++) {
                num[fil][col] = '-';
                fan[fil][col] = '-';
            }
        }
    }
    
    private static void ubicarMinas(char[][] num, Random random, int nivel) {
        int minasColocadas = 0;
        while (minasColocadas < nivel) {
            int xe = random.nextInt(6) + 1;
            int ye = random.nextInt(6) + 1;
            
            if (num[xe][ye] == '-') {
                num[xe][ye] = 'X';
                minasColocadas++;
            }
        }
    }
    
    private static boolean esCoordenadaValida(int varX, int varY) {
        return varX >= 1 && varY >= 1 && varX <= 6 && varY <= 6;
    }
    
    private static void mostrarTablero(char[][] tablero) {
        System.out.println("       1   2   3   4   5   6   ");
        for (int j = 1; j <= 6; j++) {
            System.out.print(j + "    | ");
            for (int col = 1; col <= 6; col++) {
                System.out.print(tablero[j][col] + " | ");
            }
            System.out.println();
        }
    }
    
    private static int[] leerCoordenada(Scanner scanner) {
        System.out.println("Coordenada en X");
        int varX = scanner.nextInt();
        System.out.println("Coordenada en Y");
        int varY = scanner.nextInt();
        return new int[]{varX, varY};
    }
    
    private static int contarMinasCercanas(char[][] num, int varX, int varY) {
        int numMinas = 0;
        
        int[][] direcciones = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1}, /*(x, y)*/ {0, 1},
            {1, -1}, {1, 0}, {1, 1}
        };
        
        for (int i = 0; i < direcciones.length; i++) {
            int offsetX = direcciones[i][0];
            int offsetY = direcciones[i][1];
            
            int busX = varX + offsetX;
            int busY = varY + offsetY;
            
            if (esCoordenadaValida(busX, busY) && num[busY][busX] == 'X') {
                numMinas++;
            }
        }
        
        return numMinas;
    }
    
    private static char solicitarRetirada(Scanner scanner) {
        System.out.println("¿Estás seguro que quieres retirarte del Juego?[S/N]");
        return scanner.next().charAt(0);
    }
    
    private static void marcarMina(Scanner scanner, char[][] fan) {
        System.out.println("Digite coordenada X de mina que desea marcar");
        int marX = scanner.nextInt();
        System.out.println("Digite coordenada Y de mina que desea marcar");
        int marY = scanner.nextInt();
        fan[marY][marX] = '?';
    }
    
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
