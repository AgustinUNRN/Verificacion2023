package ar.unrn.tp3;

public class BoundedQueue {
	// Resumen: Un BoundedQueue es una estructura de datos mutable y acotada de tipo
	// FIFO
	// de tamaño fijo, con el tamaño establecido en el constructor.
	// Una cola típica es [], [o1], o [o1, o2], donde ni o1 ni o2
	// nunca son nulos. Los elementos más antiguos se enumeran antes que los más
	// nuevos.

	private final Object[] elementos;
	private int tamaño, frente, trasera;
	private final int capacidad;

	public BoundedQueue(int capacidad) {
		if (capacidad < 0)
			throw new IllegalArgumentException("BoundedQueue.constructor");
		this.capacidad = capacidad;
		elementos = new Object[capacidad];
		tamaño = 0;
		frente = 0;
		trasera = 0;
	}

	public void encolar(Object o) throws NullPointerException, IllegalStateException { // Modifica: this
																						// Efectos: Si el argumento es
																						// nulo, lanza
																						// NullPointerException,
																						// de lo contrario, si esto está
																						// lleno, lanza
																						// IllegalStateException,
																						// de lo contrario, hace que o
																						// sea el elemento más nuevo de
																						// esto
		if (o == null)
			throw new NullPointerException("BoundedQueue.encolar");
		else if (tamaño == capacidad)
			throw new IllegalStateException("BoundedQueue.encolar");
		else {
			tamaño++;
			elementos[trasera] = o;
			trasera = (trasera + 1) % capacidad;
		}
	}

	public Object desencolar() throws IllegalStateException { // Modifica: this
																// Efectos: Si la cola está vacía, lanza
																// IllegalStateException,
																// de lo contrario, elimina y devuelve el elemento más
																// antiguo de esto

		if (tamaño == 0)
			throw new IllegalStateException("BoundedQueue.desencolar");
		else {
			tamaño--;
			Object o = elementos[(frente % capacidad)];
			elementos[frente] = null;
			frente = (frente + 1) % capacidad;
			return o;
		}
	}

	public boolean isEmpty() {
		return (tamaño == 0);
	}

	public boolean isFull() {
		return (tamaño == capacidad);
	}

	public int tamaño() {
		return tamaño;
	}

	public String toString() {
		String resultado = "[";
		for (int i = 0; i < tamaño; i++) {
			resultado += elementos[(frente + i) % capacidad].toString();
			if (i < tamaño - 1) {
				resultado += ", ";
			}
		}
		resultado += "]";
		return resultado;
	}

}
