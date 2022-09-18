package clases;

import java.util.ArrayList;

public abstract class TareaConError extends Tarea {

	private String nombreAmbiente;
	ArrayList<String> casosDePrueba;
	
	
	public TareaConError(String nombreDelProyecto, int nroVersionAfectado, int nroVersionCorrecion, String titulo,
			Usuario usuarioReportado, String nombreAmbiente) {
		super(nombreDelProyecto, nroVersionAfectado, nroVersionCorrecion, titulo, usuarioReportado);
		this.nombreAmbiente = nombreAmbiente;
		this.casosDePrueba = new ArrayList<String>();
	}
	
	

}
