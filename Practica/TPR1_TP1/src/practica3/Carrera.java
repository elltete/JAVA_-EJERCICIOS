package practica3;

import java.util.ArrayList;

public class Carrera {

	private ArrayList<Atleta> corredores;

	public Carrera() {
		corredores = new ArrayList<Atleta>();
	}

	public void agregarAtleta(Atleta atleta) {
		corredores.add(atleta);
	}

	public void ganador() {
		ArrayList<Atleta> ganadores1Puesto = new ArrayList<Atleta>();
		ArrayList<Atleta> ganadores2Puesto = new ArrayList<Atleta>();
		ArrayList<Atleta> ganadores3Puesto = new ArrayList<Atleta>();
		for(Atleta at: corredores) {
			if(ganadores1Puesto.size() == 0) {
				ganadores1Puesto.add(at);
			} else {
				if(ganadores1Puesto.get(0).getSegundos() >= at.getSegundos()) {
					if(ganadores1Puesto.get(0).getSegundos() == at.getSegundos()) {
						ganadores1Puesto.add(at);
					} else {
						ganadores3Puesto = new ArrayList<Atleta>(ganadores2Puesto);
						ganadores2Puesto = new ArrayList<Atleta>(ganadores1Puesto);
						ganadores1Puesto.clear();
						ganadores1Puesto.add(at);
					}
				} else {
					if(ganadores2Puesto.size() == 0) {
						ganadores2Puesto.add(at);
					} else {
						if(ganadores2Puesto.get(0).getSegundos() >= at.getSegundos()) {
							if(ganadores2Puesto.get(0).getSegundos() == at.getSegundos()) {
								ganadores2Puesto.add(at);
							} else {
								ganadores3Puesto = new ArrayList<Atleta>(ganadores2Puesto);
								ganadores2Puesto.clear();
								ganadores2Puesto.add(at);
							}
						}else {
							if(ganadores3Puesto.size() == 0) {
								ganadores3Puesto.add(at);
							} else {
								if(ganadores3Puesto.get(0).getSegundos() == at.getSegundos()) {
									ganadores3Puesto.add(at);
								}
							}
						}
					}
				}
			}
		}
		System.out.println("Mejores 1er tiempos: " + ganadores1Puesto);
		System.out.println("Mejores 2do tiempos: " + ganadores2Puesto);
		System.out.println("Mejores 3er tiempos: " + ganadores3Puesto);
	}

	@Override
	public String toString() {
		return "Carrera [corredores=" + corredores + "]";
	}

}