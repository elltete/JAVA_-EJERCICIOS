package parcial_LicenciasConducir;

public class Auto extends Vehiculo {
	
	private int cantPuertas;

	public Auto(String patente, String marca, int cilindrada, int cantPuertas) {
		super(patente, marca, cilindrada);
		this.cantPuertas = cantPuertas;
	}

}
