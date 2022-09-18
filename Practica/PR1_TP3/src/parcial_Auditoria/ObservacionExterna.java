package parcial_Auditoria;

public class ObservacionExterna extends Observacion {

	private static int DIAS_ATRASO = 60;
	private String consultoria;

	public ObservacionExterna(String titulo, String descripcion, int fechaAlta, Auditor auditor, String consultoria) {
		super(titulo, descripcion, fechaAlta, auditor);
		this.consultoria = consultoria;
	}

	@Override
	public boolean estaVencida() {
		return tieneUnCompromisoVencido(DIAS_ATRASO);
	}


}
