package parcial_LicenciasConducir;

public class Moto extends Vehiculo {
	
	private boolean tieneEspejos;

	public Moto(String patente, String marca, int cilindrada, boolean tieneEspejos) {
		super(patente, marca, cilindrada);
		this.tieneEspejos = tieneEspejos;
	}

}
