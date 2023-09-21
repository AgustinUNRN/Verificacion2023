package ar.unrn.tp1ii;

public class CalcTest {

	public String testAdd(int a, int b) {
		System.out.println("Test de suma: " + a + " + " + b);
		try {
			return "TEST ARPOBADO\n" + Calc.add(a, b) + " = " + a + " + " + b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		return "ERROR TEST DESAPROBADO";
	}

	public String testSub(int a, int b) {
		System.out.println("Test de resta: " + a + " - " + b);
		try {
			return "TEST ARPOBADO\n" + Calc.sub(a, b) + " = " + a + " - " + b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		return "ERROR TEST DESAPROBADO";
	}

	public String testDiv(int a, int b) {
		System.out.println("Test de división: " + a + " / " + b);
		try {
			return "TEST ARPOBADO\n" + Calc.div(a, b) + " = " + a + " / " + b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		return "ERROR TEST DESAPROBADO";
	}

	public String testMul(int a, int b) {
		System.out.println("Test de multiplicación: " + a + " * " + b);
		try {
			return "TEST ARPOBADO\n" + Calc.mul(a, b) + " = " + a + " * " + b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		return "ERROR TEST DESAPROBADO";
	}

}