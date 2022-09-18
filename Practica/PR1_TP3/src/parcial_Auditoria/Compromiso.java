package parcial_Auditoria;

public class Compromiso {
	
	private String descripcion;
	private int fechaCumplimiento;
	
	public Compromiso(String descripcion, int fechaCumplimiento) {
		this.descripcion = descripcion;
		this.fechaCumplimiento = fechaCumplimiento;
	}
	
	public int diasTranscurridos() {
		return this.fechaCumplimiento;
	}

	public boolean estaVencido(int dias) {
		return fechaCumplimiento > dias;
	}

}
