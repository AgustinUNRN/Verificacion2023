package ar.unrn.tp1i;

public class Main {

	public static void main(String[] args) {
		int[] arreglo = null;
		int buscar = 3;
		System.out.println(findLast(arreglo, buscar));
	}

	public static int findLast(int[] x, int y) {
		if (x != null) {
			for (int i = x.length - 1; i >= 0; i--) {
// la condición de corte no contempla la posición 0 del arrelgo,
// por lo tanto se modifica a i>=0
				if (x[i] == y) {
					return i;
				}
			}
		}
		return -1;
	}

	public static int lastZero(int[] x) {
		for (int i = x.length - 1; i >= 0; i--) {
			// el error estaba en ir buscando desde la
			// posición 0 hasta el final del arreglo,
			// se modifica invirtiendo la busqueda,
			// es decir, desde el final del arreglo
			// hasta la posición 0
			if (x[i] == 0) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Counts positive elements in array
	 *
	 * @param x array to search
	 * @return number of positive elements in x
	 * @throws NullPointerException if x is null
	 */
	public static int countPositive(int[] x) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > 0) {
				// El error esta en considerar al cero como positivo
				// (if (x[i] >= 0)), lo solucionamos sacando el
				// comparador = dentro del if
				count++;
			}
		}
		return count;
	}
	// test: x=[-4, 2, 0, 2]
	// Expected = 2

	/**
	 * Count odd or positive elements in an array
	 *
	 * @param x array to search
	 * @return count of odd or positive elements in x
	 * @throws NullPointerException if x is null
	 */
	public static int oddOrPos(int[] x) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (Math.abs(x[i]) % 2 == 1 || x[i] > 0) {
				// El error está en que el módulo 2 de un número
				// negativo es -1, aplicando el valor absoluto al
				// número negativo solucionamos el problema
				count++;
			}
		}
		return count;
	}
	// test: x=[-3, -2, 0, 1, 4]
	// Expected = 3

	// -------------------------------------------------------------------------------------------------------------
	// los de abajo tienen errores pero estan adrede

	public static int oddOrPosE(int[] x) { // Effects: if x is null throw NullPointerException
											// else return the number of elements in x that
											// are either odd or positive (or both)
		int count = 0;

		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 1 || x[i] > 0) {
				count++;
			}
		}
		return count;
	}

	public static int countPositiveE(int[] x) {
		int count = 0;

		for (int i = 0; i < x.length; i++) {
			if (x[i] >= 0) {
				count++;
			}
		}
		return count;
	}

	public static int lastZeroE(int[] x) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 0) {
				return i;
			}
		}
		return -1;
	}

	public static int findLastE(int[] x, int y) {
		// As the example in the book points out, this loop should end at 0.
		for (int i = x.length - 1; i > 0; i--) {
			if (x[i] == y) {
				return i;
			}
		}
		return -1;
	}

}
