package parcial_LicenciasConducir;

public class Circuito implements Evaluable {
	
	private static int CANTFALTASMAX = 2;
	private int tiempoSegundos;
	private int cantFaltas;
	
	public Circuito(int tiempoSegundos, int cantFaltas) {
		this.tiempoSegundos = tiempoSegundos;
		this.cantFaltas = cantFaltas;
	}

	public int getTiempoSegundos() {
		return tiempoSegundos;
	}

	public int getCantFaltas() {
		return cantFaltas;
	}

	@Override
	public boolean aprobado() {
		return this.cantFaltas <= this.CANTFALTASMAX;
	}

}
