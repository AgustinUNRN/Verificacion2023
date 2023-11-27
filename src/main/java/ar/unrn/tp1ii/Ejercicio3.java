package ar.unrn.tp1ii;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 { // lector de archivos
	private String nombreArchivo;

	public Ejercicio3(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public int contarPalabras() throws IOException {
		FileReader archivo = new FileReader(nombreArchivo);
		BufferedReader lector = new BufferedReader(archivo);
		String linea;
		int contador = 0;

		while ((linea = lector.readLine()) != null) {
			String[] palabras = linea.split(" ");
			contador += palabras.length;

		}

		lector.close();
		return contador;
	}
}
