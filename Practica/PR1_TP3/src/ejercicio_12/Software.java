package ejercicio_12;

import java.util.ArrayList;

public class Software {
	
	private ArrayList<Programa> listaProgramas;
	
	public Software() {
		listaProgramas = new ArrayList<Programa>();
	}
	
	public void agregarPrograma(Programa programa) {
		listaProgramas.add(programa);
	}
	
	public ArrayList<Programa> programasPorDebajoDe(double valor){
		ArrayList<Programa> programas = new ArrayList<Programa>();
		for(Programa p: listaProgramas) {
			if(p.calidadPorDebajoDe(valor)) {
				programas.add(p);
			}
		}
		return programas;
	}


}
