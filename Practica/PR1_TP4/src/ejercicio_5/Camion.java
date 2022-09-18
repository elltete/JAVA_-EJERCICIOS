package ejercicio_5;

public class Camion {
	
	private int idCamion;
	private double costoPorKmRecorrido;
	
	public Camion(int idCamion, double costoPorKmRecorrido) {
		this.idCamion = idCamion;
		this.costoPorKmRecorrido = costoPorKmRecorrido;
	}

	public int getIdCamion() {
		return idCamion;
	}

	public double getCostoPorKmRecorrido() {
		return costoPorKmRecorrido;
	}

}
