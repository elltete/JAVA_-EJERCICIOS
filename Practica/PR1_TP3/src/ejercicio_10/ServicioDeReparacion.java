package ejercicio_10;

public class ServicioDeReparacion extends Servicio{
	
	final static double VALORHORA = 180;
	final static int DIFMINIMA = 3;
	final static double PORCDIFMIN = 0.25;
	
	private int dificultad;

	public ServicioDeReparacion(int cantidadHoras, int dificultad) {
		super(cantidadHoras);
		this.dificultad = dificultad;
	}

	public int getDificultad() {
		return this.dificultad;
	}

	@Override
	public double calcularPrecio() {
		double valor = 0;
		valor = super.getCantidadHoras() * this.VALORHORA;
		if(this.dificultad > DIFMINIMA) {
			valor = valor * (1+PORCDIFMIN);
		}
		return valor;
	}

}
