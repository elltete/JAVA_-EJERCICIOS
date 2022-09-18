package tp1.parcial1.clases;
import java.util.ArrayList;

public class TallerMecanico {

	private ArrayList<Servicio> serviciosEfectuados;
	private String nombre;

	private static final String FORMATO_CANTIDADES = "Se efectuaron: %d cambios de aceite, %d encendido y %d alineacion\n";

	public TallerMecanico(String nombre) {
		this.nombre = nombre;
		this.serviciosEfectuados = new ArrayList<Servicio>();
	}

	public boolean agregarServicio(Servicio nuevoServicio) {
		boolean pudo = false;
		if(nuevoServicio != null) {
			serviciosEfectuados.add(nuevoServicio);
			pudo = true;
		}
		return pudo;
	}

	public void listarServicios() {
		int cantCambioAceite = 0;
		int cantEncendido = 0;
		int cantAlineacion = 0;
		double importeVentas = 0;
		for(Servicio s: serviciosEfectuados) {
			if(s instanceof Encendido) {
				cantEncendido++;
			} else if(s instanceof CambioAceite) {
				cantCambioAceite++;
			} else if(s instanceof Alineacion) {
				cantAlineacion++;
			}
			importeVentas += s.calcularPrecioVenta();
		}
		System.out.printf(FORMATO_CANTIDADES,cantCambioAceite, cantEncendido, cantAlineacion);

		System.out.printf("El importe total de ventas es de :" + importeVentas);
	}
}
