package ar.edu.ort.tp1.pacial2.clases;

public abstract class Pizza implements Mostrable{

	private static final String ERROR = "Error fabricando una Pizza: ";	
	private static final String MSG_GANANCIA_INVALIDA = "Ganancia invalida";
	private static final String MSG_COSTO_INVALIDO = "Costo invalido";
	private static final String MSG_NOMBRE_INVALIDO = "Nombre invalido";
	private static final float PRECIO_FAINA = 70;
	private static final float PRECIO_PORCION = 45;
	private String nombre; 
	private float costoDeProduccion; 
	private float porcentajeGanancia;

	public Pizza(String nombre, float costoDeProduccion, float porcentajeGanancia) {
		setNombre(nombre);
		setCostoDeProduccion(costoDeProduccion);
		setPorcentajeGanancia(porcentajeGanancia);
	}
	
	public void setNombre(String nombre) {
		if (nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException(ERROR + MSG_NOMBRE_INVALIDO);
		}
		this.nombre = nombre;
	}
	
	public void setCostoDeProduccion(float costoDeProduccion) {
		if (costoDeProduccion < 1) {
			throw new IllegalArgumentException(ERROR + MSG_COSTO_INVALIDO);
		}
		this.costoDeProduccion = costoDeProduccion;
	}
	
	public void setPorcentajeGanancia(float porcentajeGanancia) {
		if (porcentajeGanancia < 0) {
			throw new IllegalArgumentException(ERROR + MSG_GANANCIA_INVALIDA);
		}
		this.porcentajeGanancia = porcentajeGanancia;
	}
	
	public abstract float getPrecioDeCosto();
	
	public abstract float getPrecioDeVenta();

	public String getNombre() {
		return nombre;
	}

	public float getCostoDeProduccion() {
		return costoDeProduccion;
	}

	public float getPorcentajeGanancia() {
		return porcentajeGanancia;
	}

	public float getPrecioFaina() {
		return PRECIO_FAINA;
	}
	
	public float getPrecioPorcion() {
		return PRECIO_PORCION;
	}
}
