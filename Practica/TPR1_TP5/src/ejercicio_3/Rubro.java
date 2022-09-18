package ejercicio_3;

public class Rubro {

	final static int TOTAL_MESES=12;
	
	private String nombre;
	
	double[] gastosPorMes;
	
	public Rubro(String nombre) {
		this.nombre = nombre;
		inicializarGastos();
	}
	
	private void inicializarGastos() {
		this.gastosPorMes = new double[TOTAL_MESES];
	}
	
	public void agregarGasto(Mes mes, double importe) {
		gastosPorMes[mes.ordinal()] += importe;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getTotalGastos(Mes mes) {
		return gastosPorMes[mes.ordinal()];
	}
	
	
	
	
}
