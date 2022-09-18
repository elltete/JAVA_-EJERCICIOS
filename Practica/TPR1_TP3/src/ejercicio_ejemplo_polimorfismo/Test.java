package ejercicio_ejemplo_polimorfismo;

public class Test {

	public static void main(String[] args) {
		Padre padre = new Padre("Diego");
		Hija hija = new Hija("Emma", 1);
		
		padre.decirHola();
		//hija.decirHola();
		hija.mostrarEdad();
		
		//DOWNCASTING
		Padre padre1 = new Hija("Diego", 47);
		((Hija)padre1).mostrarEdad();
		((Hija)padre1).decirHola();		
		//((Hija)padre).mostrarEdad();  //Aparece error en ejecucion.
		
		//UPCASTING
		
		((Padre)hija).decirHola();
		
	}

}
