package ejercicio_4;

public class Test {

	public static void main(String[] args) {

		Empresa emp = new Empresa();

		emp.agregarReserva(new Reserva("A", 1, Estacion.Mercedes, Estacion.Buenos_Aires));
		emp.agregarReserva(new Reserva("A", 1, Estacion.Buenos_Aires, Estacion.Mercedes));
		emp.agregarReserva(new Reserva("A", 2, Estacion.Buenos_Aires, Estacion.Lujan));
		emp.agregarReserva(new Reserva("A", 3, Estacion.Buenos_Aires, Estacion.Suipacha));
		emp.agregarReserva(new Reserva("A", 4, Estacion.Buenos_Aires, Estacion.Chivilcoy));
		emp.agregarReserva(new Reserva("A", 5, Estacion.Buenos_Aires, Estacion.Bragado));
		emp.agregarReserva(new Reserva("A", 6, Estacion.Mercedes, Estacion.Alberti));
		emp.agregarReserva(new Reserva("A", 7, Estacion.Suipacha, Estacion.Alberti));
		emp.agregarReserva(new Reserva("A", 8, Estacion.Chivilcoy, Estacion.Bragado));
		emp.agregarReserva(new Reserva("A", 9, Estacion.Alberti, Estacion.Bragado));
		emp.agregarReserva(new Reserva("A", 10, Estacion.Buenos_Aires, Estacion.Bragado));
		
		System.out.println(emp.recaudacionTotal());
		
		System.out.println(emp.cantVecesRecorrida(Estacion.Buenos_Aires));
		System.out.println(emp.cantVecesRecorrida(Estacion.Mercedes));
		System.out.println(emp.cantVecesRecorrida(Estacion.Alberti));

	}

}
