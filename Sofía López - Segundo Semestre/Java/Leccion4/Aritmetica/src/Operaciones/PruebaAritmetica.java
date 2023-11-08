
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        int a = 10; //variables locales;
        int b = 7;//llamamos al stack 
        miMetodo(); //llamamos el método nuevo
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.a = 7;
        aritmetica1.sumarNumeros();
        //Para almacenar un objeto o los atributos se utiliza la memoria heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("resultado = " + resultado);
        
        System.out.println("aritmetica1 a:"+aritmetica1.a);
        System.out.println("aritmetica1 b:"+aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 0);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
        //aritmetica1 = null; nunca utilizar esto, no se debe hacer
        /*System.gc(); //innecesario,metodo para limpiar residuos,muy pesado. 
        El compilador lo hace solo
        */
        Persona persona = new Persona("Ariel","Betancud");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: "+persona.nombre); 
        System.out.println("Persona apellido: "+persona.apellido);
    }
    //Modularidad, creamos un nuevo método
    public static void miMetodo(){
        //a = 10; //una variable limitada
        System.out.println("Aqui hay otro método");
    }
}
//Creamos una nueva clase
class Persona{
    String nombre;
    String apellido;

    Persona(String nombre, String apellido){ //Constructor
        super(); //Llamada al constructor de la clase Padre object
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: "+this);
    }    
}

class Imprimir{
    public Imprimir(){
        //super(); //El constructor de la clase padre, para reservar memoria
        Imprimir imprimir = new Imprimir();
        
    }
    
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir: "+persona);
        System.out.println("Impresión del objeto actual (this)");
    }
}