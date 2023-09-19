package ar.unrn.tp1ii;

public class Main {

	public static void main(String[] args) throws Exception {
		// -------------------------------------------------------------------------------------------

		// double num1 = 2.2;
		// double num2 = 0;
		// System.out.println(num1 + " + " + num2 + " = " + Calc.add(num1, num2));
		// *Prueba 1, ingreso un numero con coma flotante en la entrada

		// *Salida:
		// Exception in thread "main" java.lang.Error: Unresolved compilation
		// problem: The method add(int, int) in the type Calc is not applicable
		// for the arguments (double, double) at pruebas/pruebas.Main.main(Main.java:11)
		// -------------------------------------------------------------------------------------------

		// String num1 = new String("sda");
		// int num2 = 0;
		// System.out.println(num1 + " + " + num2 + " = " + Calc.add(num1, num2));
		// *Prueba 2, ingreso un String en los argumentos
		// Salida:
		// Exception in thread "main" java.lang.Error: Unresolved compilation
		// problem: The method add(int, int) in the type Calc is not applicable
		// for the arguments (String, int) at pruebas/pruebas.Main.main(Main.java:21)

		// -------------------------------------------------------------------------------------------

		// int num1 = 2;
		// int num2 = 2147483647;
		// System.out.println(num1 + " + " + num2 + " = " + Calc.add(num1, num2));
		// *Prueba 3, ingreso una suma cuyo valor supera al máximo permitido por java
		// Salida: 2 + 2147483647 = -2147483647

		// -------------------------------------------------------------------------------------------
		// int num1 = -2;
		// int num2 = -2147483648;
		// System.out.println(num1 + " + " + num2 + " = " + Calc.add(num1, num2));
		// *Prueba 4, ingreso 2 numeros negativos cuya suma superan el mínimo permitido
		// por java
		// -2 + -2147483648 = 2147483646

		// se agregaron controles para los casos de prueba 3 y 4
		// if (a > 0 && b > 0) {
		// int valorMaximo = 2147483647;
		// if (valorMaximo - a < b)
		// throw new ArithmeticException("la suma supera el máximo valor numerico
		// permitido por el lenguaje.");
		// }
		// if (a < 0 && b < 0) {
		// int valorMinimo = -2147483648;
		// if (valorMinimo - a > b)
		// throw new ArithmeticException("la suma supera el mínimo valor numerico
		// permitido por el lenguaje.");
		// }

		// -------------------------------------------------------------------------------------------

		// int num1 = -2147483647;
		// int num2 = 2147483647;
		// System.out.println(num1 + " - " + num2 + " = " + Calc.sub(num2, num1));
		// *prueba 5, en la operación de resta no hay problemas de overflow,
		// ya que se agregaron las mejoras implementadas en el método de suma
		// Salida: la suma supera el máximo valor numerico permitido por el lenguaje.

		// -------------------------------------------------------------------------------------------

		int num1 = 2;
		int num2 = 0;
		System.out.println(num1 + " + " + num2 + " = " + Calc.div(num1, num2));
		// *Prueba 6, divido por 0
		// salida:Exception in thread "main" java.lang.ArithmeticException:
		/// by zero
		// at pruebas/pruebas.Calc.div(Calc.java:16)
		// at pruebas/pruebas.Main.main(Main.java:36)

		// se agrega un control para evitar la división por cero
		// if (b == 0)
		// throw new ArithmeticException("No se puede dividir por 0 (cero).");

		// -------------------------------------------------------------------------------------------

		// int num1=0;
		// int num2=2;
		//
		// System.out.println(num1+" / "+num2 +" = "+Calc.div(num1, num2));
		//
		// Prueba exitosa

		// -------------------------------------------------------------------------------------------

		// int num1 = 2;
		// int num2 = 0;

		// System.out.println(num1 + " / " + num2 + " = " + Calc.div(num1, num2));
		// //
		// Prueba 5, se intenta dividr por cero en el segundo argumento
		// Salida: Mensaje de error "No se puede dividir por 0 (cero)."

		// -------------------------------------------------------------------------------------------

		// int num1 = -2147483647;
		// int num2 = 2;

		// System.out.println(num1 + " * " + num2 + " = " + Calc.mul(num1, num2));

		// prueba 6 intento superar el mínimo permitido por el lenguaje (-2147483648)
		// Salida: -2147483647 * -2 = -2

		// Solució: se agrega contro de overflow tanto para el mínimo o máximo permitido
		// por el lenguje (-2147483648 y 2147483647 respectivamente)
		// if ((a < 0 && b < 0) || (a > 0 && b > 0)) { // Si ambos son negativos o
		// positivos hay overflow positivo
		// int valorMaximo = 2147483647;
		// if (valorMaximo / Math.abs(a) < Math.abs(b))
		// throw new ArithmeticException(
		// "la multiplicación supera el máximo valor numerico permitido por el
		// lenguaje.");
		// }
		// if (a < 0 || b < 0) {
		// int valorMinimo = -2147483648;
		// if (Math.abs(valorMinimo / a) < Math.abs(b))
		// throw new ArithmeticException(
		// "la multiplicación supera el mínimo valor numerico permitido por el
		// lenguaje.");
		// }

		// -------------------------------------------------------------------------------------------

		// prueba 7, intento superar el máximo permitido por el lenguaje (2147483647)

		// int num1 = 2147483647;
		// int num2 = 2;

		// System.out.println(num1 + " * " + num2 + " = " + Calc.mul(num1, num2));

		// salida: Exception in thread "main" java.lang.ArithmeticException: la
		// multiplicación supera el máximo valor numerico permitido por el lenguaje.

		CalcTest test = new CalcTest();
		System.out.println(test.testAdd(2, 2147483647));
	}

}
