package ejercicio_4;

import java.util.ArrayList;

public class CircuitoATP {
	
	private String[] jugadores;
	private String[] torneos;
	private int[][] resultados;

	public CircuitoATP() {
		this.cargarData();
	}
	
	public void cargarData() {
		this.jugadores = new String[] {"Pella", "Del Potro", "Schwartzman", "Mayer", "Delbonis"};
		this.torneos = new String[] { "Australia", "USOpen", "RolandGarros", "Wimbledon", "Shangai"};
		this.resultados = new int[][] {	{1,3,4,1,3},
										{3,2,3,4,1},
										{2,1,5,5,2},
										{4,5,1,2,5},
										{5,4,2,3,4}};
	}
	
	public ArrayList<Jugador> procesarInfo() {
		ArrayList<Jugador> jugadoresLocal = new ArrayList<>();		
		for(int i=0; i<jugadores.length; i++) {
			jugadoresLocal.add(new Jugador(jugadores[i]));
			for(int j=0; j<resultados[i].length; j++) {
				jugadoresLocal.get(i).procesarResultado(resultados[i][j]);
			}
		}
		System.out.println("Resultado final campeonato");
		return jugadoresLocal;
	}
	
	public String procesarTorneosJugador(String nombreJugador) {
		String resultado = "";
		int posicionJugador = buscoJugador(nombreJugador);
		resultado += nombreJugador + ": ";
		for(int i=0; i<resultados[posicionJugador].length; i++) {
			resultado += torneos[i] + ": " + resultados[posicionJugador][i] + " ";
		}
		return resultado;
	}
	
	public String obtenerResultadoJugador(String nombreJugador, String torneo) {
		int posicionJugador = buscoJugador(nombreJugador);
		int posicionTorneo = buscoTorneo(torneo);
		return "Resultado de " + nombreJugador + " en " + torneo + ": " + resultados[posicionJugador][posicionTorneo];
	}
	
	public int procesarPeorPosTorneoJugador(String nombreJugador) {
		int posicionJugador = buscoJugador(nombreJugador);
		int posicion = 0;
		for(int i=0; i<resultados[posicionJugador].length; i++) {
			if(resultados[posicionJugador][i] > posicion) {
				posicion = i;
			}
		}
		return posicion;
	}
	
	private int buscoJugador(String nombreJugador) {
		int posJugador = -1;
		boolean encontrado = false;
		int i = 0;
		while(i<jugadores.length && !encontrado) {
			if(jugadores[i].equals(nombreJugador)) {
				posJugador = i;
				encontrado = true;
			}else {
				i++;
			}
		}
		return posJugador;
	}
	
	private int buscoTorneo(String nombreTorneo) {
		int posTorneo = -1;
		boolean encontrado = false;
		int i = 0;
		while(i<torneos.length && !encontrado) {
			if(torneos[i].equals(nombreTorneo)) {
				posTorneo = i;
				encontrado = true;
			}else {
				i++;
			}
		}
		return posTorneo;
	}
}
