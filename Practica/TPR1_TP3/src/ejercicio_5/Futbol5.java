package ejercicio_5;

public class Futbol5 extends Torneo {

	public Futbol5() {
	}

	@Override
	public String getTipo() {
		return "Torneo de futbol 5";
	}

	@Override
	public int puntajePartidoGanado() {
		// Completar
		return 0;
	}

	@Override
	public int puntajePartidoPerdido() {
		return 0;
	}

	@Override
	public int puntajeVallaInvicta() {
		return 0;
	}

	@Override
	public int puntajeGanador4Goles() {
		return 1;
	}

	@Override
	public int puntajeEmpateMas3Goles() {
		return 2;
	}

}
