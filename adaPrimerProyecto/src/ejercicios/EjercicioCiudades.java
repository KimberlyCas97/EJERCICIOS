package ejercicios;

import java.util.Scanner;

public class EjercicioCiudades {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		System.out.println("Ingrese ciudad de partida");
		String partida = Teclado.next();
		System.out.println("Ingrese ciudad destino");
		String destino = Teclado.next();
		System.out.println("Ingrese cantidad de paradas entre" + partida + "y" + destino);
		int cantParadas = Teclado.nextInt();

		int distancias[] = new int[cantParadas + 1];

		for (int i = 0; i < cantParadas; i++) {

		}

	}

}
