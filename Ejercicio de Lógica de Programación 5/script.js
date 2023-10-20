
// Declaro los mínimos y máximos 
var numeroRandomax = 100;
var numeroRandomin = 1;

// Con esta variable, se guardará un número al azar con Math random, en donde se definen las limitaciones que tendrá el número generado al azar. 
var numeroRandom = parseInt(Math.random()*(numeroRandomax-numeroRandomin) + numeroRandomin);

// Con el while se ejecuta el código hasta que se adivine el número
while(true){ 

    // Aquí se recibe el número del usuario que se comparará a través del prompt
    var numeroIngresado = prompt("Por favor, introduce un número del 1 al 100 para adivinar el número mágico.🔮");

    //Con esta condicional, se compara la exactitud del número random y el número ingresado por el usuario
    if(numeroIngresado == numeroRandom){ 
        alert("¡Felicidades! Ganaste.✨");
        break;
        // Con el break, se cierra
    }
    // Con este if else, se le da una pista al usuario de que el número que ingresó es menor que el número secreto. Se le notificará cada vez que sea menor el número ingresado.
    else if(numeroIngresado < numeroRandom){
        alert("Tu número es menor al número mágico, sigue participando.🔮" );
    }
    // Con este if else, se le da una pista al usuario de que el número que ingresó es mayor que el número secreto. Se le notificará cada vez que sea mayor el número ingresado.
    else if(numeroIngresado > numeroRandom){
        alert("Tu número sobrepasa al número mágico, sigue participando.🔮");
    }

}

