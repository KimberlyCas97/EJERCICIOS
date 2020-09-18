package ejercicios;

import java.util.Scanner;

/**
 * @author USUARIO
 *
 */
public class Ejercicio999Otro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		float importe = 0.0f;
		System.out.println("Ingrese el importe");
		importe = Teclado.nextFloat();
		float cajas[] = new float[4];
		int numeroCaja = 0;
		float acu = 0.0f;
		int cont = 0;

		while (importe > 0.0f) {
			System.out.println("Ingrese el numero de caja");
			numeroCaja = Teclado.nextInt();
			cajas[numeroCaja] = importe;
			acu = acu + importe;
			cont = cont + 1;
			System.out.println("Mostrar el acumulador " + acu);
			System.out.println("Mostrar el contador " + cont);
			System.out.println("Ingrese el importe ");
			importe = Teclado.nextFloat();

		}
		float promedio = acu / cont;

		System.out.println("El promedio de importes es " + promedio);
		System.out.println("El numero de facturas " + cont);

	}
}
