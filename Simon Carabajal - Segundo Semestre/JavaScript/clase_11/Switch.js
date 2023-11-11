//Evitar repetir tu código
//Dry don't repeat yourself


// Version 1
let days = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sábado', 'Domingo'];

function getDay(n){
    if(n < 1 || n > 7){
        throw new Error('out of range');
    }
    return days[n-1];
}

switch (days) {
    case 'Lunes':
        console.log('hoy es ' +days);
        break;
    case 'Martes':
        console.log('hoy es ' +days);
        break;
    case 'Miercoles':
        console.log('hoy es '+days);
        break;
    case 'Jueves':
        console. log('hoy es '+days);
        break;
    case 'Viernes' :
        console.log('hoy es '+days);
    case 'Sabado' :
        console.log('hoy es '+days);
    case 'Domingo' :
        console.log('hoy es '+days);
    default:
        break;
    }
    

// Version 2
let days2 = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sábado', 'Domingo'];
function getDay(n){
    if(n < 1 || n > 7){
        throw new Error('out of range');
    }
    return days2[n-1];
}

console.log(getDay(5));