
console.log("Calcular estación del año");
let mes = 4;
if (mes>0 && mes<4) {
    console.log("Verano")
} else if (mes >= 4 && mes < 7 ) {
    console.log("Otoño")
} else if (mes >= 7 && mes < 9) {
    console.log("Invierno")
} else if (mes >= 9 && mes < 12) {
    console.log("Primavera")
}else  {
    console.log("Mes inexistente")
}
//

console.log("Horas del día")
let hora = 8;
if (hora >= 0 && hora <=7) {
    console.log("Duermo")
} else if (hora > 7 && hora <= 8) {
    console.log("Me levanto y desayuno")
} else if (hora > 8 && hora <= 12 ) {
    console.log("Estudio")
} else if (hora > 12 && hora <=14) {
    console.log("Como y lavo los platos")
} else if (hora > 14 && hora <=16) {
    console.log("Duermo una siesta")
} else if (hora > 16 && hora <=22) {
    console.log("Hago cosas de la facultad")
} else if (hora > 22 && hora < 23) {
    console.log("Cena")
} else if (hora >= 23 && hora <=24) {
    console.log("Me acuesto")
} else {
    console.log("Hora invalida")
}
//
let estacion= "";
switch (mes) {
    case 1: case 2: case 3:
        estacion=("Verano")
        break;
    case 4: case 5: case 6:
        estacion=("Otoño")
        break;
    case 7: case 8: case 9:
        estacion=("Invierno")
        break;
    case 10: case 11: case 12:
        estacion=("Primavera")
        break;
    default:
        estacion=("Mes inexistente")
        break;
}
console.log("Estación: " + estacion)