package ar.edu.ort.tp1.final2.clases;

public class Buceo {

	private int id;
	private String nombrePuntoBuceo;
	private int profunidad;

	public Buceo(int id, String nombrePuntoBuceo, int profunidad) {
		this.id = id;
		this.nombrePuntoBuceo = nombrePuntoBuceo;
		this.profunidad = profunidad;
	}

	@Override
	public String toString() {
		return "Buceo [id=" + id + ", nombrePuntoBuceo=" + nombrePuntoBuceo + ", profunidad=" + profunidad + "]";
	}
	
	public int getId() {
		return id;
	}

	public boolean nombreBuceo(String nombreBuceo) {
		return this.nombrePuntoBuceo.equals(nombreBuceo);
	}

	public int getProfundidad() {
		return this.profunidad;
	}
}
