package ar.unrn.tp1ii;

import java.io.IOException;

public class Ejercicio3Test {

	public int testEje3(String nombreArchivo) throws IOException {
		Ejercicio3 eje3 = new Ejercicio3(nombreArchivo);
		return eje3.contarPalabras();
	}

	public int testEje3Refac(String nombreArchivo) throws IOException {
		Ejercicio3Refactor eje3 = new Ejercicio3Refactor(nombreArchivo);
		return eje3.getCantidadPalabras();
	}
}
