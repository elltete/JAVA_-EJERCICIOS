package ejercicio_3y4;

public class Televisor extends Producto {
	
	private int dimension;
	private boolean smart; //TVsmart(true) o NOsmart(false)
	
	public Televisor() {
		super();
		this.dimension = 0;
		this.smart = false;
	}
	
	public Televisor(String marca, String modelo, String numeroSerie, int voltaje, double precio, int dimension, boolean smart) {
		super(marca, modelo, numeroSerie, voltaje, precio);
		this.dimension = dimension;
		this.smart = smart;
	}
	
	@Override
	public String listadoMenu() {
		return "Televisor" + " " + super.getMarca() + " " + super.getModelo();
	}
	
	private String esSmart() {
		String salida = "";
		if(smart) {
			salida = "es Smart";
		} else {
			salida = "mo es Smart";
		}
		return salida;
	}
	
	public String listadoProdElegidos() {
		return "Televisor" + " " + super.getMarca() + ", modelo " + getModelo() + ", pulgadas " + this.dimension + ", " + esSmart() + ": $" + super.getPrecio();  
	}

	@Override
	public void imprimir() {
		System.out.println(listadoProdElegidos());
	}

}
