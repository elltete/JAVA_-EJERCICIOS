package clases;

public class ErrorEnProduccion extends TareaConError {
	
	final static int TIEMPO_EST_F = 16;	
	final static int TIEMPO_EST_T = 8;
	private String nombreDelAmbiente;
	private boolean flagStopper;
	
	public ErrorEnProduccion(String nombreDelProyecto, int nroVersionAfectado, int nroVersionCorrecion, String titulo,
			Usuario usuarioReportado, String nombreAmbiente, String nombreDelAmbiente, boolean flagStopper) {
		super(nombreDelProyecto, nroVersionAfectado, nroVersionCorrecion, titulo, usuarioReportado, nombreAmbiente);
		this.nombreDelAmbiente = nombreDelAmbiente;
		this.flagStopper = flagStopper;
	}

	public boolean isFlagStopper() {
		return flagStopper;
	}

	@Override
	public int estimar() {
		int salida = this.TIEMPO_EST_F;
		if(this.isFlagStopper()) {
			salida = this.TIEMPO_EST_T;
		}
		return salida;
	}

	@Override
	public TipoPrioridad calcularPrioridad() {
		TipoPrioridad salida = TipoPrioridad.ALTA;
		if(estimar() == this.TIEMPO_EST_T) {
			salida = TipoPrioridad.MEDIA;
		}
		return salida;
	}

}
