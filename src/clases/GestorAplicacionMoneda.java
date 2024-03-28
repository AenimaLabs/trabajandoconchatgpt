package clases;

import interfaces.Moneda;

public class GestorAplicacionMoneda {
	private GestorEntradaSalidaMoneda gestorES;
	private ConvertidorMoneda convertidor;

	public GestorAplicacionMoneda() {
		this.gestorES = new GestorEntradaSalidaMoneda();
		this.convertidor = new ConvertidorMoneda(gestorES);
	}

	public void ejecutar() {
		double cantidad = gestorES.obtenerCantidad();
		int opcion = gestorES.obtenerOpcion();

		Moneda moneda;
		if (opcion == 1) {
			moneda = new Euro();
		} else if (opcion == 2) {
			moneda = new Dolar();
		} else {

			gestorES.mostrarMensaje("Opción no válida.");
			gestorES.cerrarScanner();
			return;
		}

		convertidor.convertir(moneda, cantidad);

		gestorES.cerrarScanner();
	}

}
