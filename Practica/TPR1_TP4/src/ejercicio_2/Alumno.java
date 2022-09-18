package ejercicio_2;

import ejercicio_3.RangoDeEnteros;

public class Alumno extends Persona {
	
	final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
	
	private static final String FUERA_LIMITE = "Numero de Legajo fuera de los limites.";
	
	private int numeroLegajo;

	public Alumno(String nombreCompleto, int anioNacimiento, int numeroLegajo) {
		super(nombreCompleto, anioNacimiento);
		setNumeroLegajo(numeroLegajo);
	}

	public void setNumeroLegajo(int numeroLegajo) {
		if(!RANGO_NRO_DOCUMENTO.incluye(numeroLegajo)) {
			throw new IllegalArgumentException(FUERA_LIMITE);
		}
		this.numeroLegajo = numeroLegajo;
	}
	
	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	@Override
	public String toString() {
		return "Alumno [RANGO_NRO_DOCUMENTO=" + RANGO_NRO_DOCUMENTO + ", numeroLegajo=" + numeroLegajo + "]";
	}
	

}
