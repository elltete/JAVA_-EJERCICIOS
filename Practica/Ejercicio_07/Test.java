package Ejercicio_07;

public class Test {
	
	private static Agenda agenda;
	
	public static void probarRegistrarTurno(String dni, String nombre, String apellido, String telefono) {
		System.out.println(agenda.registrarTurno(dni, nombre, apellido, telefono));
	}
	
	public static void probarDarPresente(String dni) {
		System.out.println("Probar dar presente de " + dni + " " + agenda.darPresente(dni));
	}
	
	public static void probarAnularTurno(String dni) {
		System.out.println("Probar anular turno de " + dni + " " + agenda.anularTurno(dni));
	}
	
	public static void probarObtenerAusentes() {
		System.out.println("Listado de ausentes");
		for (Paciente paciente: agenda.obtenerAusentes()) {
			System.out.println(paciente);
		}
	}

	public static void main(String[] args) {
		agenda = new Agenda(3);
		System.out.println(agenda);

		probarRegistrarTurno("111111", "Diego", "Weinstein", "11-6666-6666");
		probarRegistrarTurno("111111", "Diego", "Weinstein", "11-6666-6666");
		probarRegistrarTurno("111112", "Pablo", "Perez", "11-6666-7777");
		probarRegistrarTurno("111113", "Pablo", "Perez", "11-6666-7777");
		probarRegistrarTurno("111114", "Pablo", "Perez", "11-6666-7777");
		
		probarDarPresente("111112");
		probarDarPresente("111112");
		probarDarPresente("811112");
		
		probarAnularTurno("811112");
		
		probarDarPresente("111113");
		probarAnularTurno("111113");
		agenda.listarTurnos();
		probarObtenerAusentes();
	}

}
