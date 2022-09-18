package Ejercicio_08;

public class Fecha { 
	
	public static Fecha fechaHoy = new Fecha(2,6,2021);
	
	private int dia;
	private int mes; 
	private int anio;
	
	public Fecha (int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	private int convertirEnDias() {
		return this.anio * 365 + this.mes * 30 + this.dia;
	}
	
	public boolean estaVencido() {
		return this.convertirEnDias() < fechaHoy.convertirEnDias();
	}
	
	
	@Override
	public String toString() {
		return this.getDia() + "-" + this.getMes() + "-" + this.getAnio();
	}

	private int getDia() {
		return dia;
	}

	private void setDia(int dia) {
		this.dia = dia;
	}

	private int getMes() {
		return mes;
	}

	private void setMes(int mes) {
		this.mes = mes;
	}

	private int getAnio() {
		return anio;
	}

	private void setAnio(int anio) {
		this.anio = anio;
	}
	
	
}
