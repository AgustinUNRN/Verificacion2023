package ar.unrn.tp1ii;

public class Ejercicio4Test {
	public String testCalcularSalario(int horas, double salario) {
		Ejercicio4 empleado = new Ejercicio4("Juan", horas, salario);
		double salarioCalculado = empleado.calcularSalario();
		return "El empleado " + empleado.getNombre() + " tiene un salario de " + salarioCalculado + "\n" + "Trabajó: "
				+ empleado.getHorasTrabajadas() + " horas" + "\n";
	}

	public String testCalcularSalarioNuevo(int horas, double salario) {
		Ejercicio4nuevo empleado = new Ejercicio4nuevo("Juan", horas, 50, salario);
		double salarioCalculado = empleado.calcularSalario();
		return "El empleado " + empleado.getNombre() + " tiene un salario de " + salarioCalculado + "\n" + "Trabajó: "
				+ empleado.getHorasTrabajadas() + " horas" + "\n" + "Horas contratadas: "
				+ empleado.getCantHorasContratado() + " horas";
	}
}
