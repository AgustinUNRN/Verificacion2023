package ar.unrn.tp1ii;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3Refactor { // lector de archivos
	private String nombreArchivo;

	public Ejercicio3Refactor(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

public int getCantidadPalabras() throws IOException {
	int contador = 0;
	try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
		String linea;
		while ((linea = lector.readLine()) != null) {
			// Filtrar líneas que contienen solo espacios en blanco
			if (!linea.trim().isEmpty()) {
				String[] palabras = linea.split(" ");
				for (String palabra : palabras) {
					// Filtrar palabras que consisten en solo espacios en blanco
					if (!palabra.trim().isEmpty()) {
						contador++;
					}
				}
			}
		}
		lector.close();
	} catch (IOException e) {
		System.err.println("Error al leer el archivo: " + e.getMessage());
	}
	return contador;
}
}