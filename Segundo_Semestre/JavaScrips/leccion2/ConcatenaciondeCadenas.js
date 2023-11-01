
var nombre = "Gianella";
var apellido = " Achetoni";
var nombreCompleto = nombre + " " +apellido;
console.log(nombreCompleto);

var nombreCompleto2 = "Mercedes" + " " + "Rosales";
console.log(nombreCompleto2);

var juntos = nombre + 2005;
console.log(juntos);

juntos = nombre + ( 1 + 8); //Al poner parentecis respeta la suma
console.log(juntos);

juntos = 15 + 3 + nombre; //Si la suma esta primero la respeta
console.log(juntos);

nombre += apellido;
console.log(nombre);

let x,y;
x = 17, y = 21;
let z = x + y;
console.log(z)