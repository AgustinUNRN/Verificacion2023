package ar.unrn.tp3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinTest<T extends Comparable<T>> {

	private List<T> listaEntrada;
	private T resultadoEsperado;

	public MinTest(List<T> listaEntrada, T resultadoEsperado) {
		this.listaEntrada = listaEntrada;
		this.resultadoEsperado = resultadoEsperado;
	}

	@ParameterizedTest
	@MethodSource("datosPrueba")
	public void pruebaMin(List<T> listaEntrada, T resultadoEsperado) {
		T resultado = Min.<T>min(listaEntrada);
		assertEquals(resultadoEsperado, resultado);
	}

	static Stream<Arguments> datosPrueba() {
		return Stream.of(arguments(Arrays.asList(1, 2, 3, 4, 5), 1), arguments(Arrays.asList(5, 4, 3, 2, 1), 1),
				arguments(Arrays.asList(2.5, 1.2, 3.7, 0.8), 0.8),
				arguments(Arrays.asList("manzana", "banana", "cereza"), "manzana"),
				arguments(Arrays.asList("tigre", "león", "elefante"), "elefante"));
	}
}
