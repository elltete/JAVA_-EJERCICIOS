package ejercicio_8;

public abstract class MedioDePago {
	
	public String descripcion;

	public abstract double descuentoAAplicar();
	
	public abstract int getCantDiasDemoraCobro();
	
	public MedioDePago(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
