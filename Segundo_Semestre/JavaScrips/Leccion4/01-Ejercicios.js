// Var reasigna en cualquier momento y podes cambiar todo
var nombre = "Ariel";
nombre = "osvaldo";

function saludar() {
    var nombre3 = "Natalia";
    console.log(nombre3);
}
//no va a leer el dato de la funcion
// nombre 3 no sera leido
console.log (nombre);

if (true) {
    var edad = 34;
    console.log (edad);
}
//console.log(edad); Esto funciona pero no deberia filtrar la info

function saludar2() {
    let nombre2 = "Gianella";
    console.log(nombre2);
}
//console.log(nombre2);
// let respeta los bloques
if (true) {
    let edad2 = 18;
    console.log(edad2);
}
//console.log(edad2);
const añoNacimiento = 2005;
console.log(añoNacimiento)
//añoNacimiento = 2004;
//console.log(añoNacimiento) No se puede reasignar el tipo const

