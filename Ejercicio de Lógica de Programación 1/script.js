

function capturar() {
    // Obtiene mi número del input a través del ID y lo convierte directamente a parseFloat
    let num1 = parseInt(document.getElementById("num1").value);
    let num2 = parseInt(document.getElementById("num2").value);
    let num3 = parseInt(document.getElementById("num3").value);

    // A través de una concidicional, verifica si sí es un parseFloat para mandar un alert en caso de que no sea un número. Si pasa ese filtro, ejecuta la función de factorial.
    if (isNaN(num1 && num2 && num3)) {
        alert("Por favor ingresa un número válido en cada campo");
    } else {
        ordenarNumeros(num1, num2, num3);
    }
}

function ordenarNumeros(num1, num2, num3){
    let numMayor = Math.max(num1, num2, num3);
    let numMenor = Math.min(num1, num2, num3);
    let numMedio = (num1 + num2 + num3) - numMayor - numMenor;

    let mensajeResultado = "Orden ascendente: " + numMenor + " " + numMedio + " " + numMayor + "\n" + "Orden descendente: " + numMayor + " " + numMedio + " " + numMenor;
    alert(mensajeResultado);
    console.log(numMayor);
}