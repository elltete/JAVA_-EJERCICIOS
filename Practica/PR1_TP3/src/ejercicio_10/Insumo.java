package ejercicio_10;

public class Insumo implements Facturable {

	private String nombre;
	private TipoInsumo tipo;
	private double porcentajeGanancia;
	private double precioLista;
	
	public Insumo(String nombre, TipoInsumo tipo, double porcentajeGanancia, double precioLista) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.porcentajeGanancia = porcentajeGanancia;
		this.precioLista = precioLista;
	}

	@Override
	public double montoFacturado() {
		return this.precioLista * (1+this.porcentajeGanancia) * (1+IVA);
	}
	
}
