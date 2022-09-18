package Ejercicio_11;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	public static final Fecha fechaHoy = new Fecha(8, 6, 2021);
	
	public Fecha(int dia, int mes, int anio) {
		setDia(dia);
		setMes(mes);
		setAnio(anio);
	}
	
	private int checkTope(int valor, int minimo, int maximo) {
		if (valor < minimo) {
			valor = minimo;
		}
		else if (valor > maximo) {
			valor = maximo;
		}
		return valor;	
	}
	
	private void setDia(int dia) {
		this.dia = checkTope(dia, 1, 31);
	}

	private void setMes(int mes) {
		this.mes = checkTope(mes, 1, 12);
	}

	private void setAnio(int anio) {
		this.anio = checkTope(anio, 2021, 2030);
	}

	public static int convertirEnDias(Fecha fecha) {
		return fecha.anio * 365 + fecha.mes * 30 + fecha.dia;
	}

	public static boolean esFechaMenor(Fecha fecha) {
		return convertirEnDias(fecha) < convertirEnDias(fechaHoy);
	}
	@Override
	public String toString() {
		return dia + "-" + mes + "-" + anio;
	}
	
	
}
