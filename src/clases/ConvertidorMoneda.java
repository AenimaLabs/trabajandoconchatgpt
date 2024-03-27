package clases;

import interfaces.Moneda;

public class ConvertidorMoneda {
	
	
	private GestorEntradaSalida gestorEntradaSalida;
	
	public void convertir(Moneda moneda, double cantidad) {
		double cantidadConvertida = cantidad*moneda.factorConversion();
		gestorEntradaSalida.mostrarResultado(moneda.getSimbolo(), cantidadConvertida);
		
	}
	
	public ConvertidorMoneda(GestorEntradaSalida gestorEntradaSalida) {
		this.gestorEntradaSalida = gestorEntradaSalida;
	}

	

}
