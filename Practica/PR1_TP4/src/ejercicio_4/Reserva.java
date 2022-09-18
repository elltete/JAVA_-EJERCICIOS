package ejercicio_4;

public class Reserva {
	
	private String codigo;
	private int cantPersonas;
	Estacion[] recorrido;
	
	public Reserva(String codigo, int cantPersonas, Estacion estacionInicio, Estacion estacionFinal) {
		this.codigo = codigo;
		this.cantPersonas = cantPersonas;
		recorrido = new Estacion[2];
		recorrido[0] = estacionInicio;
		recorrido[1] = estacionFinal;			
	}

	public int estacionesRecorridas() {
		return recorrido[1].ordinal() - recorrido[0].ordinal();
	}

	public int getCantPersonas() {
		return cantPersonas;
	}

	public boolean recorreEstacion(Estacion estacion) {
		return (estacion.ordinal() >= recorrido[0].ordinal() && estacion.ordinal() <= recorrido[1].ordinal());
	}
	
	

}
