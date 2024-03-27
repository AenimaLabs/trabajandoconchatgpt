

package main;

import clases.ConvertidorMoneda;
import clases.Dolar;
import clases.Euro;
import clases.GestorEntradaSalida;
import interfaces.Moneda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestorEntradaSalida gestorES = new GestorEntradaSalida();
        ConvertidorMoneda convertidor = new ConvertidorMoneda(gestorES);

        double cantidad = gestorES.obtenerCantidad();
        int opcion = gestorES.obtenerOpcion();

        Moneda moneda;
        if (opcion == 1) {
            moneda = new Euro();
        } else if (opcion == 2) {
            moneda = new Dolar();
        } else {
            System.out.println("Opción no válida.");
            gestorES.cerrarScanner();
            return;
        }

        convertidor.convertir(moneda, cantidad);

        gestorES.cerrarScanner();
	}
}


