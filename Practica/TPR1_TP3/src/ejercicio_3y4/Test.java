package ejercicio_3y4;

public class Test {

	public static void main(String[] args) {

		LaCasa casa = new LaCasa();
		casa.agregarProducto(new Televisor("SONY", "Bravia", "23uiui23", 220, 55000, 40, true));
		casa.agregarProducto(new Lavarropa("Drean", "TTTT", "re878ere", 220, 40000, 35, true));
		casa.agregarProducto(new Heladera("Whirlpool", "H125", "877www87", 220, 47000, 35, true));
		casa.agregarProducto(new Licuadora("Liliana", "TTG", "rer909er", 220, 12000, 400, 5));
		
		Cliente clie = new Cliente("4343434343", "Diego");
		
		casa.mostrarMenu(clie);
		
		clie.imprimirTicket();
		

	}

}
