package clases;

import implementaciones.ColaNodos;
import interfaces.Cola;

public class GestorDeTarea {
	
	private Cola<Usuario> colaDeUsuarios;
	private Cola<Tarea> colaDeTareas;	
	
	public GestorDeTarea() {
		this.colaDeUsuarios = new ColaNodos<Usuario>();
		this.colaDeTareas = new ColaNodos<Tarea>();
	}
	
	public double[] reporteTiempoPromedioTareasPorPrioridad() {
		double[] arraySalida = new double[TipoPrioridad.values().length];
		int[][] matrizAuxCalculo = new int[2][TipoPrioridad.values().length];
		Tarea centinela = null;
		Tarea tarea;
		this.colaDeTareas.add(centinela);
		tarea = this.colaDeTareas.remove();
		while(tarea != centinela) {
			matrizAuxCalculo[0][tarea.calcularPrioridad().ordinal()] ++;
			matrizAuxCalculo[1][tarea.calcularPrioridad().ordinal()] = tarea.estimar();
			this.colaDeTareas.add(tarea);
			tarea = this.colaDeTareas.remove();
		}
		for(int i = 0; i < TipoPrioridad.values().length; i++) {
			if(matrizAuxCalculo[0][i] != 0) {
				arraySalida[i] = matrizAuxCalculo [1][i] / matrizAuxCalculo[0][i];
			}
		}
		return arraySalida;
	}
	
	
	public void asignarTareas() {
		Tarea tarea;
		Usuario usuario;
		boolean salir = false;
		while(!colaDeUsuarios.isEmpty() && !salir) {
			usuario = colaDeUsuarios.remove();
			if(!colaDeTareas.isEmpty()) {
				usuario.agregarTarea(colaDeTareas.remove());
			}else {
				salir = true;
			}
			colaDeUsuarios.add(usuario);
			usuario = colaDeUsuarios.remove();
		}
		
	}
	

}
