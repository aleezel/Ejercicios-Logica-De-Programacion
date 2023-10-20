// Función que ejecuta el submit
function capturar() {
    // Obtiene mi número del input a través del ID y lo convierte directamente a parseFloat
    let numero = parseFloat(document.getElementById("numInput").value);

    // A través de una concidicional, verifica si sí es un parseFloat para mandar un alert en caso de que no sea un número. Si pasa ese filtro, ejecuta la función de factorial.
    if (isNaN(numero)) {
        alert("Por favor ingresa un número válido");
    } else {
        factorial(numero);
        console.log("holakase");
    }
}

// La función de Factorial, recibe "numero" como parámetro para hacer un for para multiplcarse para sí mismo a través del incremental i++. 
function factorial(numero) {
    let total = 1;
    for (let i = 1; i <= numero; i++) {
        total *= i;
    }
    alert("El número factorial es: " + total);
}

