/*
PROYECTO CAJA
Ejercicio1: Crear un proyecto según las especificaciones mostradas a continuacion
La formula es: volumen = ancho * alto * profundidad
*/
package caja;

public class PruebaCaja {
    public static void main(String[] args) { //main
        //Variables locales
        int medidaAncho = 3; //valores ingresados con código duro
        int medidaAlto = 2;
        int medidaProfundidad = 6;
        
        Caja caja1 = new Caja(); //Instanciamos el objeto, constructor vacio
        caja1.ancho = medidaAncho;
        caja1.alto = medidaAlto;
        caja1.profundidad = medidaProfundidad;
        int resultado = caja1.calcularVolumen(); //Llamamos al método
        //Primer resultado
        System.out.println("Resultado del volumen de la caja 1: "+resultado);
        
        Caja caja2 = new Caja(2, 4, 6); //Llamamos al constructor 2 con nuevos argumentos
        //Llamamos en el nuevo objeto al método para un nuevo calculo
        System.out.println("Resultado del volumen de la caja 2: "+caja2.calcularVolumen());  
    }    
}
