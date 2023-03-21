package miPrimerPaquete;

public class Clase3_Ejercicio1 {

	public static void main(String[] args) {
		
		/*1-a. Dado un string y una letra, que cuente la cantidad de apariciones de la letra en el string*/
		
		String palabra = "Argentina";
		int contador = 0, posicion =0;
		char letra = 'u';
		String palabra_min = palabra.toLowerCase();
		
		posicion = palabra_min.indexOf(letra);
		
		if(posicion != -1) {
		while (posicion != -1) {
			contador ++;
			posicion = palabra_min.indexOf(letra,posicion+1);
		}
		System.out.println("El caracter " + letra + " aparece " + contador + " veces");
		}else
			System.out.println("No se encuentra la letra en la palabra " + palabra);
		
		

	}

}
