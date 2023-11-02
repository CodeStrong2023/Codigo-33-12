// Ejercicio 1: Calcular estacion del año
let mes = 1;
let estacion;

if (mes == 1 || mes == 2 || mes == 12) {
    estacion = "Verano";
}
else if (mes == 3 || mes == 4 || mes == 5) {
    estacion = "Otoño";
}
else if (mes == 6 || mes == 7 || mes == 8) {
    estacion = "Invierno";
}
else if (mes == 9 || mes == 10 || mes == 11) {
    estacion = "Primavera";
}
else {
    estacion = "Valor incorrecto";
}

console.log("La estacion es " + estacion);


// Ejercicio 2: Hora del dia

let hora = 13;
let pastilla;

if (hora == 11) {
    pastilla = "Debe tomar la pastilla azul";
}
else if (hora == 13) {
    pastilla = "Debe tomar la pastilla roja";
}
else if (hora == 15) {
    pastilla = "Debe tomar la pastilla naranja";
}
else if (hora == 17) {
    pastilla = "Debe tomar la pastilla verde";
}
else if (hora == 19) {
    pastilla = "Debe tomar la pastilla rosa";
}
else if (hora == 21) {
    pastilla = "Debe tomar la pastilla blanca";
}
else {
    pastilla = "No debe tomar ningun medicamento"
}
console.log(pastilla);

// Ejercicio 3

switch (mes) {
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log("La estacion es " + estacion);