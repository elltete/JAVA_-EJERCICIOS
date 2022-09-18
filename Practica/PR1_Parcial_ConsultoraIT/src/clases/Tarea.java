package clases;

public abstract class Tarea implements Estimable, Priorizable{

	final static int PRIO_MAX = 24;
	final static int PRIO_MIN = 16;
	private String nombreDelProyecto;
	private int nroVersionAfectado;
	private int nroVersionCorrecion;
	private String titulo;
	private Usuario usuarioReportado;
	
	
	public Tarea(String nombreDelProyecto, int nroVersionAfectado, int nroVersionCorrecion, String titulo, Usuario usuarioReportado) {
		this.nombreDelProyecto = nombreDelProyecto;
		this.nroVersionAfectado = nroVersionAfectado;
		this.nroVersionCorrecion = nroVersionCorrecion;
		this.titulo = titulo;
		this.usuarioReportado = usuarioReportado;
	}
	
	@Override
	public TipoPrioridad calcularPrioridad() {
		TipoPrioridad salida = TipoPrioridad.ALTA;
		if(estimar() > this.PRIO_MIN) {
			if(estimar() >= this.PRIO_MAX) {
				salida = TipoPrioridad.BAJA;
			} else {
				salida = TipoPrioridad.MEDIA;
			}
		}
		return salida;
	}
	
}
