package par1.cerveceria.entidades;

import java.util.ArrayList;

public class Cervecera {

	private static final double PRECIO_BOTELLITA = 80.0;
	private static final double PRECIO_LITRO = 160.0;
	private static final double RECARGO_MEDIANA = 1.1;
	private static final double RECARGO_CHICA = 1.2;

	private ArrayList<Contenedor> deposito;

	// DESCOMENTAR Y COMPLETAR
	private Refrigerador<Contenedor> refrigeradorEnvasados;
	private Refrigerador<Contenedor> refrigeradorSueltos;

	// FALTAN ATRIBUTOS, COMPLETAR
	private int[] vendidoPorSabor = new int[Sabor.values().length];

	public Cervecera() {
		// completar
		refrigeradorEnvasados = new Refrigerador<Contenedor>();
		refrigeradorSueltos = new Refrigerador<Contenedor>();
		deposito = new ArrayList<Contenedor>();
		for (int i = 0; i < vendidoPorSabor.length; i++) {
			vendidoPorSabor[i] = 0;
		}
	}

	/**
	 * Guarda el barril en el refrigerador que corresponda.
	 * 
	 * @param sabor
	 */
	public void agregarBarril(Sabor sabor) {
		// completar
		refrigeradorSueltos.add(new Barril(sabor));
	}

	/**
	 * Guarda el cajon en el refrigerador que corresponda
	 * 
	 * @param sabor
	 */
	public void agregarCajon(Sabor sabor) {
		// completar
		refrigeradorEnvasados.add(new Cajon(sabor));
	}

	/**
	 * Se usa para vender botellitas. No olvides chequear el stock al terminar la
	 * venta.
	 * 
	 * @param sabor
	 * @return
	 */
	public EnvaseCerveza vender(Sabor sabor) {
		EnvaseCerveza botellita = null;
		// completar

		Contenedor contenedor = this.refrigeradorEnvasados.buscar(sabor);
		if (contenedor != null) {
			botellita = contenedor.extraer();
			botellita.setPrecioVenta(Cervecera.PRECIO_BOTELLITA);
			if (contenedor.estaVacio()) {
				this.refrigeradorEnvasados.remove(contenedor);
				this.deposito.add(contenedor);
			}
			this.marcarSaborVendido(sabor);
		}

		return botellita;
	}

	/**
	 * @param sabor
	 */
	private void marcarSaborVendido(Sabor sabor) {
		this.vendidoPorSabor[sabor.ordinal()]++;

	}

	/**
	 * Se usa para vender cerveza suelta en garrafas. No olvides chequear el stock
	 * al terminar la venta.
	 * 
	 * @param capacidad
	 * @param sabor
	 * @return
	 */
	public EnvaseCerveza vender(Medida capacidad, Sabor sabor) {
		EnvaseCerveza envase = null;
		// completar

		Contenedor contenedor = this.refrigeradorSueltos.buscar(sabor);
		if (contenedor != null) {
			envase = ((Barril) contenedor).extraer(capacidad);
			envase.setPrecioVenta(this.calcularPrecioPorTamanio(capacidad));
			if (contenedor.estaVacio()) {
				this.refrigeradorEnvasados.remove(contenedor);
				this.deposito.add(contenedor);
			}
			this.marcarSaborVendido(sabor);
		}

		return envase;
	}

	/**
	 * @param capacidad
	 * @return
	 */
	private double calcularPrecioPorTamanio(Medida capacidad) {

		double precio = 0;

		switch (capacidad) {
		case GRANDE:
			precio = PRECIO_LITRO * capacidad.getCantidadContenida() / 1000;
			break;
		case MEDIANA:
			precio = PRECIO_LITRO * RECARGO_MEDIANA * capacidad.getCantidadContenida() / 1000;
			break;
		case CHICA:
			precio = PRECIO_LITRO * RECARGO_CHICA * capacidad.getCantidadContenida() / 1000;
			break;
		}
		return precio;
	}

	/**
	 * Lista los sabores disponibles de cerveza suelta o preenvasada
	 */
	public void listarDisponibles() {
		// completar
		System.out.println("Sabores disponibles de cerveza envasada:");
		for (Contenedor contenedor : this.refrigeradorEnvasados.getLista()) {
			System.out.println(contenedor.getSabor());
		}

		System.out.println("Sabores disponibles de cerveza suelta:");
		for (Contenedor contenedor : this.refrigeradorSueltos.getLista()) {
			System.out.println(contenedor.getSabor());
		}
	}

	public double getPrecioLitro() {
		return PRECIO_LITRO;
	}

	public double getPrecioUnidad() {
		return PRECIO_BOTELLITA;
	}

	/**
	 * Lista la reposicion a partir de lo que haya vacio en deposito.
	 */
	private void listarReposicion() {
		System.out.println("-- Reposiciones --");
		if (deposito.isEmpty()) {
			System.out.println("No hay nada que reponer.");
		} else {
			// completar
			System.out.println("Se deben reponer los siguientes:");
			for (Contenedor contenedor : deposito) {
				System.out.println(contenedor.getSabor().toString() + "PResentación: "
						+ (contenedor instanceof Barril ? "Barril" : "Cajon"));
			}
		}
	}

	/**
	 * Lista la cantidad de unidades vendidas de cada sabor.
	 */
	private void listarUnidadesVendidasPorSabor() {
		System.out.println("-- Unidades vendidas por sabor --");
		// completar
		for (int i = 0; i < vendidoPorSabor.length; i++) {
			System.out.println(Sabor.values()[i].toString() + " = " + vendidoPorSabor[i]);
		}
	}

	public void cerrarDia() {
		System.out.println("** Cierre del dia **");
		listarReposicion();
		listarUnidadesVendidasPorSabor();
	}

}