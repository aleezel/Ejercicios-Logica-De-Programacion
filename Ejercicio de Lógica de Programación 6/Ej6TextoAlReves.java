package ejerciciosLogica;

import java.util.Scanner;

public class Ej6TextoAlReves {

	public static void main(String[] args) {
		//Se obtiene la palabra a través de un scanner
		System.out.println("Escribe una palabra para devolverla de forma reversa");
		Scanner promptPalabra = new Scanner(System.in);
			
		String palabraRecibida= promptPalabra.nextLine();
		
		//se cierra el scanner para que ya no ocupe memoria
		promptPalabra.close();
		
		//Aquí se guardará el resultado de la palabra cuando esté disponible
		String resultado = "";
		
		//Aplicaré reversa a través de un ciclo for. 
		//Se iterará sobre el largo de caracteres de la cadena.
		//O sea, el iterador va a recibir un número entero que es el largo de la palabra que escribamos, menos 1. Se resta el uno ya que accederemos después al número de índices. La iteración del ciclo for va a parar hasta que el iterador llego a 0, o sea, que haya recorrido todas las letras. Este iterador irá decrementando.
		for (int i = palabraRecibida.length() -1; i >= 0; i-- ) {
			
			//Para mostrar la palabra al reverso, con el método string charAt, se accede a el caracter a través de su número de índice a través de un int (indicado por la cantidad de letras que tenga la palabra). Se devuelve el caracter al que se accedió. Y como va decrementando, hace la función de ir de atrás para adelante. 
			resultado+= palabraRecibida.charAt (i);
			
		}
		
		//Imprimir el resultado
		System.out.println(resultado);
	}

}
