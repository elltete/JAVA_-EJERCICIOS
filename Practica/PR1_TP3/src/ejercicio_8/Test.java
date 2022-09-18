package ejercicio_8;

public class Test {

	public static void main(String[] args) {

		EstacionDePeaje estacion1 = new EstacionDePeaje("UNO");
		
		System.out.println(estacion1);
		
		SUBE SUBE = new SUBE("SUBE");
		PASE PASE = new PASE("PASE");
		Efectivo efectivo = new Efectivo("Efectivo");
		
		Cabina cab1 = new Cabina(SUBE);
		estacion1.agregarCabina(cab1);
		Cabina cab2 = new Cabina(PASE);
		estacion1.agregarCabina(cab2);
		Cabina cab3 = new Cabina(efectivo);
		estacion1.agregarCabina(cab3);
		
		estacion1.agregarCabina(new Cabina(SUBE));
		estacion1.agregarCabina(new Cabina(PASE));
		estacion1.agregarCabina(new Cabina(efectivo));
		estacion1.agregarCabina(new Cabina(SUBE));
		estacion1.agregarCabina(new Cabina(PASE));
		estacion1.agregarCabina(new Cabina(efectivo));
		estacion1.agregarCabina(new Cabina(SUBE));
		estacion1.agregarCabina(new Cabina(PASE));
		estacion1.agregarCabina(new Cabina(efectivo));

		System.out.println(estacion1);
		
		Auto auto = new Auto("546354");
		Moto moto = new Moto("546354");
		Camion camion = new Camion("546354");
		
		System.out.println(estacion1.cabinasConEfectivo());

		System.out.println(estacion1.promedioDemora());
		
		System.out.println(cab1.cobrar(camion));
		System.out.println(cab2.cobrar(camion));
		System.out.println(cab3.cobrar(camion));
		
		System.out.println(cab1.cobrar(auto));
		System.out.println(cab2.cobrar(auto));
		System.out.println(cab3.cobrar(auto));
		
		System.out.println(cab1.cobrar(moto));
		System.out.println(cab2.cobrar(moto));
		System.out.println(cab3.cobrar(moto));
		
		

	}

}
