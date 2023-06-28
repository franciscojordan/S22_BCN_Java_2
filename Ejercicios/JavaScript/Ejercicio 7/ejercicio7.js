
function cambiarLetras (input){
    let letraAReemplazar = "a";
    let letraReemplazo = "e";
    while (input.includes("a")) {
        input = input.replace(letraAReemplazar, letraReemplazo);
    }
    console.log(input);
}

cambiarLetras("Palabra con la letra a")

function empiezaPor (input) {
    console.log(input.startsWith("aca"));
}

empiezaPor("academia");
empiezaPor("escuela");

function repetir(input) {
    console.log(input.repeat(3));
}

repetir("Hola");