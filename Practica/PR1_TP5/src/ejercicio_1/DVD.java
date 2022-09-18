package ejercicio_1;

public class DVD {

	private String marca;
	private boolean estaRayado;
	
	public DVD(String marca, boolean estaRayado) {
		this.marca = marca;
		this.estaRayado = estaRayado;
	}

	public String getMarca() {
		return marca;
	}

	public boolean isEstaRayado() {
		return estaRayado;
	}

	@Override
	public String toString() {
		return "DVD [marca=" + marca + ", estaRayado=" + estaRayado + "]";
	}
	
	
	
}
