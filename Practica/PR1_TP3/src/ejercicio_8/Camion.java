package ejercicio_8;

public class Camion extends Vehiculo {
	
	private final double TARIFABASE = 200;
	
	public Camion(String patente) {
		super(patente);
	}
	
	public double getTarifaBase() {
		return TARIFABASE;
	}
}
