package ar.unrn.tp1ii;

public class Calc {
	static public int add(int a, int b) throws ArithmeticException {
		if (a > 0 && b > 0) { // los dos son numeros positivos
			int valorMaximo = 2147483647; // máximo valor permitio por java
			if (valorMaximo - a < b)
				throw new ArithmeticException(
						"la suma supera el máximo " + "valor numerico permitido por el lenguaje.");
		}
		if (a < 0 && b < 0) { // los dos son numeros negrativos
			int valorMinimo = -2147483648; // mínimo valor permitido por java
			if (valorMinimo - a > b)
				throw new ArithmeticException(
						"la suma supera el mínimo " + "valor numerico permitido por el lenguaje.");
		}
		return a + b;
	}

	static public int sub(int a, int b) {
		return a - b;
	}

	static public int mul(int a, int b) {
		if ((a < 0 && b < 0) || (a > 0 && b > 0)) { // Si ambos son negativos o positivos hay overflow positivo
			int valorMaximo = 2147483647;
			if (valorMaximo / Math.abs(a) < Math.abs(b))
				throw new ArithmeticException(
						"la multiplicación supera el máximo valor numerico permitido por el lenguaje.");
		}
		if (a < 0 || b < 0) {// si solo uno de los numeros es negativo hay posible overflow negativo
			int valorMinimo = -2147483648;
			if (Math.abs(valorMinimo / a) < Math.abs(b))
				throw new ArithmeticException(
						"la multiplicación supera el mínimo valor numerico permitido por el lenguaje.");
		}
		return a * b;

	}

	static public int div(int a, int b) throws ArithmeticException {
		if (b == 0) // si el divisor es 0
			throw new ArithmeticException("No se puede dividir por 0 (cero).");
		return a / b;
	}
}