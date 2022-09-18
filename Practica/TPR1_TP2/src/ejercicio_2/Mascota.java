package ejercicio_2;

public class Mascota {
	
	private String nombre;
	private String tipoAnimal;
	
	public Mascota(String nombre, String tipoAnimal) {
		this.nombre = nombre;
		this.tipoAnimal = tipoAnimal;
	}

	public String getValor() {
		return this.tipoAnimal + ", " + this.nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

}
