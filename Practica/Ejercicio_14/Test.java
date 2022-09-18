package Ejercicio_14;

public class Test {

	private static Torneo torneo;
	
	private static void probarAgregarHoyo(int numero, int golpesPar) {
		System.out.println("Agregando hoyo " + numero + " resultado " + torneo.altaHoyo(numero, golpesPar));
	}
	
	private static void crearHoyos() {
		int golpesPar;
		for (int i=1; i<19; i++) {
			golpesPar = 4;
			if (i % 3 == 0) {
				golpesPar = 3;
			}
			else if (i % 7 == 0 ) {
				golpesPar = 5;
			}
			probarAgregarHoyo(i, golpesPar);
		}
	}

	private static void probarAgregarGolfista(int numero, String nombre, String apellido) {
		System.out.println("Agregando golfista " + numero + " resultado " 
					+ torneo.altaGolfista(numero, nombre, apellido));
	}
	
	private static void jugar (int numeroJugador, int numeroHoyo, int golpes) {
		System.out.println("Probando jugar numeroJugador=" + numeroJugador 
				+ " numeroHoyo=" + numeroHoyo
				+ " golpes=" + golpes
				+ " resultado=" + torneo.jugar(numeroJugador, numeroHoyo, golpes));
	}
	
	public static void main(String[] args) {
		torneo = new Torneo();
		crearHoyos();
		probarAgregarHoyo(10,3);
		
		probarAgregarGolfista(1, "Diego", "Weinstein");
		probarAgregarGolfista(1, "Diego", "Weinstein");
		probarAgregarGolfista(2, "Pablo", "Perez");
		probarAgregarGolfista(3, "Julio", "Lopez");
		
		
		jugar(1, 1, 3);
		jugar(1, 4, 2);
		jugar(2, 4, 6);
		
		jugar(3, 7, 4);
		jugar(3, 14, 3);

		
		torneo.mostrarHoyos();
		torneo.mostrarGolfistas();
		
		//System.out.println(torneo.obtenerMayorPuntaje());
		torneo.listarLideres();
		torneo.listarHoyosNoVisitados();
	}
	

}
