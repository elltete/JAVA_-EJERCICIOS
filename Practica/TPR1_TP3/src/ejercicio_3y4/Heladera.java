package ejercicio_3y4;

public class Heladera extends Producto {
	
	private int capacidadLitros;
	private boolean frost; //EsNoFrost(true) o Standard(false)
	
	public Heladera() {
		super();
		this.capacidadLitros = 0;
		this.frost = false;
	}
	
	public Heladera(String marca, String modelo, String numeroSerie, int voltaje, double precio, int capacidadLitros, boolean frost) {
		super(marca, modelo, numeroSerie, voltaje, precio);
		this.capacidadLitros = capacidadLitros;
		this.frost = frost;
	}

	@Override
	public String listadoMenu() {
		return "Heladera" + " " + super.getMarca() + " " + super.getModelo();
	}
	
	private String esfrost() {
		String salida = "";
		if(frost) {
			salida = "es no Frost";
		} else {
			salida = "es standard";
		}
		return salida;
	}
	
	public String listadoProdElegidos() {
		return "Heladera" + " " + super.getMarca() + ", modelo " + getModelo() + ", capacidad " + this.capacidadLitros + "lt , " + esfrost() + ": $" + super.getPrecio();  
	}

	@Override
	public void imprimir() {
		System.out.println(listadoProdElegidos());
	}
}
