// Concatenar con variables
var nombre = 'Mario';
var apellido = 'Aguilera';
var usuario1 = nombre+' '+apellido;

console.log(usuario1);

// Concatenar directamente
var usuario2 = 'Abril'+' '+'Gonzales';
console.log(usuario2);

// Concatenar distintos datos - Contexto String / Cadena
var usuario3 = nombre + 123; // se lee como tipo string
console.log(usuario3)

usuario3 = nombre + 1 + 2 + 3;  // se lee como tipo string, no se suma
console.log(usuario3)

usuario3 = nombre + (1 + 2 + 3); // Se lee como int, se suman los valores
console.log(usuario3)

usuario3 = 1 + 2 + 3 + nombre; // Se lee como int, se suman los valores
console.log(usuario3)

// Concatenar con operadores
nombre += apellido;
console.log(nombre)

// Ya no se usa ver, se usa let u const
let nombre2 = 'Samanta';
console.log(nombre2);

const apellido2 = 'Juarez';
console.log(apellido2)
