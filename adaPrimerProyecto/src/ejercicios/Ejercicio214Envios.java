package ejercicios;

import java.util.Scanner;

public class Ejercicio214Envios {
	private static final float COSTO_AMERICANORTE = 11.00f;
	private static final float COSTO_AMERICACENTRO = 10.00f;
	private static final float COSTO_AMERICASUR = 12.00f;
	private static final float COSTO_EUROPA = 24.00f;
	private static final float COSTO_ASIA = 27.00f;
	private static final int PESO_MAX = 5000;

	public static void main(String[] args) {
		int pesoPaq;

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el peso del paquete");
		pesoPaq = sc.nextInt();

		while (pesoPaq < 0) {
			System.out.println("Ingrese un valor válido");
			pesoPaq = sc.nextInt();
		}

		float costoEnvio = 0;
		if (pesoPaq > PESO_MAX) {
			System.out.println("Excede peso máximo");
		} else {
			System.out.println("Seleccione su destino 1-5");
			int destino;
			destino = sc.nextInt();

			switch (destino) {
			case 1:
				costoEnvio = pesoPaq * COSTO_AMERICANORTE;
				break;

			case 2:
				costoEnvio = pesoPaq * COSTO_AMERICACENTRO;
				break;

			case 3:
				costoEnvio = pesoPaq * COSTO_AMERICASUR;
				break;

			case 4:
				costoEnvio = pesoPaq * COSTO_EUROPA;
				break;

			case 5:
				costoEnvio = pesoPaq * COSTO_ASIA;
				break;

			}
			System.out.println("El costo total del envio es" + costoEnvio);

			sc.close();

		}
	}

}
