package clases;

public class ErrorInterno extends TareaConError {

	final static int TIEMPO_EST = 40;
	private String nombreTester;

	public ErrorInterno(String nombreDelProyecto, int nroVersionAfectado, int nroVersionCorrecion, String titulo,
			Usuario usuarioReportado, String nombreAmbiente, String nombreTester) {
		super(nombreDelProyecto, nroVersionAfectado, nroVersionCorrecion, titulo, usuarioReportado, nombreAmbiente);
		this.nombreTester = nombreTester;
	}
	

	@Override
	public int estimar() {
		return this.TIEMPO_EST;
	}

	@Override
	public TipoPrioridad calcularPrioridad() {


		return null;
	}

}
