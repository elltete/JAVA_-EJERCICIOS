package ejercicio_12;

public abstract class Fuente implements Calificable {

	private String nombre;
	private String ubicacion;
	
	public Fuente(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public abstract double indiceCalidad();
	
}
