
package CiclosWhile;

public class EjercicioWhile01 {
    public static void main(String[] args){
        var conteo = 0; // Inferencia de tipo
        while (conteo <= 7) {
            System.out.println("conteo = " + conteo); 
            conteo++; //Aumenta en 1 la variable
            
        }
        
        //Ciclo Do-While
        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador <= 7);
        
        //Ciclo For 
        //for (var contando = 0; contando < 7; contando++){
        //    System.out.println("contando = " + contando);
        //}
        
        //Palabras Break y Continue
        for (var contando = 0; contando < 7; contando++){
            if (contando % 2 == 0){
                System.out.println("contando = " + contando);
            break;  
            }
        }
        
        //Continue
        for (var contando = 0; contando < 7; contando++){
            if (contando % 2 != 0){
                continue; //Vamos por la siguiente iteración
            }
            System.out.println("contando = " + contando);
        }  
        
        //Etiquetas Labels
        inicio:
        for (var contando = 0; contando < 7; contando++){
            if (contando % 2 == 0){
                System.out.println("contando = " + contando);
                break inicio;
            }
        }
    }

}
