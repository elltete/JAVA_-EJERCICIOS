package ejercicio_5;

public class Futbol8 extends Torneo {

	public Futbol8() {
	}

	@Override
	public String getTipo() {
		return "Torneo de futbol 8";
	}

	@Override
	public int puntajePartidoGanado() {
		// Completar
		return 0;
	}

	@Override
	public int puntajePartidoPerdido() {
		return 1;
	}

	@Override
	public int puntajeVallaInvicta() {
		return 1;
	}

	@Override
	public int puntajeGanador4Goles() {
		return 0;
	}

	@Override
	public int puntajeEmpateMas3Goles() {
		return 1;
	}

}
