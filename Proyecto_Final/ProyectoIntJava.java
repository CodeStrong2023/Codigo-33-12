package proyectointjava;

import java.util.Scanner;


public class ProyectoIntJava {
            
 
    public static void main(String[] args) {
                int intentos;
		int num_secreto;
		String res;
		res = "si";
		System.out.println("------------------");
		System.out.println("****BIENVENIDO****");
		System.out.println("**Adivine el numero**");
		System.out.println("-------------------");
		System.out.println("***Ingrese Usuario***");
		System.out.println("***para continuar****");
		System.out.println("-------------------");
    	        Scanner entrada = new Scanner(System.in);
		String usuario = entrada.nextLine();
                
		
		while (res.equals("si")) {
			System.out.println("------------------------------------");
			System.out.println("******* para iniciar elija *****");
			System.out.println("********* un nivel **********");
			System.out.println("Nivel 1: numeros del 1 al 10 (3 intentos)");
			System.out.println("Nivel 2: numeros del 1 al 100 (10 intentos)");
                        //Pedirle un numero al usuario
			int inicio = entrada.nextInt();
                        entrada.nextLine();
			
			switch (inicio) {
			case 1:{
                            intentos = 3;
                            num_secreto = (int)((Math.random()*10)+1);
                            System.out.println("--Adivine el numero desconocido-- (de 1 a 10):");
                            res =(Juego(intentos,num_secreto,usuario));
                            break;
                        }
			case 2:{
                            intentos = 10;
                            num_secreto = (int)((Math.random()*100)+1);
                            System.out.println("--Adivine el numero desconocido-- (de 1 a 100):");
                            res =(Juego(intentos,num_secreto,usuario));
                            break;
                        }
                    }
		}
	}
    public static String Juego(int intentos, int num_secreto, String usuario){
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese un numero: ");
                int num_ingresado = entrada.nextInt();
                int intentos2 = 1;
                entrada.nextLine();
		while (num_secreto!=num_ingresado && (intentos> 1)) {
			if (num_secreto>num_ingresado) {
				System.out.println("El numero ingresado es muy Bajo");       
			} else {
				System.out.println("El numero ingresado es muy Alto");        
			}
			intentos = intentos-1;
                        intentos2 = intentos2+1;
                        System.out.println("Le quedan "+intentos+" intentos: ");
			num_ingresado = entrada.nextInt();
                        entrada.nextLine();
		}
		if (num_secreto==num_ingresado) {
			System.out.println("----------------------------------");
			System.out.println("*******Felicidades "+usuario+"!!******");
			System.out.println("*****Conseguido en "+intentos2+" intentos****");
			System.out.println("-----------------------------------");
		} else {
			System.out.println("--El numero era: "+num_secreto+"--");
		}
		System.out.println("Jugar de nuevo -Si- o -No-");
                String res = entrada.nextLine();
	        return res;
	}
    }

    

