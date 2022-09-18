package ejercicio_10;

public class ServicioDeArmado extends Servicio {

	final static int VALORHORA = 250;
	
	public ServicioDeArmado(int cantidadHoras) {
		super(cantidadHoras);
	}

	@Override
	public double calcularPrecio() {
		return super.getCantidadHoras() * this.VALORHORA;
	}
	
}
