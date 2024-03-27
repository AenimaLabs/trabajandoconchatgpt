package clases;

import interfaces.Moneda;

public class Dolar implements Moneda {

	@Override
	public String getSimbolo() {
		
		return "USD$";
	}

	@Override
	public double factorConversion() {
		
		return 0.001021;
	}


}
