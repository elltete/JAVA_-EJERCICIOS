package ejercicio_5;

import java.util.ArrayList;

public class Empresa {
	
	private final int CANT_CHOFERES = 20;
	private final int CANT_CAMIONES = 10;
	
	private Chofer choferes[];
	private Camion camiones[];
	private ArrayList<Viaje> viajes;
	
	public Empresa() {
		this.choferes = new Chofer[CANT_CHOFERES];
		this.camiones = new Camion[CANT_CAMIONES];
		this.viajes = new ArrayList<Viaje>();
	}

	public ArrayList<Double> obtenerCostosDeViajes(){
		ArrayList<Double> costoViajes = new ArrayList<>();
		double honorario, consumo;
		for(Viaje v: viajes) {
			honorario = calcularHonorario(v.getIdChofer());
			consumo = calcularConsumo(v.getIdCamion(), v.getKmsViaje());
			costoViajes.add(honorario + consumo);
		}
		return costoViajes;
	}
	
	public int[][] obtenerViajesXChoferCamion() {
		int[][] viajesXChoferCamion = new int[CANT_CHOFERES][CANT_CAMIONES];
		int posCamion, posChofer;
		for(Viaje v: viajes) {
			posChofer = buscarPosicionChofer(v.getIdChofer());
			posCamion = buscarPosicionCamion(v.getIdCamion());
			viajesXChoferCamion[posChofer][posCamion]++;
		}
		return viajesXChoferCamion;
	}
	
	private double calcularHonorario(String idChofer) {
		return choferes[buscarPosicionChofer(idChofer)].getPagoPorViaje();
	}
	
	private double calcularConsumo(int idCamion, double kmsViaje) {
		return camiones[buscarPosicionCamion(idCamion)].getCostoPorKmRecorrido() * kmsViaje;
	}
	
	private int buscarPosicionChofer(String idChofer) {
		int i = 0;
		boolean encontrado = false;
		while(i < choferes.length-1 && !encontrado) {
			if(choferes[i].getIdChofer().equals(idChofer)) {
				encontrado = true;
			}else {
				i++;
			}
		}
		return i;
	}
	
	private int buscarPosicionCamion(int idCamion) {
		int i = 0;
		boolean encontrado = false;
		while(i < camiones.length-1 && !encontrado) {
			if(camiones[i].getIdCamion() == (idCamion)) {
				encontrado = true;
			}else {
				i++;
			}
		}
		return i;
	}
	
	public void agregarViaje(Viaje viaje) {
		viajes.add(viaje);
	}

	public void agregarCamion(int posicion, Camion camion) {
		camiones[posicion] = camion;
	}

	public void agregarChofer(int posicion, Chofer chofer) {
		choferes[posicion] = chofer;
	}
	
	public void imprimirMatriz(int[][] matriz) {
		for(int i=0; i<matriz.length-1; i++ ) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(" [" + matriz[i][j] + "] ");
			}
			System.out.println();
		}
	}
}
