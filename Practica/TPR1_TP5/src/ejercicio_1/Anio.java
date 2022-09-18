package ejercicio_1;

public class Anio {

	private String [] mesesDelAnio = {"Enero", "Febrero", "Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

	private int [] diasDelMes = {31,28,31,30,31,30,31,31,30,31,30,31};

	public String getNombreDelMes(int numeroMes) {
		String resultado;
		if(numeroMes>0 && numeroMes<mesesDelAnio.length+1) {
			resultado = mesesDelAnio[numeroMes-1];
		}else {
			resultado = "Valor ingresado invalido.";
		}

		return resultado;
	}

	public int diasTranscurridos(int numeroMes) {
		int cant =0;
		for(int i=0; i<numeroMes-1; i++) {
			cant += diasDelMes[i];
		}
		return cant;
	}

}
