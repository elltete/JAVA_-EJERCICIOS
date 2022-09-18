package Ejercicio_08;

import java.util.ArrayList;

public class Recetario {
	private ArrayList<Receta> recetas;
	
	public Recetario() {
		this.recetas = new ArrayList<>();
	}
	
	public void agregarReceta (int codigo, String nombre) {
		this.recetas.add(new Receta(codigo, nombre));
	}
	
	private Receta buscarReceta ( int codigo ) {
		Receta receta = null;
		int index = 0;
		
		while ( receta == null && index < this.recetas.size()) {
			if ( this.recetas.get(index).getCodigo() == codigo ) {
				receta = this.recetas.get(index);
			}
			else {
				index++;
			}
		}
		return receta;
	}
	
	private Receta buscarReceta ( String nombre ) {
		Receta receta = null;
		int index = 0;
		
		while ( receta == null && index < this.recetas.size()) {
			if ( this.recetas.get(index).getNombre().equals(nombre)) {
				receta = this.recetas.get(index);
			}
			else {
				index++;
			}
		}
		return receta;
	}
	
	public void agregarIngredienteAReceta ( int codigo, int cantidad, boolean esRefrigerado, String producto) {
		Receta receta = this.buscarReceta(codigo);
		
		if ( receta != null ) {
			receta.agregarIngrediente(producto, cantidad, esRefrigerado);
		}
	}
	
	public void mostrar() {
		for (Receta receta: this.recetas) {
			System.out.println(receta);
			receta.mostrar();
		}
	}
	
	public ArrayList<Ingrediente> prepararListadoAComprar(String nombreRecetaACocinar, 
			Heladera heladera, Alacena alacena, int cantidad) {
		ArrayList<Ingrediente> ingredientes = new ArrayList<>();
		Ingrediente ingredienteFaltante;
		Receta receta = this.buscarReceta(nombreRecetaACocinar);
		
		if ( receta != null ) {

			for (Ingrediente ingrediente: receta.getIngredientes()) {
			
				if (ingrediente.isEsRefrigerado()) {
					ingredienteFaltante = heladera.verificarStockProducto (ingrediente.getProducto(), 
							ingrediente.getCantidad()*cantidad);
				}
				else {
					ingredienteFaltante = alacena.verificarStockProducto (ingrediente.getProducto(), 
							ingrediente.getCantidad()*cantidad);
				}
				if ( ingredienteFaltante.getCantidad() > 0) {
					ingredientes.add(ingredienteFaltante);
				}
				
			}
		}
		
		return ingredientes;
	}
	
	public ArrayList<Receta> recetasPosiblesAPreparar (Heladera heladera, Alacena alacena, int cantidad) {
		ArrayList<Receta> recetasPosibles = new ArrayList<>();
		
		for (Receta receta: this.recetas) {
			if (this.prepararListadoAComprar(receta.getNombre(), heladera, alacena, cantidad).size() == 0) {
				recetasPosibles.add(receta);
			}
		}
		
		return recetasPosibles;
	}
}
