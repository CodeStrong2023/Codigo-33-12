let numero = "44";
console.log(typeof numero);

let edad = Number(numero);
console.log(typeof edad)

if(isNaN(edad)){ //Is Not a Number, devuelve un valor booleano
    console.log("Esta variable no contiene solo números")
}
else{
    if (edad >= 18){
        console.log("Es mayor de edad.")
    }
    else{
        console.log("Es menor de edad")
    }
}