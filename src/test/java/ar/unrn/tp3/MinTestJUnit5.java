package ar.unrn.tp3;

//Importaciones eliminadas de JUnit 4
//import static org.junit.Assert.*;
//import org.junit.*;

//Importaciones añadidas para JUnit 5
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.*;

public class MinTestJUnit5 {
	private List<String> lista; // Fixture de prueba

// @BeforeEach reemplaza a @Before
	@BeforeEach // Preparación - Se llama antes de cada método de prueba.
	public void preparar() {
		lista = new ArrayList<String>();
	}

// @AfterEach reemplaza a @After
	@AfterEach // Limpieza - Se llama después de cada método de prueba.
	public void limpiar() {
		lista = null; // redundante en este ejemplo!
	}

	@Test
	public void pruebaListaNula() {
		lista = null;
		try {
			Min.min(lista);
		} catch (NullPointerException e) {
			return;
		}
		fail("Se esperaba NullPointerException");

	}

// assertThrows es ahora el mecanismo preferido para probar excepciones
// nota la expresión lambda en la aserción
	@Test
	public void pruebaElementoNulo() {
		lista.add(null);
		lista.add("gato");
		assertThrows(NullPointerException.class, () -> Min.min(lista));
	}

	@Test
	public void pruebaSoloElementoNulo() {
		lista.add(null);
		assertThrows(NullPointerException.class, () -> Min.min(lista));
	}

	@Test
	@SuppressWarnings("unchecked")
	public void pruebaMutuamenteIncomparable() {
		List lista = new ArrayList();
		lista.add("gato");
		lista.add("perro");
		lista.add(1);
		assertThrows(ClassCastException.class, () -> Min.min(lista));
	}

	@Test
	public void pruebaListaVacia() {
		assertThrows(IllegalArgumentException.class, () -> Min.min(lista));
	}

	@Test
	public void pruebaUnicoElemento() {
		lista.add("gato");
		Object obj = Min.min(lista);
		assertTrue(obj.equals("gato"), "Lista de un solo elemento");
	}

	@Test
	public void pruebaDosElementos() {
		lista.add("perro");
		lista.add("gato");
		Object obj = Min.min(lista);
		assertTrue(obj.equals("gato"), "Lista de dos elementos");
	}
}
