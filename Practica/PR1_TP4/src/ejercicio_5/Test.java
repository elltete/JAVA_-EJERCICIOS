package ejercicio_5;

public class Test {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();
		
		empresa.agregarCamion(0, new Camion(0,10));
		empresa.agregarCamion(1, new Camion(1,15));
		empresa.agregarCamion(2, new Camion(2,10));
		empresa.agregarCamion(3, new Camion(3,10));
		empresa.agregarCamion(4, new Camion(4,15));
		empresa.agregarCamion(5, new Camion(5,10));
		empresa.agregarCamion(6, new Camion(6,10));
		empresa.agregarCamion(7, new Camion(7,20));
		empresa.agregarCamion(8, new Camion(8,25));
		empresa.agregarCamion(9, new Camion(9,30));
		
		empresa.agregarChofer(0, new Chofer("0", "10", 1000));
		empresa.agregarChofer(1, new Chofer("1", "11", 1000));
		empresa.agregarChofer(2, new Chofer("2", "12", 1000));
		empresa.agregarChofer(3, new Chofer("3", "13", 1000));
		empresa.agregarChofer(4, new Chofer("4", "14", 1500));
		empresa.agregarChofer(5, new Chofer("5", "15", 1500));
		empresa.agregarChofer(6, new Chofer("6", "16", 1500));
		empresa.agregarChofer(7, new Chofer("7", "17", 1500));
		empresa.agregarChofer(8, new Chofer("8", "18", 2000));
		empresa.agregarChofer(9, new Chofer("9", "19", 2000));
		empresa.agregarChofer(10, new Chofer("10", "20", 2000));
		empresa.agregarChofer(11, new Chofer("11", "21", 2000));
		empresa.agregarChofer(12, new Chofer("12", "22", 2500));
		empresa.agregarChofer(13, new Chofer("13", "23", 2500));
		empresa.agregarChofer(14, new Chofer("14", "24", 2500));
		empresa.agregarChofer(15, new Chofer("15", "25", 2500));
		empresa.agregarChofer(16, new Chofer("16", "26", 3000));
		empresa.agregarChofer(17, new Chofer("17", "27", 3000));
		empresa.agregarChofer(18, new Chofer("18", "28", 4000));
		empresa.agregarChofer(19, new Chofer("19", "29", 4000));
		
		
		for(int i=0; i<10; i++) {
			String idchof = "" + i;
			System.out.println(idchof);
			empresa.agregarViaje(new Viaje(i, idchof, 100+i));
		}
		for(int i=10; i<20; i++) {
			String idchof = "" + i;
			System.out.println(idchof);
			empresa.agregarViaje(new Viaje(i-10, idchof, 200+i));
		}
		
		System.out.println(empresa.obtenerCostosDeViajes());
		
		empresa.imprimirMatriz(empresa.obtenerViajesXChoferCamion());


	}

}
