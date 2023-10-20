// Función que ejecuta el submit
function capturar() {
    // Obtiene mi número del input a través del ID y lo convierte directamente a parseFloat
    let numCelsius = parseInt(document.getElementById("numInput").value);

    // A través de una concidicional, verifica si sí es un parseFloat para mandar un alert en caso de que no sea un número. Si pasa ese filtro, ejecuta la función de factorial.
    if (isNaN(numCelsius)) {
        alert("Por favor ingresa un número válido");
    } else {
        conversion(numCelsius);
        console.log("olakace");
    }
}

// La función de Factorial, recibe "numero" como parámetro para hacer un for para multiplcarse para sí mismo a través del incremental i++. 

function conversion (numCelsius){
    let resultadoFaren = (numCelsius *(9/5)) + 32;
    let resultadoKelvin = (numCelsius + 273.15);

    mensajeResultado = numCelsius + "C° son equivalentes a " + "\n" + "Grados en Fahrenheit: " + resultadoFaren + "\n" + "Grados en Kelvin: " + resultadoKelvin;
    alert(mensajeResultado);
}


