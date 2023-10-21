package ejerciciosLogica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Ej10DiccEspIngles {

	public static void main(String[] args) {
		//Se guardan todas las palabras en el hashMap
		Map<String,String> diccionario = new HashMap<>();
				
		//Agregar palabras
		diccionario.put("manzana", "apple");
		diccionario.put("sandía", "watermelon");
		diccionario.put("flor", "flower");
		diccionario.put("venado", "deer");
		diccionario.put("lapiz", "pencil");
		diccionario.put("rojo", "red");
		diccionario.put("amarillo", "yelow");
		diccionario.put("naranja", "orange");
		diccionario.put("hoja", "paper");
		diccionario.put("vaso", "glass");
		diccionario.put("crema", "cream");
		diccionario.put("café", "coffee");
		diccionario.put("ratón", "mouse");
		diccionario.put("cámara", "camera");
		diccionario.put("luz", "light");
		diccionario.put("lavanda", "lavender");
		diccionario.put("tornado", "tornado");
		diccionario.put("rana", "frog");
		diccionario.put("vestido", "dress");
		diccionario.put("blanco", "white");
		
		ArrayList <String> palabrasEnEspañol = new ArrayList<>(diccionario.keySet());
		ArrayList<String> palabrasCorrectas= new ArrayList<>();
		ArrayList<String> palabrasNoOK= new ArrayList<>();
		
		Scanner escaner= new Scanner (System.in);
		String palabraIngles;
		byte palabrasIncorrectas=0;
		
		
		
		for(int i=0; i<5; i++) {
			// Generar un número aleatorio para seleccionar un elemento al azar
	        Random rand = new Random();
	        int indiceAleatorio = rand.nextInt(palabrasEnEspañol.size());

	        // Obtener el valor correspondiente al índice aleatorio
	        String elementoAzar = palabrasEnEspañol.get(indiceAleatorio);
	        
	        //Pedir la traducción
	        System.out.println("¿Como se escribe "+elementoAzar+" en inglés? ");
	        palabraIngles=escaner.nextLine();
	        
	        //Evaluar si la palabra ingresada es correcta
	        if (!diccionario.containsValue(palabraIngles)) {
	        	palabrasNoOK.add("La traducción correcta de "+elementoAzar+ " es: "+ diccionario.get(elementoAzar));
	        	palabrasIncorrectas++;
	        }else {
	        	palabrasCorrectas.add("Correcto, "+elementoAzar+ " en inglés es: "+ diccionario.get(elementoAzar));
	        }
	        
		}
		escaner.close();
		
		//Impresiones en consola
		System.out.println("Palabra correctas: "+(5-palabrasIncorrectas));
		for(String txtImprimirOK:palabrasCorrectas) {
			System.out.println(txtImprimirOK);
		}
		
		System.out.println("Palabra incorrectas: "+palabrasIncorrectas);
		
		for(String txtImprimirNoOK:palabrasNoOK) {
			System.out.println(txtImprimirNoOK);
		}

	}

}