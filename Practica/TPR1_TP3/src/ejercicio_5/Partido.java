package ejercicio_5;

public class Partido {

	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int golesLocal;
	private int golesVisitante;
	
	
	public Partido() {
		equipoLocal				= null;
		equipoVisitante 		= null;
		golesLocal		= 0;
		golesVisitante	= 0;
	}

	public Partido(Equipo equipoLocal, Equipo equipoVisitante, int golesEquipoLocal, int golesEquipoVisitante) {
		this.equipoLocal 			= equipoLocal;
		this.equipoVisitante 		= equipoVisitante;
		this.golesLocal 		= golesEquipoLocal;
		this.golesVisitante 	= golesEquipoVisitante;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public int getGolesEquipoLocal() {
		return golesLocal;
	}

	public void setGolesEquipoLocal(int golesEquipoLocal) {
		this.golesLocal = golesEquipoLocal;
	}

	public int getGolesEquipoVisitante() {
		return golesVisitante;
	}

	public void setGolesEquipoVisitante(int golesEquipoVisitante) {
		this.golesVisitante = golesEquipoVisitante;
	}

}
