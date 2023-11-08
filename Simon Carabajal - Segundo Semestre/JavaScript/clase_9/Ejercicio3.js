
// Ejercicio 3 / Funcion Number: Es mayor de edad (convertir a string)

let numero = "40";
console.log(typeof numero);

let edad = Number(numero);
console.log(typeof edad)

if (edad >= 18){
    console.log("Es mayor de edad.")
}
else{
    console.log("Es menor de edad")
}

// Con el operador ternario
let resultado = edad >= 18 ? "Es mayor de edad": "Es meor de edad";
console.log(resultado);
