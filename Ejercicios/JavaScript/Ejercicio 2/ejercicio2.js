const returnNameSurname = (nombre, apellidos) => {
    return nombre + " " + apellidos;
};

console.log(returnNameSurname("Francisco", "Jordan Garcia"));

function printBool(booleano) {
    console.log(booleano)
};

printBool(true);

const valoresInfinitos = function(...values) {
    values.forEach(value => {
        console.log(value);
    });
};

valoresInfinitos(1, 2, 3, 4, 5);