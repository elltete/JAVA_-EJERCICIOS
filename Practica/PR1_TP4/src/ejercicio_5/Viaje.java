package ejercicio_5;

public class Viaje {
	
	private int idCamion;
	private String idChofer;
	private double kmsViaje;
	
	public Viaje(int idCamion, String idChofer, double kmsViaje) {
		this.idCamion = idCamion;
		this.idChofer = idChofer;
		this.kmsViaje = kmsViaje;
	}

	public int getIdCamion() {
		return idCamion;
	}

	public String getIdChofer() {
		return idChofer;
	}

	public double getKmsViaje() {
		return kmsViaje;
	}

}
