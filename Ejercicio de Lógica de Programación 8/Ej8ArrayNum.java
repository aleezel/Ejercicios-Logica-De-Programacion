package ejerciciosLogica;

import java.util.Scanner;

public class Ej8ArrayNum {

	public static void main(String[] args) {
		Scanner numRecibido=new Scanner(System.in);
		int[] numeros= new int[10];
		boolean[] numPrimo=new boolean[10];
		int[] numOrden=new int[10];
		byte i=0;
		
		//Mensaje para decirle al usuario que ingrese 10 números
		System.out.println("Por favor, escriba 10 números");
		
		
		String numeroString=null;
		do {
			numeroString= numRecibido.nextLine();
			if(numeroString.matches("\\d{1,}")) {
				
				int numero=Integer.parseInt(numeroString); //El dato ingresado se convierte a Int Byte
				numeros[i]=numero;
				i++;
			}else {
				System.out.println("Por favor, ingrese solo números");
			}
		}while(i<=9);
		
		numRecibido.close();
		
		
		//Imprimir en consola los datos ingresados
		byte posicion=0;
		System.out.println("Array: ");
        while (posicion < numeros.length) {
            System.out.println("pos["+posicion+"] = " +numeros[posicion]);
            posicion++;
        }
        
        //Con este while se evalua si es primo
        posicion=0;
        while (posicion< numeros.length) {
            numPrimo[posicion] = true;
            
            if (numeros[posicion] <= 1) {
                numPrimo[posicion] = false; 
            } else {
                for (int k = 2; k <= Math.sqrt(numeros[posicion]); k++) {
                    if (numeros[posicion] % k == 0) {
                    	// Se evalúa si el número es divisible por el iterador i, no es primo
                        numPrimo[posicion] = false;
                        // Se rompe el ciclo
                        break; 
                    }
                }
            }
            posicion++;
        }
        
       //
        byte posicion2=0;
        byte cantidadDeNumPrimos=0;
        
        // Con este while se ordenan los números primos
        while (posicion2< numeros.length) {
        	if(numPrimo[posicion2]==true) {
        		numOrden[cantidadDeNumPrimos]=numeros[posicion2];
        		cantidadDeNumPrimos++;
        	}
        	posicion2++;
        }
        
        
        System.out.print("Los números primeros a continuación: " + cantidadDeNumPrimos);
      
        //Ordenar los números no primos
        byte cantidadDeNumNOPrim=0;
        posicion2=0;
        // 
        while (posicion2< numeros.length ) {
        	if(numPrimo[posicion2]==false) {
        		numOrden[cantidadDeNumPrimos+cantidadDeNumNOPrim]=numeros[posicion2];
        		cantidadDeNumNOPrim++;
        	}
        	posicion2++;
        }
	
        byte posicionMostrar=0;
		System.out.println("Array con números primos primero: ");
        while (posicionMostrar < numeros.length) {
            System.out.println("pos["+posicionMostrar+"] = " +numOrden[posicionMostrar]);
            posicionMostrar++;
        }
        

	}

}