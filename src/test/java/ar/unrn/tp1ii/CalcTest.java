package ar.unrn.tp1ii;

public class CalcTest {
	public String testAdd(int a, int b) {
		String correct = "Calc sum incorrect";
		int result = Calc.add(a, b);
		if (5 == result)
			correct = "Calc sum correct";
		return correct + " " + result + " = " + a + " + " + b;
	}
}