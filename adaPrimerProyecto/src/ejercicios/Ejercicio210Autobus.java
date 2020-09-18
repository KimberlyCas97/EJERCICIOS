package ejercicios;

import java.util.Scanner;

public class Ejercicio210Autobus {
	private static final int MINIMO_PERSONAS = 20;
	private static final int COSTO_A = 2;
	private static final float COSTO_B = 2.5f;
	private static final int COSTO_C = 3;
	private static final String BUS_A = "A";
	private static final String BUS_B = "B";
	private static final String BUS_C = "C";

	public static void main(String[] args) {

		// tres costos diferentes para cada autobus por km
		// mínimo 20 personas
		// determinar costo total
		// determinar costo por persona

		// solicitar la cantidad de personas
		// solicitar la cantidad de km que va a recorrer
		// solicitar tipo de autobús
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cantidad de personas");
		int personas = sc.nextInt();

		System.out.println("Ingrese la cantidad de km");
		int km = sc.nextInt();

		System.out.println("Ingrese el tipo de bus A,B,C");
		String tipo = sc.next();

		int totalPersonas = MINIMO_PERSONAS;
		// cálculo del costo total//
		if (personas < MINIMO_PERSONAS) {
			totalPersonas = personas;
		}

		// calcular costo total;
		// total de personas * km * precio boleto

		int costoTotal = totalPersonas * km;
		float totalGrupal = 0;

		switch (tipo.toUpperCase()) {
		case "A":
			totalGrupal = costoTotal * COSTO_A;
			break;
		case "B":
			totalGrupal = costoTotal * COSTO_B;
			break;
		case "C":
			totalGrupal = costoTotal * COSTO_C;
			break;

		}

		System.out.println("El total grupal es:" + totalGrupal);

		sc.close();

	}
}
