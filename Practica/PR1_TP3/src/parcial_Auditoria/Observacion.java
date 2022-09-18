package parcial_Auditoria;

import java.util.ArrayList;

public abstract class Observacion implements Expirable {

	private String titulo;
	private String descripcion;
	private int fechaAlta;
	private Auditor auditor;
	private ArrayList<Compromiso> compromisos;
	
	public Observacion(String titulo, String descripcion, int fechaAlta, Auditor auditor) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaAlta = fechaAlta;
		this.auditor = auditor;
		this.compromisos = new ArrayList<Compromiso>();
	}

	public void agregarCompromiso(Compromiso comp) {
		this.compromisos.add(comp);
	}
	
	public ArrayList<Compromiso> getCompromisos(){
		return this.compromisos;
	}

	@Override
	public String toString() {
		return "Observacion [titulo=" + titulo + ", descripcion=" + descripcion + "]";
	}
	
	public boolean tieneUnCompromisoVencido(int diasAtraso) {
		boolean vencida = false;
		int i = 0;
			while(i < compromisos.size() && !vencida) {
				vencida = compromisos.get(i).estaVencido(diasAtraso);
				i++;
			}
		
		
		
		return true;
	}
	
}
