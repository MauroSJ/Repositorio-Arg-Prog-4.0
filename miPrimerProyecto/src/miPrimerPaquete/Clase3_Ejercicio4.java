package miPrimerPaquete;

public class Clase3_Ejercicio4 {

	public static void main(String[] args) {
		/*2-Utilice el metodo Split para separar una lista de 10 nombres tomados de una variable, luego muestre por consola el resultado*/
		
		String nombres = "Mauro Lucas Marcos Marcelo Leonel Facundo Bruno Ricardo Rodrigo Isaias";
		String nombre [] = nombres.split(" ");
		
		for(int i = 0; i<nombre.length; i++) {
			System.out.println(nombre[i]);
		}

	}

}
