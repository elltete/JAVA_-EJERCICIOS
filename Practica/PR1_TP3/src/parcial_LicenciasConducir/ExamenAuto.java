package parcial_LicenciasConducir;

public class ExamenAuto extends Examen {
	
	private static int TIEMPOAPP = 90;
	private Circuito circuito;
	private Auto auto;

	public ExamenAuto(String fecha, Persona persona, Circuito circuito, Auto auto) {
		super(fecha, persona);
		this.circuito = circuito;
		this.auto = auto;
	}

	public int tiempo() {
		return circuito.getTiempoSegundos();
	}

	@Override
	public boolean aprobado() {
		return circuito.aprobado() && circuito.getTiempoSegundos() <= TIEMPOAPP;
	}

}
