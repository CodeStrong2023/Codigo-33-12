// Tipos de datos en JavaScript

// Tipo string
// LAs variables se pueden reutilizar
var nombre = 'Daniel';
console.log(typeof nombre);

// Tipo numerico
var numero = 2493;
console.log(typeof numero);

// Tipo objeto
var objeto = {
    nombre : 'Ana',
    apellido : 'Martinez',
    edad: 23
}
console.log(typeof objeto);

// Tipo boolean
var booleano = true;
console.log(typeof booleano);

// Tipo funcion
function funcion(){}
console.log(typeof funcion);

// Tipo symbol
var simbolo = Symbol('Mi simbolo')
console.log(typeof simbolo);

// Tipo clase

class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona);