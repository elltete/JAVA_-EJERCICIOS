package ejercicio_10;

public abstract class Servicio implements Facturable{
	
	private int cantidadHoras;
	
	public Servicio(int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}
	
	public int getCantidadHoras() {
		return this.cantidadHoras;
	}
	
	public abstract double calcularPrecio();
	
	public double montoFacturado() {
		return calcularPrecio() * (1+IVA/2);
		
	}

}
