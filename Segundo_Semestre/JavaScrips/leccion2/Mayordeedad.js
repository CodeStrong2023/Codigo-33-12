
let a, b;
a = 19;
b = 11;

if (a >= 18) {
    console.log("Es mayor de edad");
} else {
    console.log("Es menor de edad")
}
if (b >= 18) {
    console.log("Es mayor de edad");
} else {
    console.log("Es menor de edad")
}
///
//
//
let dentrodelrango = 5;
let operadorA = 0 , operadorB = 10;
if (dentrodelrango >= operadorA && dentrodelrango <= operadorB) {
    console.log("Usted se encuentra dentro del rango");
}else {
    console.log("Usted se encuentra fuera del rango")
}

let vacaciones = true, diaDescanso = false;

if (vacaciones || diaDescanso) {
    console.log("El padre podra asistir");
} else {
    console.log("El padre no podra asistir");
}

let resultado = 3 > 2? "Verdadero" : "falso";
console.log(resultado);

let numero = 9;
resultado = numero % 2 == 0? "Par": "Impar";
console.log(resultado);

let minumero = "18"; // no ingresar letras
console.log(typeof minumero);
let edad2 = Number(minumero);
console.log( typeof edad2);



if (isNaN(edad2)) {
    console.log("esta variable no tiene solo números")
} else {
    if (edad2 >= 16) {
    console.log("Puede votar")
    } else {
    console.log("No puede votar")
    }
}
let resultado2 = edad2 >= 16? "Puede votar": "No puede votar";
console.log(resultado2);