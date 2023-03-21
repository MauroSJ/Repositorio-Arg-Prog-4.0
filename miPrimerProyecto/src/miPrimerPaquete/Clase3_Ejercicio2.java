package miPrimerPaquete;

import java.util.Arrays;

public class Clase3_Ejercicio2 {

	public static void main(String[] args) {
		/*1-b. Dados 3 numeros y un orden (ascendente o decreciente) que ordene los mismos y los retorne en un vector de 3*/

		int numeros[] = new int [3];
			numeros[0] = 8;
			numeros[1] = 16;
			numeros[2] = 13;
			
		 Arrays.sort(numeros);
		 System.out.println(Arrays.toString(numeros));
		 
		 for(int i= numeros.length-1; i>= 0; i--) {
			 System.out.println(numeros[i]);
		 }
		
	}

}
