package ar.unrn.tp3;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BoundedQueueTest {
	private BoundedQueue cola;

	@Before
	public void configurarCola() {
		// Inicializa la cola con una capacidad de tamaño 3
		cola = new BoundedQueue(3);
	}

	@Test
	public void testColaVaciaInicialmente() {
		assertTrue(cola.isEmpty());
	}

	@Test
	public void testEncolarYDesencolar() {
		cola.encolar(1);
		assertFalse(cola.isEmpty());
		assertEquals(1, (int) cola.desencolar());
		assertTrue(cola.isEmpty());
	}

	@Test
	public void testEncolarEnColaLlena() {
		cola.encolar(1);
		cola.encolar(2);
		cola.encolar(3);
		// La cola está llena, intentar agregar otro elemento debería lanzar una
		// excepción
		try {
			cola.encolar(4);
			fail("Se esperaba una excepción");
		} catch (IllegalStateException e) {
			// Se espera una excepción, por lo que no se hace nada aquí
		}
	}

	@Test
	public void testDesencolarDesdeColaVacia() {
		// Intentar desencolar elementos de una cola vacía debe lanzar una excepción
		try {
			cola.desencolar();
			fail("Se esperaba una excepción");
		} catch (IllegalStateException e) {
			// Se espera una excepción, por lo que no se hace nada aquí
		}
	}

	@Test
	public void testTamaño() {
		assertEquals(0, cola.tamaño());
		cola.encolar(1);
		assertEquals(1, cola.tamaño());
		cola.encolar(2);
		assertEquals(2, cola.tamaño());
		cola.desencolar();
		assertEquals(1, cola.tamaño());
	}
}
