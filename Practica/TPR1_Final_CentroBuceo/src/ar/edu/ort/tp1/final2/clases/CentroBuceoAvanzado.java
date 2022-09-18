package ar.edu.ort.tp1.final2.clases;

import java.util.ArrayList;

import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.ListaOrdenada;
import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.ColaNodos;
import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class CentroBuceoAvanzado {

	private static final String BUCEO_INVALIDO = "Buceo Invalido";
	private static final String BUZO_NULL = "Registrar Buceo: buzo null";
	private static final String ID_NO_EXISTE = "Registrar Buceo: IdBuceo inexistente";
	private static final String BUZO_INHABILITADO = "Registrar Buceo: buzo no habilitado";	
	private static final int CANTIDAD_BUCEOS = 10;

	private String nombre;
	private Pila<String> erroresDeReserva;
	private ListaOrdenada<Integer, Buceo> buceosDisponibles;
	private Cola<Buzo> buzosRegistrados;
	private int[][] cantidadBuceosPorMes;

	public CentroBuceoAvanzado(String nombre) {
		this.nombre = nombre;
		this.erroresDeReserva = new PilaNodos<String>();
		buceosDisponibles = new ListaBuceosPorId();
		buzosRegistrados = new ColaNodos<Buzo>();
		cantidadBuceosPorMes = new int [CANTIDAD_BUCEOS] [Mes.values().length];
	}

	public void registrarBuceo(Buzo buzo, Integer idBuceo) {
		if(buzo == null) {
			agregarErrores(BUZO_NULL);
		} else {
			Buceo buceo = buscarBuceoPorID(idBuceo);
			if(buceo == null) {
				agregarErrores(ID_NO_EXISTE);
			} else if(!buzo.habilitado(buceo.getProfundidad())){
				agregarErrores(BUZO_INHABILITADO);
			} else {
				buzo.agregarABitacora(buceo);
				buzosRegistrados.add(buzo);
			}
		}
	}

	public void agregarBuceo(Buceo buceo, Mes mes) {
		buceosDisponibles.add(buceo);
		cantidadBuceosPorMes[buceo.getId()-1][mes.ordinal()]++;
	}

	private Buceo buscarBuceoPorID(Integer idBuceo) {
		return buceosDisponibles.search(idBuceo);
	}

	public void listarErroresCronologico() {
		System.out.println("Mostrando errores en forma cronologica");
		Pila<String> pilaAux = new PilaNodos<String>();
		while(!erroresDeReserva.isEmpty()) {
			pilaAux.push(erroresDeReserva.pop());
		}
		while(!pilaAux.isEmpty()) {
			System.out.println(pilaAux.peek());
			erroresDeReserva.push(pilaAux.pop());
		}		
	}

	public void mostrarCantidadDeBuceosPorBuzoRegistrado() {
		System.out.println("------------------");
		System.out.println("Cantidad de buceos realizados por los buzos registrados en " + this.nombre);
		Buzo centinela = null;
		buzosRegistrados.add(centinela);
		Buzo buzoAux = buzosRegistrados.remove();
		while(buzoAux != centinela) {
			System.out.println("El " + buzoAux.toString() + ", realizo la cantidad de " + buzoAux.cantidadDeEventos() + " buceos.");
			buzosRegistrados.add(buzoAux);
			buzoAux = buzosRegistrados.remove();			
		}
	}

	public void mostrarCantidadDeReservasPorMes() {
		System.out.println("------------------");
		System.out.println("Cantidad de buceos por Mes");
		
		for(int idPorMes = 0; idPorMes < Mes.values().length ; idPorMes++) {
			int cantPorMes = 0;
			for(int idPorBuceo = 0; idPorBuceo < cantidadBuceosPorMes.length; idPorBuceo++) {
				cantPorMes += cantidadBuceosPorMes[idPorBuceo][idPorMes];
			}
			System.out.println("En el mes de " + "" + " tiene una cantidad de reservas de: " + cantPorMes);
		}
	}

	public void agregarErrores(String valor) {
		erroresDeReserva.push(valor);
	}
}
