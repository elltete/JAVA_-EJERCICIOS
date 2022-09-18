package practica2;

public class Test {

	public static void main(String[] args) {

		Carrera carrera1 = new Carrera();
		
		carrera1.agregarAtleta(new Atleta("AAA", 4));
		carrera1.agregarAtleta(new Atleta("BBB", 9));
		carrera1.agregarAtleta(new Atleta("CCC", 4));
		carrera1.agregarAtleta(new Atleta("DDD", 6));
		carrera1.agregarAtleta(new Atleta("EEE", 4));
		carrera1.agregarAtleta(new Atleta("FFF", 3));
		carrera1.agregarAtleta(new Atleta("GGG", 4));
		carrera1.agregarAtleta(new Atleta("HHH", 4));
		carrera1.agregarAtleta(new Atleta("III", 3));
		carrera1.agregarAtleta(new Atleta("GGG", 4));
		carrera1.agregarAtleta(new Atleta("KKK", 3));
		
		System.out.println(carrera1);
		
		carrera1.ganador();

	}

}
