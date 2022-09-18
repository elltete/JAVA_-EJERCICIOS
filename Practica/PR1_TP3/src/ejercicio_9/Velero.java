package ejercicio_9;

public class Velero extends Barco {
	
	private int cantidadMastil;

	public Velero(String matricula, int eslora, int anioFabricacion, String nombreDuenio, int cantidadMastil) {
		super(matricula, eslora, anioFabricacion, nombreDuenio);
		this.cantidadMastil = cantidadMastil;
	}

	@Override
	public int valorAdicional() {
		return this.cantidadMastil;
	}

	@Override
	public String toString() {
		return "Velero [cantidadMastil=" + cantidadMastil + "]" + super.toString();
	}

	
	
}
