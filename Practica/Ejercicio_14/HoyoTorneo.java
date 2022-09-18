package Ejercicio_14;

import java.util.ArrayList;

public class HoyoTorneo {
	private int numero;
	private int golpesPar;
	private ArrayList<Integer> golfistas;
	
	public HoyoTorneo (int numero, int golpesPar) {
		setNumero(numero);
		setGolpesPar(golpesPar);
		golfistas = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "HoyoTorneo [numero=" + numero + ", golpesPar=" + golpesPar + ", golfistas=" + golfistas + "]";
	}

	public int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		if (numero <1 ) {
			numero = 1;
		}
		else if (numero > 18) {
			numero = 18;
		}
		this.numero = numero;
	}

	public int getGolpesPar() {
		return golpesPar;
	}

	private void setGolpesPar(int golpesPar) {
		this.golpesPar = golpesPar;
	}
	
	public void jugar(int numeroJugador) {
		golfistas.add(numeroJugador);
	}
	
	public int getCantidadGolfistas() {
		return golfistas.size();
	}
}
