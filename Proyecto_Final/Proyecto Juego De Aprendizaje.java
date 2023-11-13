package Juego;


import java.util.Scanner;
public class Juego01 {
    public static void main(String...args){
        char res;
        Scanner lector=new Scanner(System.in);   
        System.out.println("Resistencia es la capital de Chaco: ");
        res=lector.next().charAt(0);
        if (res=='s'){
	    System.out.println("9x9 es = a 81?");
	    res=lector.next().charAt(0);
            if(res=='s'){
               System.out.println("La Localidad de San Bernardo pertenece al departamento O' Higgins?");
               res=lector.next().charAt(0);
               if (res=='s')
                   System.out.println("Felicidades has ganado el juego!");          
                else  
                   System.out.println("Incorrecto has perdido el juego!");
        }else
             System.out.println("Incorrecto has perdido el juego!");
    }else
            System.out.println("Incorrecto has perdido el juego!");
}                       
}
			
