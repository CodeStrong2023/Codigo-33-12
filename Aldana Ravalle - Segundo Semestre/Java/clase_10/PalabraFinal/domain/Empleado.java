package clase_10.PalabraFinal.domain;

public class Empleado extends Persona{
    
    // Sobreescribir el metodo de Persona
    public void imprimir(){
        System.out.println("Metodo imprimir desde la clase hija");
    }
}