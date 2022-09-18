package ar.edu.ort.tp1.exfinal.clases;

import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.ListaOrdenada;
import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.ColaNodos;
import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class MusicPlayer implements Mostrable, Reproducible {

	private static final String ITEM_NO_PUEDE_SER_NULO = "El Item no puede ser nulo.";
	private static final String ITEM_YA_EXISTENTE = "El item ingresado ya existe en el reproductor";
	private static final String NOMBRE_NO_PUEDE_SER_NULO = "El nombre no puede ser nulo";
	private static final String ITEM_NO_ENCONTRADO = "El item no fue encontrado";
	private ListaOrdenada<String, Item> listadoDeItems;
	private Cola<Item> playList;
	private Pila<Item> itemsReproducidos;
	private String nombre;

	public MusicPlayer(String nombre) {
		this.nombre = nombre;
		this.listadoDeItems = new ListaDeItems();
		this.playList = new ColaNodos<Item>();
		this.itemsReproducidos = new PilaNodos<Item>();
	}

	public void agregarItemDisponible(Item item) throws IllegalArgumentException {
		if(item == null) {
			throw new IllegalArgumentException(ITEM_NO_PUEDE_SER_NULO);
		}
		if(buscarItemPorNombre(item.getNombreDelTema()) != null) {
			throw new IllegalArgumentException(ITEM_YA_EXISTENTE);				
		}
		listadoDeItems.add(item);
	}

	public Item buscarItemPorNombre(String nombre) throws IllegalArgumentException {
		if(nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException(ITEM_NO_PUEDE_SER_NULO);
		}
		return this.listadoDeItems.search(nombre);
	}
	
	public void agregarPlaylist(Item item) throws IllegalArgumentException {
		if(item == null) {
			throw new IllegalArgumentException(ITEM_NO_PUEDE_SER_NULO);
		}
		this.playList.add(item);
	}

	@Override
	public void detener() {
		System.out.println("No implementado, se detendra la reproduccion en curso");
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo playlist");
		Item centinela = null;
		this.playList.add(centinela);
		Item itemObtenido = playList.remove(); 
		while(itemObtenido != centinela) {
			itemObtenido.reproducir();
			agregarItemAReproducidos(itemObtenido);
			this.playList.add(itemObtenido);
			itemObtenido = playList.remove(); 			
		}
	}
	
	private void agregarItemAReproducidos(Item item) {
		boolean salida = false;
		Pila<Item> pilaAux = new PilaNodos<Item>();
		while(!itemsReproducidos.isEmpty() && !salida) {
			Item itemObtenido = itemsReproducidos.pop();
			if(itemObtenido.getNombreDelTema().equals(item)) {
				salida = true;
			}
			pilaAux.push(itemObtenido);
		}
		while(!pilaAux.isEmpty()) {
			itemsReproducidos.push(pilaAux.pop());
		}
		if(!salida) {
			itemsReproducidos.push(item);
		}
	}
	

	@Override
	public void mostrar() {
		System.out.println("Reproductor: " + this.nombre);
		System.out.println("Reproducibles disponibles:");		
		for(Item item: listadoDeItems) {
			System.out.println(item.toString());
		}
		System.out.println("Ultimos escuchados:");
		Pila<Item> pilaAux = new PilaNodos<Item>();
		while(!itemsReproducidos.isEmpty()) {
			System.out.println(this.itemsReproducidos.peek().toString());
			pilaAux.push(itemsReproducidos.pop());
		}
		while(!pilaAux.isEmpty()) {
			this.itemsReproducidos.push(pilaAux.pop());
		}		
	}

}
