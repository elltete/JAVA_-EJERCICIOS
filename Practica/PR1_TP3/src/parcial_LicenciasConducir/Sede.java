package parcial_LicenciasConducir;

import java.util.ArrayList;

public class Sede {
	
	private ArrayList<Examen> examenes;

	public Sede() {
		this.examenes = new ArrayList<Examen>();
	}
	
	public void agregarExamen(Examen examen) {
		this.examenes.add(examen);
	}
	
	public Informe obtenerInforme() {
		Informe informe = new Informe(0,0);
		int cantAutoApp = 0;
		int cantNoApp = 0;
		int tiempoAutoApp = 0;		
		for(Examen ex: examenes) {
			if(ex.aprobado()) {
				if(ex instanceof ExamenAuto) {
					cantAutoApp++;
					tiempoAutoApp += ((ExamenAuto) ex).tiempo();
				}
			} else {
				cantNoApp++;
			}
		}
		if(examenes.size() != 0) {
			informe.setPorcentajeExamenesReporbados((float) cantNoApp / examenes.size() * 100 );
		}
		if(cantAutoApp != 0) {
			informe.setPromedioTiempoExamenesAutosApp((float) tiempoAutoApp / cantAutoApp);
		}
		return informe;
	}

}
