package ejercicio_8;

public class Moto extends Vehiculo {
	
	private final double TARIFABASE = 80;
	
	public Moto(String patente) {
		super(patente);
	}
	
	public double getTarifaBase() {
		return TARIFABASE;
	}

}
