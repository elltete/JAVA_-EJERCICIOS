package ejercicio_2;

public class Test {

	public static void main(String[] args) {

		Club club = new Club();
		
		TuboDePelotas tubo1 = new TuboDePelotas(new Pelota(9));
		TuboDePelotas tubo2 = new TuboDePelotas(new Pelota(0), new Pelota(6), new Pelota(0));
		TuboDePelotas tubo3 = new TuboDePelotas(new Pelota(0), new Pelota(0));
		TuboDePelotas tubo4 = new TuboDePelotas(new Pelota(0), new Pelota(0), new Pelota(0));
		TuboDePelotas tubo5 = new TuboDePelotas(new Pelota(0), new Pelota(0));
		TuboDePelotas tubo6 = new TuboDePelotas(new Pelota(0), new Pelota(0));
		TuboDePelotas tubo7 = new TuboDePelotas(new Pelota(0), new Pelota(0), new Pelota(1));
		
		System.out.println(club.esTuboUsado(tubo1.getTubo()));
		System.out.println(club.esTuboUsado(tubo2.getTubo()));
		System.out.println(club.esTuboUsado(tubo3.getTubo()));
		System.out.println(club.esTuboUsado(tubo4.getTubo()));
		System.out.println(club.esTuboUsado(tubo5.getTubo()));
		System.out.println(club.esTuboUsado(tubo6.getTubo()));
		System.out.println(club.esTuboUsado(tubo7.getTubo()));
		

	}

}
