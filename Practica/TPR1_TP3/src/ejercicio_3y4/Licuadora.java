package ejercicio_3y4;

public class Licuadora extends Producto {
	
	private int potencia;
	private int velocidad;
	
	public Licuadora() {
		super();
		this.potencia = 0;
		this.velocidad = 0;
	}
	
	public Licuadora(String marca, String modelo, String numeroSerie, int voltaje, double precio, int potencia, int velocidad) {
		super(marca, modelo, numeroSerie, voltaje, precio);
		this.potencia = potencia;
		this.velocidad = velocidad;
	}
	
	@Override
	public String listadoMenu() {
		return "Licuadora" + " " + super.getMarca() + " " + super.getModelo();
	}
	
	public String listadoProdElegidos() {
		return "Licuadora" + " " + super.getMarca() + ", modelo " + getModelo() + ", potencia " + this.potencia + "watts: $" + super.getPrecio();  
	}

	@Override
	public void imprimir() {
		System.out.println(listadoProdElegidos());
	}
}
