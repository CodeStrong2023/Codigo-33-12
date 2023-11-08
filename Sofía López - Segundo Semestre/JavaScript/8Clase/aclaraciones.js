/* VAR: 
    Con var se puede reasignar en cualquier momento
    este forma parte del ambito global.
    Un error es que se sobreescriba. 
*/

//Ejemplo 1
var nombre2 = 'Juana';
nombre2 = 'Miguel';
console.log(nombre2);

function saludo(){
    var nombre3 = 'Monica';  //La variable esta definida dentro de la funcion
    console.log(nombre3);
}
// console.log(nombre3); // No se lee el dato dentro de la funcion

//Ejemplo 2
if(true){
    var edad = 24;
    console.log(edad);
}
console.log(edad); //La variable se lee, esto es un error en la estructura if
//Esto pasa por las caracteristicas de var, con let esto no sucede


/* LET: 
    Esta puede ser reasignada en cualquier momento
    la diferencia es que su ambito es de bloque,
    solo disponible dentro de un bloque de llaves
    o dentro de una función
*/

function saludar(){
    let nombre4 = 'Agustina';
    console.log(nombre4);
}
// console.log(nombre4);

if(true){
    let edad2 = 33;
    console.log(edad2);
}
// console.log(edad2);


/* CONST:
    Se utiliza para valores constantes que no se pueden reasignar
*/

const fechaNacimiento = 2005;
console.log(fechaNacimiento);
// fechaNacimiento = 2004;
console.log(fechaNacimiento); //Solo va a leer la primera asignacion