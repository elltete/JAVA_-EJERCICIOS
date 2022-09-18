package ejercicio_4;

public class Main {

	public static void main(String[] args) {

		CircuitoATP circuito = new CircuitoATP();
		
		System.out.println(circuito.procesarInfo());
		
		System.out.println(circuito.procesarTorneosJugador("Delbonis"));
		
		System.out.println(circuito.obtenerResultadoJugador("Schwartzman", "RolandGarros"));

		System.out.println("Peor Resultado de Pella en el año: " + circuito.procesarPeorPosTorneoJugador("Pella"));
	}

}
