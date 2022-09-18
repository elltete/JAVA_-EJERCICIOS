package ejercicio_3y4;

public class Cliente {

	private String CUIL;
	private String nombre;
	private Ticket ticket;
	
	
	public Cliente(String CUIL, String nombre) {
		this.CUIL = CUIL;
		this.nombre = nombre;
		this.ticket = null;
	}
	
	public Ticket getTicket() {
		return this.ticket;
	}
	
	public void crearTicket() {
		this.ticket = new Ticket();
	}
	
	public void imprimirTicket() {
		ticket.imprimir();
	}
	
}
