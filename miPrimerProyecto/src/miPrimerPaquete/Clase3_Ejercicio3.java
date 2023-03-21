package miPrimerPaquete;

public class Clase3_Ejercicio3 {

	public static void main(String[] args) {
		/*1-c. Dado un vector de numeros, y un numero X, que sume todos los numeros >X y retorne el resultado*/
		
		
		int numeros [] = {3,5,12,42,12,34,16};
		int x = 8;
		
		for(int i= 0 ; i < numeros.length; i++) {
			if(x < numeros[i]) {
				x = x + numeros[i];
			}
		}
		System.out.println(x);
		
		
	}

}
