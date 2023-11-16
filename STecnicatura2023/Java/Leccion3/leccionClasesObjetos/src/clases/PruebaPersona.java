
package clases;

public class PruebaPersona {
    public static void main(String[] args){
        Persona personal;
        personal = new Persona();//Llamamos al constructor
        personal.nombre = "Belén";//El valor exadecimal normalmente comienza con Ox
        personal. apellido = "Arriola";
        personal.obtenerInformación();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + personal);
        persona2.obtenerInformación();
        persona2.nombre = "Camila";
        persona2.apellido = "Arriola";
        persona2.obtenerInformación();
    } 
}
