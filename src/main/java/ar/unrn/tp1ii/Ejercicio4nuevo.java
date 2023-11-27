package ar.unrn.tp1ii;

public class Ejercicio4nuevo {
	private String nombre;
	private int horasTrabajadas;
	private int cantHorasContratado;
	private double salarioPorHora;

	public Ejercicio4nuevo(String nombre, int horasTrabajadas, int cantHorasContratado, double salarioPorHora) {
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.salarioPorHora = salarioPorHora;
		this.cantHorasContratado = cantHorasContratado;
	}

	public double calcularSalario() {
		if (horasTrabajadas <= cantHorasContratado) {
			return horasTrabajadas * salarioPorHora;
		} else {
			double horasExtras = horasTrabajadas - cantHorasContratado;
			return (cantHorasContratado * salarioPorHora) + (horasExtras * salarioPorHora * 1.5);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public int getCantHorasContratado() {
		return cantHorasContratado;
	}

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

}
