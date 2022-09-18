package ejercicio_2;

import java.util.Calendar;
import java.util.Date;

import ejercicio_3.RangoDeEnteros;

public abstract class Persona {
	
	final RangoDeEnteros RANGO_ANIO_NACIMIENTO = new RangoDeEnteros(1900, 2021);
	
	private static final String NOMBRE_VACIO = "El nombre no pueder ser vacio.";
	private static final String NOMBRE_NULL = "El nombre no pueder NULL.";
	private static final String NACIMIENTO_FUERA_RANGO = "El año de nacimiento fuera de rango.";
	private static final String FALLECIMIENTO_MAYOR_ANIO_ACTUAL= "El año de fallecimiento debe ser menor al año actual.";
	private static final String FALLECIMIENTO_MENOR_NACIMIENTO = "El año de fallecimiento debe ser mayor al año de nacimiento.";
	
	private static int VALOR_AUN_VIVE = -9999;
	
	private String nombreCompleto;
	private int anioNacimiento;
	private int anioFallecimiento;
	private int anioActual;
	
	public Persona(String nombreCompleto, int anioNacimiento) {
		this.setAnioActual();
		this.setNombreCompleto(nombreCompleto);
		this.setAnioNacimiento(anioNacimiento);
		this.anioFallecimiento = VALOR_AUN_VIVE;
	}

	public Persona(String nombreCompleto, int anioNacimiento, int anioFallecimiento) {
		this.setAnioActual();
		this.setNombreCompleto(nombreCompleto);
		this.setAnioNacimiento(anioNacimiento);
		this.setAnioFallecimiento(anioFallecimiento);
	}
	
	public boolean vive() {
		return (anioFallecimiento == VALOR_AUN_VIVE);
	}
	
	public void setNombreCompleto(String nombreCompleto) {
		if(nombreCompleto.isEmpty()) {
			throw new IllegalArgumentException(NOMBRE_VACIO);
		}
		if(nombreCompleto == null) {
			throw new IllegalArgumentException(NOMBRE_NULL);
		}
		this.nombreCompleto = nombreCompleto;
	}
	
	public void setAnioNacimiento(int anioNacimiento) {
		if(!RANGO_ANIO_NACIMIENTO.incluye(anioNacimiento)) {
			throw new IllegalArgumentException(NACIMIENTO_FUERA_RANGO);
		}
		this.anioNacimiento = anioNacimiento;
	}
	
	public void setAnioFallecimiento(int anioFallecimiento) {
		if(anioFallecimiento != VALOR_AUN_VIVE) {
			if(anioFallecimiento > this.anioActual) {
				throw new IllegalArgumentException(FALLECIMIENTO_MAYOR_ANIO_ACTUAL);				
			} else if(anioFallecimiento < this.anioNacimiento) {
				throw new IllegalArgumentException(FALLECIMIENTO_MENOR_NACIMIENTO);
			}
		}
		this.anioFallecimiento = anioFallecimiento;
	}
	
	public int edad() {
		return this.anioActual - this.anioNacimiento;
	}
	
	public void setAnioActual() {
		this.anioActual = Calendar.getInstance().get(Calendar.YEAR);
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	
	public int getAnioFallecimiento() {
		return anioFallecimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombreCompleto=" + nombreCompleto + ", anioNacimiento=" + anioNacimiento
				+ ", anioFallecimiento=" + anioFallecimiento + ", anioActual=" + anioActual + "]";
	}

}
