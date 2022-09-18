package examen.clases;

public class Tragamonedas implements Juego, Mostrable {

	private static final int CANT_RODILLOS = 5;
	private static final int LADOS = 6;
	// TODO descomentar y completar
	// private ... rodillos;
	private EstadoJuego estado;

	public Tragamonedas() {
		// TODO implementar
	}

	private void crearRodillos() {
		// TODO implementar
	}

	@Override
	public void jugar() {
		for (int i = 0; i < rodillos.length; i++) {
			rodillos[i].rodar();
		}
		procesarEstado();
	}

	@Override
	public void mostrar() {
		for (int i = 0; i < rodillos.length; i++) {
			rodillos[i].mostrar();
		}
		System.out.println(" - " + obtenerResultado());
	}

	@Override
	public boolean hayGanador() {
		return estado.ordinal() > EstadoJuego.SIN_SUERTE.ordinal();
	}

	private boolean generala() {
		// TODO implementar
	}

	private boolean capicua() {
		// TODO implementar
	}

	protected String obtenerResultado() {
		return obtenerEstado().toString();
	}

	@Override
	public void procesarEstado() {
		estado = EstadoJuego.SIN_SUERTE;
		if (generala()) {
			estado = EstadoJuego.GENERALA;
		} else if (capicua()) {
			estado = EstadoJuego.CAPICUA;
		}
	}

	@Override
	public EstadoJuego obtenerEstado() {
		return estado;
		
	}

}