package clases;

import interfaces.Moneda;

public class ConvertidorMoneda {

	private GestorEntradaSalidaMoneda gestorEntradaSalida;

	public void convertir(Moneda moneda, double cantidad) {
		double cantidadConvertida = cantidad * moneda.factorConversion();
		gestorEntradaSalida.mostrarResultado(moneda.getSimbolo(), cantidadConvertida);

	}

	public ConvertidorMoneda(GestorEntradaSalidaMoneda gestorEntradaSalida) {
		this.gestorEntradaSalida = gestorEntradaSalida;
	}

}
