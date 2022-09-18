package practica3_otraSolucion;

public class Atleta {
	
	private String nombre;
	private double segundos;
	
	public Atleta(String nombre, double segundos) {
		this.nombre = nombre;
		this.segundos = segundos;
	}

	public double getSegundos() {
		return segundos;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
