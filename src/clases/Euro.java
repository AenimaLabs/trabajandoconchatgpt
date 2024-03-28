package clases;

import interfaces.Moneda;

public class Euro implements Moneda {

	@Override
	public String getSimbolo() {

		return "€";
	}

	@Override
	public double factorConversion() {

		return 0.0009433;
	}

}
