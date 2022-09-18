package examen;

import examen.clases.Tragamonedas;

public class ExamenFinal {

	private static final int LIMITE = 50;

	public static void main(String[] args) {
		try {
			Tragamonedas tm = new Tragamonedas();
			for (int i = 0; i < LIMITE; i++) {
				do {
					tm.jugar();
				} while (!tm.hayGanador());
			}
			tm.listarHistorialDetallado();
		} catch (RuntimeException re) {
			System.out.println("Hubo un problema al crear el tragamonedas: " + re.getMessage());
		}
	}

}
