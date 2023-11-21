// Ejercicio 1: calcular estacion del año
// Ejercicio 2: Hora del dia

// Ejercicio 1
let mes =9;
let estacion; //Undefined
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto";
}
console.log("El valor corresponde a la estacion de: "+estacion);

// Ejercicio 2: Hora del dia
/*
de 6 a 11 nos saluda: Good Morning
de 12 a 16 nos saluda: Good afternoom
de 17 a 19 nos saluda: Good evening
de 20 a 23 nos saluda: Good night
Trabajamos con 24 horas
*/ 
let horaDia = 20;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje = "Good Morning";
}
else if(horaDia >= 12 && horaDia <= 16){
    mensaje = "Good Afternoom";
}
else if(horaDia >= 17 && horaDia <= 19){
    mensaje = "Good Evening";
}
else if(horaDia >= 20 && horaDia <= 23){
    mensaje = "Good Night";
}
else{
    mensaje = "Valor Incorrecto";
}
console.log(mensaje);

// Estructura switch (La sintaxis es igual a Java)
switch(mes){ //No solo se pueden utilizar numeros, tambien cadenas
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";    
}
console.log("Bienvenido a la estacion de: "+estacion);