package ejercicio_3y4;

public abstract class Producto implements Imprimible{
	
	private String marca;
	private String modelo;
	private String numeroSerie;
	private int voltaje;
	private boolean estado; //Prendido(true) o Apagado(false)
	private double precio;
	
	public Producto() {
		this.marca = "";
		this.modelo = "";
		this.numeroSerie = "";
		this.voltaje = 0;
		this.estado = false;
		this.precio = 0;
	}	
	
	public Producto(String marca, String modelo, String numeroSerie, int voltaje, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.voltaje = voltaje;
		this.estado = false;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	public double getPrecio() {
		return precio;
	}

	public abstract String listadoMenu();
	
	public abstract String listadoProdElegidos();
	
}
