

function caraOCruz() {
    random = Math.round(Math.random());
    if (random == 1) {
        resultado = "Cara";
    } else {
        resultado = "Cruz"
    }
    return resultado;
};

console.log(caraOCruz());