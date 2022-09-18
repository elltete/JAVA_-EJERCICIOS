package practica3_otraSolucion;

public class Test {

	public static void main(String[] args) {

		Carrera carrera1 = new Carrera();
		
		carrera1.agregarAtleta(new Atleta("AAA-4", 4));
		carrera1.agregarAtleta(new Atleta("BBB-9", 9));
		carrera1.agregarAtleta(new Atleta("CCC-4", 4));
		carrera1.agregarAtleta(new Atleta("DDD-5", 5));
		carrera1.agregarAtleta(new Atleta("EEE-4", 4));
		carrera1.agregarAtleta(new Atleta("FFF-3", 3));
		carrera1.agregarAtleta(new Atleta("GGG-4", 4));
		carrera1.agregarAtleta(new Atleta("HHH-4", 4));
		carrera1.agregarAtleta(new Atleta("III-3", 3));
		carrera1.agregarAtleta(new Atleta("GGG-4", 4));
		carrera1.agregarAtleta(new Atleta("KKK-3", 3));
		
		System.out.println(carrera1);
		
		carrera1.ganador();
		
		
		
	}

}