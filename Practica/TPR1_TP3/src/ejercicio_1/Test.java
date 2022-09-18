package ejercicio_1;

public class Test {

	public static void main(String[] args) {

		Asalariado asa = new Asalariado((float) 200.00,"pepe", 20);
		Subcontratado sub = new Subcontratado("Diego", 33, 10, 30);
		
		System.out.println(asa.calcularPago());
		System.out.println(sub.calcularPago());		
	}

}
