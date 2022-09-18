package clases;

import implementaciones.ColaNodos;
import interfaces.Cola;

public class Pizzeria implements Mostrable{

	private static final String ERROR = "Error fabricando una Pizza: ";
	private static final String PIZZA_NULA = "Ingreso una Pizza Nula";
	private static final String MSG_PIZZA_TOPPINGS_NULO = "No se pudo fabricar Pizza o Topping nulo.";
	private static final String MSG_TOPPINGS = "Error de parametros incorporando toppings";
	private static final String MSG_TOTALES = "La venta total fue: $%8.2f\n";
	private static final String MSG_CANTIDADES = "Se han fabricado: %d Tradicionales, %d Especiales y %d Rectangulares\n";
	private String nombre;
	private Cola<String> registroDeErrores;
	private PizzasPedidas pizzasPedidas;
	private int[][] stockToppings;
	private TipoPizza[] arrayTipoDePizza;
	private int[] cantPizasVendidas;

	public Pizzeria(String nombre) {
		this.nombre = nombre;
		this.registroDeErrores = new ColaNodos<String>();
		this.pizzasPedidas = new PizzasPedidas();
		this.stockToppings = new int [TipoPizza.values().length][Topping.values().length];
		this.arrayTipoDePizza = new TipoPizza [TipoPizza.values().length];
		this.cantPizasVendidas = new int[TipoPizza.values().length];
	}

	public void incorporarTopping(TipoPizza tipoPizza, Topping topping, int cantidad) {
		this.stockToppings[tipoPizza.ordinal()][topping.ordinal()] += cantidad;
		arrayTipoDePizza[tipoPizza.ordinal()] = tipoPizza;
	}

	private int recuperarPosicionDePizza(Pizza p) {
		int posicion = 0;
		while(!arrayTipoDePizza[posicion].getDescripcion().equals(p.getClass().getSimpleName())) {
			posicion++;
		}
		return posicion;
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

		int posicion = recuperarPosicionDePizza(p);

		if(stockToppings[posicion][topping.ordinal()] <= 0) {
			agregarErrorAlRegistro(ERROR + MSG_PIZZA_TOPPINGS_NULO);
			throw new IllegalArgumentException(ERROR + MSG_PIZZA_TOPPINGS_NULO);
		} else {
			stockToppings[posicion][topping.ordinal()]--;
			pizzasPedidas.add(p);	
		}
	}

	@Override
	public void mostrar() {
		System.out.println("------------------------------");
		System.out.println("Listado de las pizzas vendidas");
		System.out.println("------------------------------");
		for(Pizza p: pizzasPedidas) {
			p.mostrar();
		}
		System.out.println("-----------------------------");
		System.out.println("Pedidos con errores Ocurridos");
		System.out.println("-----------------------------");
		imprimirErrores();
		System.out.println("--------------");
		System.out.println("Ventas del dia");
		System.out.println("--------------");
		imprimirDetalleDeVentas();
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
	
	private void imprimirDetalleDeVentas() {
		double totalVentas = 0;
		for(Pizza p: pizzasPedidas) {
			int posicion = recuperarPosicionDePizza(p);
			cantPizasVendidas[posicion]++;
			totalVentas += p.getPrecioDeVenta();
			}
		for(int i=0; i<cantPizasVendidas.length; i++) {
			System.out.println("Se vendieron " + cantPizasVendidas[i] + " pizzas " + arrayTipoDePizza[i].getDescripcion());
		}
		System.out.printf(MSG_TOTALES, totalVentas);
	}

}
