package practica2;

import java.util.ArrayList;

public class Carrera {
	
	private ArrayList<Atleta> corredores;
	private ArrayList<Atleta> ganadores;
	
	public Carrera() {
		corredores = new ArrayList<Atleta>();
	}

	public void agregarAtleta(Atleta atleta) {
		corredores.add(atleta);
	}
	
	public void ganador() {
		ganadores = new ArrayList<Atleta>();
		double menorTiempo = Double.MAX_VALUE;
		for(Atleta at: corredores) {
			if(at.getSegundos() <= menorTiempo) {
				if(at.getSegundos() == menorTiempo) {
					ganadores.add(at);
				}else {
					ganadores.clear();;
					ganadores.add(at);
					menorTiempo = at.getSegundos();
				}
			}
		}
		System.out.println("Mejores tiempos: " + ganadores);
	}

	@Override
	public String toString() {
		return "Carrera [corredores=" + corredores + "]";
	}
	
}
