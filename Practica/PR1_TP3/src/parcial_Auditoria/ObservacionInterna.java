package parcial_Auditoria;

public class ObservacionInterna extends Observacion{
	
	private static int DIAS_ATRASO = 90;
	private boolean enRevision;
	
	public ObservacionInterna(String titulo, String descripcion, int fechaAlta, Auditor auditor, boolean enRevision) {
		super(titulo, descripcion, fechaAlta, auditor);
		this.enRevision = enRevision;
	}

	private boolean estaEnRevision() {
		return this.enRevision;
	}
	
	@Override
	public boolean estaVencida() {
		return tieneUnCompromisoVencido(DIAS_ATRASO) && !estaEnRevision();
	}

}
