package ejercicio_9;

import java.util.ArrayList;

public class Puerto {

	public final double VALORBASE=100;
	public final double VALORADICIONAL=30;

	private ArrayList<Amarra> amarras;
	private ArrayList<Barco> barcos;

	public Puerto() {
		amarras = new ArrayList<Amarra>();
		barcos = new ArrayList<Barco>();
	}
	
	public void agregarBarco(Barco barco) {
		barcos.add(barco);
	}
	
	public void listadoBarcos() {
		for(Barco b: barcos) {
			System.out.println(b);
		}
	}

	private double calcularCostoAlquiler(Barco barco) {
		return (VALORBASE * barco.getEslora()) + (VALORADICIONAL * barco.valorAdicional());
	}

	public ArrayList<Barco> barcosConAlquilerMayorA(double importe){
		ArrayList<Barco> listadoBarcos = new ArrayList<Barco>();
		for(Barco b: barcos) {
			if(calcularCostoAlquiler(b) > importe) {
				listadoBarcos.add(b);
			}
		}
		return listadoBarcos;
	}

	public Barco barcoConMayorConsumo() {
		double mayorImporte = 0;
		Barco barcoMayorconsumo = null;
		double consumo = 0;
		for(Barco b: barcos) {
			if(b instanceof EmbarcacionDeportiva) {
				consumo = ((EmbarcacionDeportiva) b).calcularConsumo();
				if(consumo > mayorImporte) {
					mayorImporte = consumo;
					barcoMayorconsumo = b;
				}
			}
		}
		return barcoMayorconsumo;
	}


}
