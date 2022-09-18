package parcial_LicenciasConducir;

public abstract class Examen implements Evaluable {
	
	private String fecha;
	private Persona persona;
	
	public Examen(String fecha, Persona persona) {
		this.fecha = fecha;
		this.persona = persona;
	}

}
