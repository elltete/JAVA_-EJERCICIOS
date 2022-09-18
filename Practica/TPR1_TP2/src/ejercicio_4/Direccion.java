package ejercicio_4;

public class Direccion {
	
	private String calle;
	private int altura;
	private int piso;
	private char departamento;
	
	public Direccion(String calle, int altura, int piso, char departamento) {
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
	}
	
	public String getValor() {
		return "Direccion: " + this.calle + " " + this.altura + " " + this.piso + "º '" + this.departamento + "'"; 
	}

	public int getPiso() {
		return piso;
	}

	public char getDepartamento() {
		return departamento;
	}
	
}
