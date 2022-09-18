package ejercicio_3;

import java.util.ArrayList;

public class GastosAnuales {
	
	private ArrayList<Rubro> rubros;
	
	public GastosAnuales(){
		rubros = new ArrayList<Rubro>();
	}
	
	public void agregarGasto(Mes mes, String nombreRubro, double importe) {
		if(importe > 0) {
			obtenerRubro(nombreRubro).agregarGasto(mes, importe);
		}
	}
	
	private Rubro obtenerRubro(String nombreRubro) {
		Rubro rubro = buscarRubro(nombreRubro);
		if(rubro == null) {
			rubro = new Rubro(nombreRubro);
		}
		return rubro;
	}
	
	private Rubro buscarRubro(String nombreRubro) {
		boolean encontrado = false;
		Rubro rubroEncontrado = null;
		int i = 0;
		while(i<rubros.size() && !encontrado) {
			if(rubros.get(i).getNombre().equals(nombreRubro)) {
				rubroEncontrado = rubros.get(i);
				encontrado = true;
			}else {
				i++;
			}
		}
		return rubroEncontrado;
	}	
	
	private int buscarRubro2(String nombreRubro) {
		boolean encontrado = false;
		int i = 0;
		while(i<rubros.size() && !encontrado) {
			if(rubros.get(i).getNombre().equals(nombreRubro)) {
				encontrado = true;
			}else {
				i++;
			}
		}
		return i;
	}	
	
	private double[][] consolidadoDeGastos(){
		double[][] gastosConsolidados = new double [12][rubros.size()];
		for(int i=0; i<rubros.size(); i++) {
			for(int j=0; j<12; j++) {
				gastosConsolidados[i][j] = rubros.get(i).getTotalGastos(Mes.values()[i]);
			}
		}
		return gastosConsolidados;
	}
	
	public double gastoAcumulado(Mes mes) {
		double[][] gastosConsolidados = consolidadoDeGastos();
		int i = mes.ordinal();
		double total = 0;
		for(int j=0; j<rubros.size(); j++) {
			total += gastosConsolidados[i][j];
		}
		return total;
	}
	
	public double gastoAcumulado(String nombreRubro) {
		double gasto = -1;
		int posicion = buscarRubro2(nombreRubro);
		if(posicion < rubros.size()) {
			double[][] gastosConsolidados = consolidadoDeGastos();
			for(int i=0; i<12; i++) {
				gasto += gastosConsolidados[i][posicion];
			}
		}
		return gasto;
	}
	
	public void informarConsumosPorMes() {
		double[][] gastosConsolidados = consolidadoDeGastos();
		for(int i=0; i<12; i++) {
			System.out.println("Mes: " + Mes.values()[i].name());
			for(int j=0; j<rubros.size(); j++) {
				System.out.println("Rubro: " + rubros.get(j).getNombre() + ", gasto acumulado: " + gastosConsolidados[i][j]);
			}
		}
	}
	
	public void informarPromedioMensualPorRubro() {
		double[][] gastosConsolidados = consolidadoDeGastos();
		for(int i=0; i<12; i++) {
			System.out.println("Mes: " + Mes.values()[i].name());
			double total=0;
			for(int j=0; j<rubros.size(); j++) {
				total += gastosConsolidados[i][j];
			}
			for(int j=0; j<rubros.size(); j++) {
				System.out.println("Rubro: " + rubros.get(j).getNombre() + ", promedio mensual: " + gastosConsolidados[i][j]/total);
			}
		}		
	}
	
	public void informarMesMayorConsumo() {
		ArrayList<Integer> mesesMayorConsumo = new ArrayList<>();
		double[][] gastosConsolidados = consolidadoDeGastos();
		double maximoTotal = 0;
		double total;
		for(int i=0; i<12; i++) {
			total = 0;
			for(int j=0; j<rubros.size(); j++) {
				total += gastosConsolidados[i][j];
			}
			if(total > maximoTotal) {
				maximoTotal = total;
				mesesMayorConsumo = new ArrayList<>();
				mesesMayorConsumo.add(i);
			}else if(total == maximoTotal) {
				mesesMayorConsumo.add(i);
			} 
		}
		for(int i: mesesMayorConsumo) {
			System.out.println("Mes: " + Mes.values()[i].name() + ", gasto Acumulado: " + gastoAcumulado(Mes.values()[i]));
		}
	}

}
