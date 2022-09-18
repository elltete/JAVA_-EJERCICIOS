package ejercicio_5;

import java.util.ArrayList;

import ejercicio_4.Vivienda;

public class Edificio {
	
	private ArrayList<Vivienda> viviendas;
	
	public Edificio() {
		viviendas = new ArrayList<Vivienda>();
	}
	
	public void agregarVivienda(Vivienda vivienda) {
		viviendas.add(vivienda);
	}
	
	public void realizarMudanza(int pisoActual, char DeptoActual, int pisoNuevo, char DeptoNuevo) {
		Vivienda vivActual = buscarVivienda(pisoActual, DeptoActual);
		Vivienda vivNueva = buscarVivienda(pisoNuevo, DeptoNuevo);
		if(vivActual == null) {
			System.out.println("Vivienda Actual no existe");
		} else if(!vivActual.estaOcupada()) {
			System.out.println("Vivienda Actual vacia");			
		}
		if(vivNueva == null) {
			System.out.println("Vivienda Nueva no existe");
		} else if(vivNueva.estaOcupada()) {
			System.out.println("Vivienda Nueva esta ocupada");			
		}
		
		if(vivActual != null && vivActual.estaOcupada() && vivNueva != null && !vivNueva.estaOcupada()){
			vivActual.mudarseA(vivNueva);
		} else {
			System.out.println("La mudanza no se puede realizar");
		}
		
	}
	
	private Vivienda buscarVivienda(int piso, char depto) {
		Vivienda vivienda = null;
		int i = 0;
		while(i<viviendas.size() && vivienda==null) {
			if(viviendas.get(i).getDireccion().getPiso() == piso && viviendas.get(i).getDireccion().getDepartamento() == depto) {
				vivienda = viviendas.get(i);
			} else {
				i++;
			}
		}
		return vivienda;
	}
	
	public void mostrarTodo() {
		for(Vivienda vi: viviendas) {
			vi.mostraDatos();
			System.out.println("*****************");
		}
	}

}
