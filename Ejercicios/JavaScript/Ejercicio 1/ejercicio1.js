let string = "hola";
console.log(string);
console.log(typeof string + "\n");

let number = 123;
console.log(number);
console.log(typeof number + "\n");

let boolean = true;
console.log(boolean);
console.log(typeof boolean + "\n");

let nulo = null;
console.log(nulo);
console.log(typeof nulo + "\n");

let indefinido;
console.log(indefinido);
console.log(typeof indefinido + "\n");

let simbolo = Symbol("Hola");
console.log(simbolo);
console.log(typeof simbolo + "\n");

let objeto = {
    nombre : "pepe",
    descripcion : "webo",
    mas : "mas"
};
console.table(objeto);
console.log(typeof objeto + "\n");

let array = [1, true, "webos"];
console.table(array);
console.log(typeof array + "\n");

let variableGlobal = "soy una variable global"
function funcion() {
    console.log("soy una funcion");
    //variable local funcion
    let variableLocal = "soy una variable local";
    console.log(variableLocal);
    console.log(variableGlobal)
};
console.table(funcion);
console.log(typeof funcion + "\n");

funcion();






