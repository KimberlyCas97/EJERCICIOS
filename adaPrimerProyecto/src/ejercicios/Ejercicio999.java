package ejercicios;

import java.util.Scanner;

public class Ejercicio999 {
	// Ejercicio:
	// Se tiene una linea de 4 cajas donde se cobran facturas que luego seran
	// cargadas
	// en el sistema.
	// Se solicitara el numero de caja y el importe cobrado. La carga finaliza con
	// importe cero.
	// Informar la cantidad de facturas cobradas por cada caja y el promedio de
	// todas las
	// facturas

	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);

		float cajas[] = new float[4];

		float importe = 0.0f;

		float acumulador = 0.0f;

		for (int i = 0; i < 4; i++) {
			System.out.println("Ingrese el importe");
			importe = Teclado.nextFloat();
			cajas[i] = importe;
			acumulador = acumulador + importe;
			System.out.println("mostar " + acumulador);

		}
		float promedio = 0.0f;
		promedio = acumulador / 4;
		System.out.println("mostrar promedio" + promedio);

		Teclado.close();

	}

}
