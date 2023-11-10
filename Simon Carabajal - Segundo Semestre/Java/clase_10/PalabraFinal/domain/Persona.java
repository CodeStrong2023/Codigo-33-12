package clase_10.PalabraFinal.domain;

public class Persona {
    
    // Atributo
    public final static int CONSTANTE_A = 15;
    
    private String nombre;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo    
    public void imprmir(){
        System.out.println("Metodo para imprimir");
    }
}