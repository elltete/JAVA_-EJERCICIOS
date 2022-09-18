package ar.edu.ort.tp1.pacial2.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Cola;

public class Pizzeria implements Mostrable{

	private static final String ERROR = "Error fabricando una Pizza: ";
	private static final String PIZZA_NULA = "Ingresi una Pizza Nula";
	private static final String MSG_PIZZA_TOPPINGS_NULO = "No se pudo fabricar Pizza o Topping nulo.";
	private static final String MSG_TOPPINGS = "Error de par�metros incorporando toppings";
	private static final String MSG_TOTALES = "La venta total fue: $%8.2f\n";
	private static final String MSG_CANTIDADES = "Se han fabricado: %d Tradicionales, %d Especiales y %d Rectangulares\n";
	private String nombre;
	private Cola<String> registroDeErrores;
	private PizzasPedidas pizzasPedidas;
	private int[][] stockToppings;

	public Pizzeria(String nombre) {
		this.nombre = nombre;
		this.registroDeErrores = new ColaNodos<String>();
		this.pizzasPedidas = new PizzasPedidas();
		this.stockToppings = new int [TipoPizza.values().length][Topping.values().length];
	}

	public void incorporarTopping(TipoPizza tipoPizza, Topping topping, int cantidad) {
		this.stockToppings[tipoPizza.ordinal()][topping.ordinal()] += cantidad; 
	}

	public void ingresarPedido(Pizza p, Topping topping) {
		if(p == null) {
			agregarErrorAlRegistro(ERROR + PIZZA_NULA);
			throw new IllegalArgumentException(ERROR + PIZZA_NULA);
		}
		if(topping == null) {
			agregarErrorAlRegistro(ERROR + MSG_TOPPINGS);
			throw new IllegalArgumentException(ERROR + MSG_TOPPINGS);
		}

		if(p instanceof Tradicional) {
			if(stockToppings[0][topping.ordinal()] <= 0) {	//En la posicion 0 de la Matriz se tiene una Pizza Tradicional
				agregarErrorAlRegistro(ERROR + MSG_TOPPINGS);
				throw new IllegalArgumentException(ERROR + MSG_PIZZA_TOPPINGS_NULO);
			}
		} else if (p instanceof Especial) {
			if(stockToppings[1][topping.ordinal()] <= 0) {	//En la posicion 1 de la Matriz se tiene una Pizza Especial
				agregarErrorAlRegistro(ERROR + MSG_TOPPINGS);
				throw new IllegalArgumentException(ERROR + MSG_PIZZA_TOPPINGS_NULO);
			}
		} else {
			if(stockToppings[2][topping.ordinal()] <= 0) {	//En la posicion 2 de la Matriz se tiene una Pizza Rectangular
				agregarErrorAlRegistro(ERROR + MSG_TOPPINGS);
				throw new IllegalArgumentException(ERROR + MSG_PIZZA_TOPPINGS_NULO);
			}
		}
		pizzasPedidas.add(p);	
	}

	@Override
	public void mostrar() {
		for(Pizza p: pizzasPedidas) {
			p.mostrar();
		}
		System.out.println("Errores Ocurridos");
		imprimirErrores();
	}

	public int vendidasConPrecioEntre(double importeDesde, double importeHasta) {
		int cantidad = 0;
		for(Pizza p: pizzasPedidas) {
			if(p.getPrecioDeVenta() > importeDesde && p.getPrecioDeVenta() <importeHasta) {
				cantidad++;
			}
		}
		return cantidad;
	}

	private void agregarErrorAlRegistro(String error) {
		this.registroDeErrores.add(error);
	}

	private void imprimirErrores() {
		registroDeErrores.add(null);
		String aux;
		aux = registroDeErrores.remove();
		while(aux != null) {
			System.out.println(aux);
			registroDeErrores.add(aux);
			aux = registroDeErrores.remove();
		}

	}

}
