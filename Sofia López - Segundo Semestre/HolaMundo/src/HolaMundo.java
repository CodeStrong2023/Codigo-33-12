
import java.util.Scanner;
import javax.print.attribute.standard.PrinterMessageFromOperator;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola mundo desde Java");
        
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programación";
        System.out.println(miVariableCadena);
        
        //Inferencia de tipos var y tipos primitivos
        
        var numEntero = 20; //Las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F;//Se agrega la F en mayusculas porque sino automaticamente despues del punto se convierte en double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0; //se convierte en double
        System.out.println("numDouble = " + numDouble);
        
        //Tipos primitivos char (solo admite 1 caracter, con comillas simples)
        
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter =  '\u0024'; //Se indica a Java la asignación del codigo Unicode ($)
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; //Valor decimal del juego de caracteres Unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; //Caracter especial, se puede copiar y pegar desde Unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        var varCaracter1 =  '\u0024'; //Se indica a Java la asignación del codigo Unicode ($)
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = (char)36; //Valor decimal del juego de caracteres Unicode
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$'; //Caracter especial, se puede copiar y pegar desde Unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
        
        //Tipos primitivos, tipo booleano
        boolean varBool = true;
        System.out.println("varBool = " + varBool);
        
        if(varBool){
            System.out.println("Bandera verde");
        }
        else{
            System.out.println("Bandera roja");
        }
    
        //Algoritmo ¿es mayor de edad?
        var edad = 30;
        var adulto = edad >= 18;
        if(adulto){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");  
        }
        //Simplificado
        /*if (edad >=18) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");  
        }*/
        
        //Conversión de tipos primitivos
        
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir un valor
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("edad = " + edad);
        
       //Conversion de tipos primitivos Java parte 2
       var edadTexto = String.valueOf(10);
       System.out.println("edadTexto = " + edadTexto);
       
       var fraseChar = "programadores".charAt(3);

        //Operadores de asignación parte 1 
         int num1 = 1, num2 = 4;
         var solucion = num1 + num2;
         System.out.println("Solución de la suma = " + solucion);
         
         solucion = num1 - num2;
         System.out.println("Solución de la resta = " + solucion);
         
         solucion = num1 * num2;
         System.out.println("Solución de la multiplicacion = " + solucion); 
         
         solucion = num1 / num2;
         System.out.println("Solución de la división = " + solucion);
         
         var solucion2 = 3.4 / num2;
         System.out.println("Solución resultado de la división = " + solucion);
         
        solucion = num1 % num2; // Guarda el residuo entero de la división
        System.out.println("solucion2 = " + solucion2);
        
        if (num1 % 2 == 0)
            System.out.println("Es número par");
        else
            System.out.println("Es un número impar"); 
        //Operadores de asignación parte 2
        
        int varNum1= 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2; //Una operación
        System.out.println("var3 = " + varNum3);
        
        //suma
        varNum1 += 1; // esta expresión es lo mismo que hacer: varNum1 = varNum1 + 1 
        
        System.out.println("varNum1 = " + varNum1);
        //resta 
        varNum1 -=1; 
        System.out.println("varNum1 = " + varNum1);
        
        //multiplicacion
        varNum2 *= 1;
        System.out.println("varNum2 = " + varNum2);
        
        //division 
        varNum2 /= 2;
        System.out.println("varNum2 = " + varNum2);
       
        //resto de la division
        varNum2 %= 2;
        System.out.println("varNum2 = " + varNum2); 
        
        // >>>>> Ejemplos del video 
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
        
        varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);
        
        //Operadores Unarios: Cambio de Signo
        
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB); //el resultado será un número negativo 
        
        //Operación de negación
        var varC = true; //Esta literal por default en Java es de tipo Boolean
        var varD = !varC; //Aqui se invierte el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
       
        //Operadores Unarios de Incremento: Preincremento
        var varE = 9;//Se va a modificar su valor
        var varF = ++varE; //Simbolo antes de la variable 
        
        //Primero incrementa la variable y después se usa su valor
        System.out.println("varE = " + varE); //Se incrementa en la unidad 
        System.out.println("varF = " + varF); //Va a sumar uno 
        
        //Post-Incremento (el símbolo va después de la variable)
        var varG = 3;
        var varH = varG++; //primero el valor de la variable, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //Operadores unarios de decremento : Predecremento 
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI); //la variable ya está con decremento
        System.out.println("varJ = " + varJ);
        
        //Post-Decremento 
        var varK = 8;
        var varL = varK--; //Primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);
        
        //Operadores de igualdad y Relacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum); //arroja resultado de tipo booleano al comprobar si son iguales
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum; //arroja resultado de tipo booleano al comprobar si se cumple que sean distintos
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hello";
        var cadenaB = "Bye Bye";
        var cadenaC = cadenaA == cadenaB;
        System.out.println("cadenaC = " + cadenaC); // Compara tipos 
        
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar); // Compara el contenido de los string (si son iguales o no) y arroja resultado booleano 
       
        var gVar = aNum != bNum; // > >= < <= == !=
        System.out.println("gVar = " + gVar);
        
        if (aNum % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        
        var edad = 30;
        var adulto = 18;
        if (edad >= adulto){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;

        if (respuesta) {
            System.out.println("Está dentro del rango establecido");
        } else {
            System.out.println("Está fuera del rango establecido");
        }

        var vacaciones = false;
        var diaLibre = false;

        if (vacaciones || diaLibre) {
            System.out.println("Papá puede asistir al juego de su hijo");
        } else {
            System.out.println("Papá no puede asistir al juego de su hijo");
        }

        // Operador Ternario 
        var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);

        var numeroT = 4;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);

        //Prioridad de los Operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var solucionAritmetica = 4 + 5 * 6 / 3; // 4 + ((5 * 6 )/ 3) = 30 / 3 = 10 + 4 = 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);

        solucionAritmetica = (4 + 5) * 6 / 3; // 4 + 5 = 9 * 6 = 54 / 3 = 18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        //Ejercicios de práctica Clase 8
        //Sacar área y perímetro de un rectángulo
        var areaRectangulo = 0;
        var baseRectangulo = 10;
        int alturaRectangulo = 15;
        
        areaRectangulo = (baseRectangulo * alturaRectangulo);
        System.out.println("El área del rectángulo es: " + areaRectangulo);
        
        var perimetro = 2 *(baseRectangulo + alturaRectangulo);
        System.out.println("El perimetro es = " + perimetro);

        //El mayor de 2 números (Operador Ternario)
        Scanner entradaDeValores = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        var numero1 = Integer.parseInt(entradaDeValores.nextLine());
        System.out.println("Ingrese otro número entero:");
        var numero2 = Integer.parseInt(entradaDeValores.nextLine());

        var resultado = (numero1 > numero2) ? num1 : num2;
        System.out.println("El mayor de de los dos números es: " + resultado);
    }
}
