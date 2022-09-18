package Ejercicio_14;

public class Hoyo {
	private int numero;
	private int golpes;
	
	public Hoyo(int numero, int golpes) {
		this.numero = numero;
		this.golpes = golpes;
	}

	public int getNumero() {
		return numero;
	}

	
	public int getGolpes() {
		return golpes;
	}

	@Override
	public String toString() {
		return "Hoyo [numero=" + numero + ", golpes=" + golpes + "]";
	}
	
	
}
