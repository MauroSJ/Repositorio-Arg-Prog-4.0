package miPrimerPaquete;

public class claseNumero3ArraysStrings {

	public static void main(String[] args) {
		/*int vector1 [] = new int [5];
		
			vector1[0] = 12;
			vector1[1] = 25;
			vector1[2] = 45;
			vector1[3] = 56;
			vector1[4] = 78;
			
		for(int i = 0 ; i<vector1.length; i++) {
			System.out.println(vector1[i]);
		}*/
		
		
		String texto1 = "Buenos dias";
		String texto2 = "Buenas tardes";
		String texto4 = "Argentina Programa 4.0 - Java Inicial";
		
		boolean texto3 = texto1.equals(texto2);
		System.out.println("equals: " + texto3);
		
		System.out.println("Pasar a mayuscula/minuscula " + texto1.toLowerCase() + " " + texto2.toUpperCase());
		
		texto3 = texto4.contains("java");
		System.out.println("Contiene java? " + texto3);
		
		boolean texto5 = texto4.toLowerCase().contains("java");
		System.out.println("Anidado toLowerCase + contains " + texto5);
		
	}

}
