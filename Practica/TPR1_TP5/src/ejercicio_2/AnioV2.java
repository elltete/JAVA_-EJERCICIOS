package ejercicio_2;

public class AnioV2 {
	
	private int [] diasDelMes = {31,28,31,30,31,30,31,31,30,31,30,31};

	public String getNombreDelMes(int numeroMes) {
		String resultado;
		if(numeroMes>0 && numeroMes<Mes.values().length+1) {
			resultado = Mes.values()[numeroMes-1].name();
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
