package clases;

import java.util.Scanner;

public class GestorEntradaSalidaMoneda {

	private Scanner scanner;

	/**
	 * constructor de la clase GestorEntradaSalida abre el scanner
	 */
	public GestorEntradaSalidaMoneda() {
		this.scanner = new Scanner(System.in);
	}

	public double obtenerCantidad() {
		System.out.println("Ingrese la cantidad a convertir:");
		return scanner.nextDouble();
	}

	public int obtenerOpcion() {
		System.out.println("Seleccione la moneda a la que desea convertir:");
		System.out.println("1.- Euro");
		System.out.println("2.- Dolar");
		return scanner.nextInt();
	}

	public void mostrarResultado(String simboloMoneda, double cantidadConvertida) {
		System.out.println("Cantidad convertida a " + simboloMoneda + ": " + cantidadConvertida);
	}

	public void cerrarScanner() {
		scanner.close();
	}

	public void mostrarMensaje(String string) {
		System.out.println(string);

	}
}
