package ejercicio_1;

import implementaciones.PilaNodos;
import interfaces.Pila;
import interfaces.ListaOrdenada;
import implementaciones.ListaOrdenadaNodos;

public class Test {

	public static void main(String[] args) {

		// Obtener un tubo de pelotas de tenis del Fabricante
		TuboPelotasDeTenis tuboDePelotas = FabricanteDePelotas.fabricarTubo();

		// Sacar una pelota del tubo, usarla una vez y volverla la guardar.
		PelotaDeTenis pelota = tuboDePelotas.extraer();
		pelota.usar();
		PelotaDeTenis pelota2 = tuboDePelotas.extraer();
		pelota2.usar();
		pelota2.usar();
		pelota2.usar();
		tuboDePelotas.guardar(pelota2);
		tuboDePelotas.guardar(pelota);
		
		// Desarrollar el metodo nombrado a continuacion.
		// Debe quedar tal como estaba al recibirlo.
		listarContenidoTubo(tuboDePelotas);		
	}

	private static void listarContenidoTubo(TuboPelotasDeTenis tuboDePelotas) {
		TuboOrdenadoPorUso tuboAux = new TuboOrdenadoPorUso();
		PelotaDeTenis pelota;
		while(!tuboDePelotas.estaVacio()) {
			pelota = tuboDePelotas.extraer();
			System.out.println(pelota);
			tuboAux.add(pelota);
		}
		for(int i=0; i<tuboAux.size(); i++) {
			tuboDePelotas.guardar(tuboAux.get(i));
		}
		
		while(!tuboDePelotas.estaVacio()) {
			System.out.println(tuboDePelotas.extraer());
		}
		}
}
