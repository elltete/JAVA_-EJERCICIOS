package ejercicio_5;

public class Chofer {
	
	private String idChofer;
	private String nombre;
	private double pagoPorViaje;
	
	public Chofer(String idChofer, String nombre, double pagoPorViaje) {
		this.idChofer = idChofer;
		this.nombre = nombre;
		this.pagoPorViaje = pagoPorViaje;
	}

	public String getIdChofer() {
		return idChofer;
	}

	public double getPagoPorViaje() {
		return pagoPorViaje;
	}

}
