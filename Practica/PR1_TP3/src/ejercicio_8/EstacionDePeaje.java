package ejercicio_8;

import java.util.ArrayList;

public class EstacionDePeaje {
	
	private static int idUnico = 1;
	
	private int id;
	private ArrayList<Cabina> listaDeCabinas;
	private String descripcion;

	public EstacionDePeaje(String descripcion) {
		this.id = idUnico++;
		listaDeCabinas = new ArrayList<Cabina>();
		this.descripcion = descripcion;
	}
	
	public void agregarCabina(Cabina cabina) {
		listaDeCabinas.add(cabina);
	}

	public ArrayList<Cabina> cabinasConEfectivo(){
		ArrayList<Cabina> listaDeCabinasEfectivo = new ArrayList<Cabina>();
		for(Cabina cab: listaDeCabinas) {
			if(cab.aceptaPagoEnEfectivo()) {
				listaDeCabinasEfectivo.add(cab);
			}
		}
		return listaDeCabinasEfectivo;
	}
	
	public float promedioDemora() {
		int cant = 0;
		int diasDemora = 0;
		for (Cabina cab: listaDeCabinas) {
			if(cab.aceptaPagoElectronico()) {
				cant++;
				diasDemora += cab.getMedioDePago().getCantDiasDemoraCobro();
			}
		}
		return (float) diasDemora / cant;
	}

	@Override
	public String toString() {
		return "EstacionDePeaje [id=" + id + ", listaDeCabinas=" + listaDeCabinas + ", descripcion=" + descripcion
				+ "]" + " SIZE:" + this.listaDeCabinas.size();
	}

}
