package practica3_otraSolucion;

import java.util.ArrayList;

public class Carrera {

	private ArrayList<Atleta> corredores;
	private ArrayList<Atleta> ganadores1Puesto;
	private ArrayList<Atleta> ganadores2Puesto;
	private ArrayList<Atleta> ganadores3Puesto;

	public Carrera() {
		corredores = new ArrayList<Atleta>();
	}

	public void agregarAtleta(Atleta atleta) {
		corredores.add(atleta);
	}
	
	private void ordenarListaCorredores() {
		Atleta aux = null;
		for (int i=0; i<corredores.size(); i++) {
			for (int j=i+1; j<corredores.size(); j++) {
				if (corredores.get(i).getSegundos() > corredores.get(j).getSegundos()) {
					aux = corredores.set(j,corredores.get(i));
					corredores.set(i,aux);
				}
			}
		}	
	}

	public void ganador() {
		ordenarListaCorredores();
		System.out.println("Array ordenado: " + corredores);
		
		ganadores1Puesto = new ArrayList<Atleta>();
		ganadores2Puesto = new ArrayList<Atleta>();
		ganadores3Puesto = new ArrayList<Atleta>();

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