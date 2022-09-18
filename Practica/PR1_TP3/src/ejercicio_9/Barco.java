package ejercicio_9;

public abstract class Barco {
	
	private String matricula;
	private int eslora;
	private int anioFabricacion;
	private String nombreDuenio;
	
	public Barco(String matricula, int eslora, int anioFabricacion, String nombreDuenio){
		this.matricula = matricula;
		this.eslora = eslora;
		this.anioFabricacion = anioFabricacion;
		this.nombreDuenio = nombreDuenio;
	}
	
	public abstract int valorAdicional();
	
	public int getEslora() {
		return this.eslora;
	}

	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", eslora=" + eslora + "]";
	}
	
}
