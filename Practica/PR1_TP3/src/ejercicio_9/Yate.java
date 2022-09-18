package ejercicio_9;

public class Yate extends Barco {
	
	private int cantCamarote;
	

	public Yate(String matricula, int eslora, int anioFabricacion, String nombreDuenio, int cantCamarote) {
		super(matricula, eslora, anioFabricacion, nombreDuenio);
		this.cantCamarote = cantCamarote;
	}

	@Override
	public int valorAdicional() {
		return this.cantCamarote;
	}

	@Override
	public String toString() {
		return "Yate [cantCamarote=" + cantCamarote + "]" + super.toString();
	}
	
	
	
}
