package ejercicio_8;

public class Auto extends Vehiculo {
	
	private final double TARIFABASE = 100;
	
	public Auto(String patente) {
		super(patente);
	}

	public double getTarifaBase() {
		return TARIFABASE;
	}

}
