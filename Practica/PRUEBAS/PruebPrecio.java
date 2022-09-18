package PRUEBAS;

public class PruebPrecio {
	
	public static void main(String[] args) {

		Precio p = new Precio();
		//identificadorClase identificadorReferencia = new identificadorClase();
		
		p.pone(56.8);
		System.out.println("Valor = " + p.da());
		
        Precio q = new Precio();
        q.euros=75.6;
        System.out.println("Valor = " + q.euros);

	}
}