let mes = 11; //Introducir un numero del 1 al 12
switch (mes) {
    case 1:
        console.log("Enero");
        break;
    case 2:
        console.log("Febrero");
        break;
    case 3:
        console.log("Marzo");
        break;
    case 4:
        console.log("Abril");
        break;
    case 5:
        console.log("Mayo");
        break;
    case 6:
        console.log("Junio");
        break;
    case 7:
        console.log("Julio");
        break;
    case 8:
        console.log("Agosto");
        break;
    case 9:
        console.log("Septiembre");
        break;
    case 10:
        console.log("Octubre");
        break;
    case 11:
        console.log("Noviembre");
        break;
    case 12:
        console.log("Diciembre");
        break;
    default:
        console.error("ERROR: Més inválido (del 1 al 12)");
        break;
}

let numeroStr = "Cinco" // Introducir numero del 1 al 5 en String
let numeroInt;
switch (numeroStr.toLowerCase()) {
    case "uno":
        numeroInt = 1;
        break;
    case "dos":
        numeroInt = 2;
        break;
    case "tres":
        numeroInt = 3;
        break;
    case "cuatro":
        numeroInt = 4;
        break;
    case "cinco":
        numeroInt = 5;
        break;
    default:
        console.error("ERROR: Numero inválido (del 1 al 5)");
        break;
}
console.log(numeroInt);