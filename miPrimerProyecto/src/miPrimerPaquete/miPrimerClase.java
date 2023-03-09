package miPrimerPaquete;

public class miPrimerClase {

	public static void main(String[] args) {
		int variableInicio = 3, variableFinal = 12;
		boolean imprimirPares = true;
		
		/* 1-a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
		y “b”.*/
		/*while(variableInicio<=variableFinal) {
			System.out.println(variableInicio);
			variableInicio ++;
		}*/
		
		
		/*b. A lo anterior, solo muestre los números pares*/
		/*while(variableInicio<=variableFinal) {
			if(variableInicio%2==0) {
				System.out.println(variableInicio);
			}
			variableInicio ++;
		}*/
		
		
		
		/*c. A lo anterior, con una variable extra, elija si se deben mostrar los números
		pares o impares*/
		
		/*while(variableInicio<=variableFinal) {
			if(imprimirPares==true) {
				if(variableInicio%2 == 0) {
					System.out.print(variableInicio+ "-");
				}
			}else {
				if(variableInicio%2 != 0) {
					System.out.print(variableInicio+ "-");
				}
				
			}
			variableInicio ++; 	
		}*/
		
		
		/*d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden*/
		/*for(int i = 15;i>=variableInicio;i--) {
			if(i%2==0) {
				System.out.println(i);	
			}
		}*/
	
		
		
		/*2. Dado el siguiente texto, vamos a atacar el siguiente problema: “determinar si una
	persona pertenece al segmento de ingresos altos”. Del i al iii, la idea es hacerlo en
	papel y lápiz y sólo implementar el cuarto.
	“Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a
	todas y todos los convivientes:
	● Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
	(3,5 canastas básicas para un hogar tipo 2 según el INDEC).
	● Tener 3 o más vehículos con una antigüedad menor a 5 años.
	● Tener 3 o más inmuebles.
	● Poseer una embarcación, una aeronave de lujo o ser titular de activos
	societarios que demuestren capacidad económica plena.”*/
		
		double ingresosMensuales = 489.083;
		int cantidadDeVehiculos = 3, antiguedadVehicular = 5, inmuebles = 3;
		boolean embarcacion = true, aeronaveDeLujo = true, titularDeActivos = true;
		
		if(ingresosMensuales >= 480) {
			if(cantidadDeVehiculos >=3 && antiguedadVehicular <= 5) {
				if(inmuebles >=3) {
					if(embarcacion ==true && aeronaveDeLujo==true && titularDeActivos ==true) {
						System.out.println("Persona de ingresos altos");
					}
				}
			}
		}

	}

}
