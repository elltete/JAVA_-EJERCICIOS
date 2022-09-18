package examen.clases;

public interface Juego {
	void jugar();
	void procesarEstado();
	ResultadoJuego obtenerEstado();
	boolean hayGanador();
}
