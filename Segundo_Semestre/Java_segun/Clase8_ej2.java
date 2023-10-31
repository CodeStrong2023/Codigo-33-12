package Java_segun;

public class Clase8_ej2 {
    private int idPersona;
    private static int contadorPersona;
    private String nombre;

    public Clase8_ej2(String nombre){
        this.nombre = nombre;
        Clase8_ej2.contadorPersona ++;
        this.idPersona = Clase8_ej2.contadorPersona;

    }
    
    public static int getContadorPersona(){
        return contadorPersona;
    }
    public static void setContadorPersona(int aContadorPersona){
        contadorPersona = aContadorPersona;
    }

    public int getIdPersona(){
        return this.idPersona;
    }
    public void setIdPersona(int idPersona){
        this.idPersona = idPersona;
    }

    public String getNombre(){
        return  this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String toString(){
        return "Persona: [ " + "idPersona: " + idPersona + ", nombre: " + nombre + " ]"  ;
    }
}

