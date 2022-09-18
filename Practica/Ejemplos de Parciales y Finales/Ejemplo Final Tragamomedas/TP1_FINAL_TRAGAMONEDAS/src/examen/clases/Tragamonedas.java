package examen.clases;

public class Tragamonedas implements Juego {

	private static final int CANT_RODILLOS = 7;
	private static final int LADOS = 6;
	// TODO descomentar y completar
	// private ... rodillos;
	// private ... estadisticas;
	private ResultadoJuego estado;
	private int intentos;

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
	public boolean hayGanador() {
		return estado.ordinal() > ResultadoJuego.SIN_SUERTE.ordinal();
	}

	private boolean todosIguales() {
		// TODO implementar (y cambiar el false por lo que corresponda)
		return false;
	}

	private boolean capicua() {
		// TODO implementar (y cambiar el false por lo que corresponda)
		return false;
	}

	protected String obtenerResultado() {
		return obtenerEstado().toString();
	}

	@Override
	public void procesarEstado() {
		estado = ResultadoJuego.SIN_SUERTE;
		if (todosIguales()) {
			estado = ResultadoJuego.GENERALA;
		} else if (capicua()) {
			estado = ResultadoJuego.CAPICUA;
		}
		intentos++;
		// TODO implementar lo referido a la estadística.
	}

	private String rodillosToString() {
		String valor = "";
		for (int i = 0; i < rodillos.length; i++) {
			valor += rodillos[i].getValor();
		}
		return valor;
	}

	@Override
	public ResultadoJuego obtenerEstado() {
		return estado;
	}

	public void listarHistorialDetallado() {
		// TODO implementar
	}

}