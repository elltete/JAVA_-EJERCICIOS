package clases;

public class Desarrollo extends Tarea {

	private String descrpcionFuncional;
	private int tiempoEstimado;
	
	public Desarrollo(String nombreDelProyecto, int nroVersionAfectado, int nroVersionCorrecion, String titulo,
			Usuario usuarioReportado, String descrpcionFuncional, int tiempoEstimado) {
		super(nombreDelProyecto, nroVersionAfectado, nroVersionCorrecion, titulo, usuarioReportado);
		this.descrpcionFuncional = descrpcionFuncional;
		this.tiempoEstimado = tiempoEstimado;
	}

	@Override
	public int estimar() {
		return this.tiempoEstimado;
	}

}
