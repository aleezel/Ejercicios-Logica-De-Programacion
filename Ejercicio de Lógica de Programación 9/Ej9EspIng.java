package ejerciciosLogica;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class Ej9EspIng {

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
			
			//A través del escaner, se pide la palabra al usuario
			Scanner escaner= new Scanner (System.in);
			System.out.println("Escribe tu palabra en español");
			String palabra=escaner.nextLine();
			
			//Si la palabra no existe, mostrará un mensaje de retroalimentación
			while(!diccionario.containsKey(palabra)) {
				System.out.println("Ingresa una palabra válida");
				palabra= escaner.nextLine();
			}
			
			escaner.close();
			
			//Si recibe la palabra correcta
			String traduccion = diccionario.get(palabra);
			System.out.println(palabra+" en inglés es: "+traduccion);
			
			
		}//cierre del metodo main

	

}
