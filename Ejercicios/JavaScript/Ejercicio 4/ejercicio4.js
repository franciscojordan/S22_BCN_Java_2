function suma(primero, segundo, tercero){
    resultado = primero + segundo + tercero;
    return resultado;
}

console.log(suma(1,2,3));

function nombreCompleto(nombre, apellido1, apellido2){
    resultado = nombre + " " + apellido1 + " " + apellido2;
    return resultado;
}

console.log(nombreCompleto("Francisco", "Jordan", "Garcia"));

function numeroMayor(numero1, numero2) {
    if (numero1 > numero2) {
        return numero1;
    }
    return numero2;
}

console.log(numeroMayor(98432, 870752970));