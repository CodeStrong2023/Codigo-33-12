public class teoria_ciclos {
    public static void main(String[] args) {

        // Ciclo While - Mientras hacer
        System.out.println("Ciclo While");
        // Primero se comprueba la condición, luego se ejecuta del codigo
        var contA = 0; // Inferencia de datos
        while (contA <= 7) {
            System.out.println("contA: " + contA);
            contA++; // La variable aumenta en uno
        }

        // Ciclo Do While - Repetir hasta que
        System.out.println("Ciclo Do While");
        // Primero se ejecuta el codigo y despues se comproba la condición
        var contB = 0;
        do {
            System.out.println("Contador: " + contB);
            contB++;
        } while (contB <= 7);

        // Ciclo For - Para
        System.out.println("Ciclo For");
        /*
         * for( 1 ; 2 ; 3 ){}
         * 1) Declarar la variable (contador o iterador)
         * 2) Condición a cumplir
         * 3) Incremento o decremento del contador o iterador
         */
        for (var contC = 0; contC <= 7; contC++) {
            System.out.println("Contador: " + contC);
        }

        // Break
        System.out.println("Ciclo For - Break");
        for (var contD = 1; contD <= 7; contD++) {
            if (contD % 2 == 0) {
                System.out.println("Contador: " + contD);
                break;
            }
        }

        // Continue
        System.out.println("Ciclo For - Continue");
        for (var contE = 1; contE <= 7; contE++) {
            if (contE % 2 != 0) {
                continue; // Ir a la siguiente iteracion
            }
            System.out.println("Contador: " + contE);
        }

        // Etiquetas Labels -> no es recomendable de aplicar, pero es mejor conocerla
        // por si nos la encontramos en un codigo.
        // Le indican a break y continue ir hacia un lugar específico del código.

        System.out.println("Ciclo For - Labels");

        inicio: for (var contF = 1; contF <= 7; contF++) {
            if (contF % 2 == 0) {
                System.out.println("Contador: " + contF);
                break inicio;
            }
        }
    }
}