// Función que ejecuta el submit
function capturar() {
    // Obtiene mi número del input a través del ID y lo convierte directamente a parseFloat
    let numero = parseInt(document.getElementById("numInput").value);

    // A través de una concidicional, verifica si sí es un parseFloat para mandar un alert en caso de que no sea un número. Si pasa ese filtro, ejecuta la función de factorial.
    if (isNaN(numero)) {
        alert("Por favor ingresa un número válido");
    } else {
        fibonacciSecuencia(numero);
    }
}

function fibonacciSecuencia(numero) {
    var fibonacciNums = [0, 1];
    
    if (numero === 1) {
        alert(`Secuencia de Fibonacci hasta el paso ${numero}: ${fibonacciNums.slice(0, numero)}`);
    } else {
        for (var i = 2; i < numero; i++) {
            // Se accdeden a los números último y penúltimo del string mediante su índice, pero se tienen que restar el -1 y -2 para acceder a sus respectivos índices correctos, tomando en cuenta que la secuencia del string comienza en 0. Por lo que se tiene que nivelar la secuencia lógica de la siguiente manera
            var nextNum = fibonacciNums[i - 1] + fibonacciNums[i - 2];
            fibonacciNums.push(nextNum);
        }
        alert(`Secuencia de Fibonacci hasta el paso ${numero}: ${fibonacciNums}`);
    }
}

