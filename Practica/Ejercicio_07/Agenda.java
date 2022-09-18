package Ejercicio_07;

import java.util.ArrayList;

public class Agenda {
	private int cantidadMaxima;
	
	private ArrayList<Turno> turnos;

	public Agenda(int cantidadMaxima) {
		this.setCantidadMaxima(cantidadMaxima);
		turnos = new ArrayList<>();
	}
	
	private Turno buscarTurno(String dni) {
		Turno turno = null;
		int index = 0;
		while (turno == null && index < this.turnos.size()) {
			if (this.turnos.get(index).getPaciente().getDni().equals(dni)) {
				turno = this.turnos.get(index);
			}
			index++;
		}
		return turno;
	}
	
	public ResultadoReservarTurno registrarTurno(String dni, String nombre, String apellido, String telefono) {
		ResultadoReservarTurno resultado = ResultadoReservarTurno.TURNO_CONFIRMADO;
		
		if ( this.turnos.size() == cantidadMaxima ) {
			resultado = ResultadoReservarTurno.NO_HAY_MAS_TURNOS;
		}
		else if ( this.buscarTurno(dni) != null ) {
			resultado = ResultadoReservarTurno.YA_TIENE_UN_TURNO_ASIGNADO;
		}
		else {
			turnos.add(new Turno(new Paciente(dni, nombre, apellido, telefono)));
		}
		return resultado;
	}
	
	public void listarTurnos() {
		System.out.println("Cantidad de turnos asignados: " + this.turnos.size());
		for (Turno turno: this.turnos) {
			System.out.println(turno);
		}
	}
	
	public boolean darPresente( String dni ) {
		boolean pudoRealizar = false;
		
		Turno turno = this.buscarTurno(dni);
		if (turno != null && !turno.isSePresento()) {
			turno.setSePresento(true);
			pudoRealizar = true;
		}
		
		return pudoRealizar;
	}
	
	public boolean anularTurno( String dni ) {
		boolean pudoRealizar = false;
		
		Turno turno = this.buscarTurno(dni);
		if (turno != null && turno.isSePresento()) {
			turno.setSePresento(false);
			pudoRealizar = true;
		}
		
		return pudoRealizar;
	}
	
	public ArrayList<Paciente> obtenerAusentes() {
		ArrayList<Paciente> pacientesAusentes = new ArrayList<>();
		for (Turno turno: this.turnos) {
			if (!turno.isSePresento()) {
				pacientesAusentes.add(turno.getPaciente());
			}
		}
		return pacientesAusentes;
	}

	@Override
	public String toString() {
		return "Agenda [cantidadMaxima=" + cantidadMaxima + "]";
	}

	private int getCantidadMaxima() {
		return cantidadMaxima;
	}

	private void setCantidadMaxima(int cantidadMaxima) {
		if ( cantidadMaxima < 0 ) {
			cantidadMaxima = 0;
		}
		this.cantidadMaxima = cantidadMaxima;
	}
}
