package parcial_LicenciasConducir;

public class Informe {
	
	private float porcentajeExamenesReporbados;
	private float promedioTiempoExamenesAutosApp;
	
	public Informe(float porcentajeExamenesReporbados, float promedioTiempoExamenesAutosApp) {
		this.porcentajeExamenesReporbados = porcentajeExamenesReporbados;
		this.promedioTiempoExamenesAutosApp = promedioTiempoExamenesAutosApp;
	}

	public void setPorcentajeExamenesReporbados(float porcentajeExamenesReporbados) {
		this.porcentajeExamenesReporbados = porcentajeExamenesReporbados;
	}

	public void setPromedioTiempoExamenesAutosApp(float promedioTiempoExamenesAutosApp) {
		this.promedioTiempoExamenesAutosApp = promedioTiempoExamenesAutosApp;
	}

	@Override
	public String toString() {
		return "Informe [porcentajeExamenesReporbados=" + porcentajeExamenesReporbados
				+ ", promedioTiempoExamenesAutosApp=" + promedioTiempoExamenesAutosApp + "]";
	}

}
