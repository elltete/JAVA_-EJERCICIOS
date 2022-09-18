package Ejemplo_01;

public class Test {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		agenda.agregarContacto("Diego Weinstein", "6666-6666");
		agenda.agregarContacto("Marta Lopez", "7777-7777");
		agenda.agregarContacto("Pablo Lopez", "8888-8888");
		
		agenda.agregarContacto(0, "Adrián Ventura", "9999-9999");
		
		agenda.borrar(1);
		agenda.borrar("Pablo Lopez");
		
		System.out.println("Cantidad de contactos: " + agenda.cantidadContactos());

		agenda.mostrar();
		
		// Buscar y mostrar a Marta Lopez
		System.out.println("\nBuscando a Marta");
		System.out.println(agenda.buscar("Marta Lopez"));
		
		agenda.reempazar(0, new Persona("Diego Weinstein", "6666-6666"));
	
		agenda.reemplazarTelefono("Diego WeinsteinXX", "9999-9999");
		agenda.reemplazarTelefono("Diego Weinstein", "9999-9999");
		
		agenda.agregarContacto("Diego Weinstein", "1111-1111");
		
		agenda.mostrar();
		
		agenda.llamar("Diego Weinstein", new Fecha(1,1,2021));
		agenda.llamar("Diego Weinstein", new Fecha(10,1,2021));
		agenda.llamar("Diego Weinstein", new Fecha(5,2,2021));
		
		agenda.mostrarLlamadas("Diego Weinstein");
	}

}
