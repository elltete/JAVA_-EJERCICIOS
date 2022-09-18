package ejercicio_8;

public abstract class Vehiculo {
	
	public String patente;
	
	public Vehiculo(String patente) {
		this.patente = patente;
	}
	
	public abstract double getTarifaBase();

}
