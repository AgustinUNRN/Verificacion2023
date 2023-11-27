package ar.unrn.tp1ii;

public class Ejercicio4 {
	private String nombre;
	private int horasTrabajadas;
	private double salarioPorHora;

	public Ejercicio4(String nombre, int horasTrabajadas, double salarioPorHora) {
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.salarioPorHora = salarioPorHora;
	}

	public String getNombre() {
		return nombre;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public double calcularSalario() {
		// Este es el error, no contempla horas extras
		return horasTrabajadas * salarioPorHora;
	}
}
