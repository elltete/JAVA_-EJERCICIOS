package Ejercicio_07;

public class Turno {
	private boolean sePresento;
	private Paciente paciente;
	
	public Turno(Paciente paciente) {
		this.paciente = paciente;
		this.sePresento = false;
	}

	@Override
	public String toString() {
		return "Turno [sePresento=" + sePresento + ", paciente=" + paciente + "]";
	}
	
	public boolean isSePresento() {
		return sePresento;
	}
	public void setSePresento(boolean sePresento) {
		this.sePresento = sePresento;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	private void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
}
