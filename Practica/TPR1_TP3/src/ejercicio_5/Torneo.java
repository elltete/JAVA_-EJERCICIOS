package ejercicio_5;

import java.util.ArrayList;

public abstract class Torneo {
	
	private int cantidadJugadores;
	private ArrayList<Equipo> equipos;
	private ArrayList<Jornada> jornadas;
	
	public Torneo() {
		// Completar
	}

	public void agregarJornada(Jornada jornada) {
		// Completar
	}
	
	public void eliminarJornada(Jornada jornada) {
		// Completar
	}
	
	public void agregarEquipo(Equipo equipo) {
		// Completar
	}
	
	public void eliminarEquipo(Equipo equipo) {
		// Completar
	}
	
	public void finalizarJornada(Jornada jornada) {
		if(jornadas.contains(jornada)) {
			// Completar
		}
	}
	
	public void mostrarTabla() {
		System.out.println(getTipo());
		System.out.println("Tabla de posiciones al cabo de " + String.valueOf(jornadas.size()) + " fechas:");
		// Completar
	}
	
	public abstract String getTipo();
	
	public void calcularPuntos(Partido partido) {
		int puntosLocal				= 0;
		int puntosVisitante			= 0;
		int golesEquipoLocal 		= partido.getGolesEquipoLocal();
		int golesEquipoVisitante 	= partido.getGolesEquipoVisitante();
		
		if(golesEquipoLocal > golesEquipoVisitante)//Si gana el local
		{
			// Completar
			
			} else {//Si gana el visitante

				// Completar
			}
		}

	// Completar
	
	public int puntajePartidoEmpatado() {
		return 1;
	}
	public int puntajePartidoGanado() {
		return 2;
	}
	
	public abstract int puntajePartidoPerdido();
	
	public abstract int puntajeVallaInvicta();
	
	public abstract int puntajeGanador4Goles();
	
	public abstract int puntajeEmpateMas3Goles();
	
}