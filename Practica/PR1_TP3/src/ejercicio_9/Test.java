package ejercicio_9;

public class Test {

	public static void main(String[] args) {
		
		Puerto puerto = new Puerto();
		puerto.agregarBarco(new Yate("YATE1", 5, 2000, "Diego", 2));
		puerto.agregarBarco(new Yate("YATE2", 10, 2000, "Diego", 4));
		puerto.agregarBarco(new Yate("YATE3", 15, 2000, "Diego", 8));
		puerto.agregarBarco(new Velero("VELERO1", 4, 2000, "Diego", 1));
		puerto.agregarBarco(new Velero("VELERO2", 7, 2000, "Diego", 2));
		puerto.agregarBarco(new Velero("VELERO3", 10, 2000, "Diego", 3));
		puerto.agregarBarco(new DeportivoLujoso("LUJOSO1", 8, 2000, "Diego", 5, 600));
		puerto.agregarBarco(new DeportivoLujoso("LUJOSO2", 12, 2000, "Diego", 5, 800));	
		puerto.agregarBarco(new DeportivoLujoso("LUJOSO3",15, 2000, "Diego", 5, 1000));	
		puerto.agregarBarco(new DeportivoStandard("STANDARD1", 4, 2000, "Diego", 3, 400));
		puerto.agregarBarco(new DeportivoStandard("STANDARD2", 6, 2000, "Diego", 3, 500));		
		puerto.agregarBarco(new DeportivoStandard("STANDARD3", 8, 2000, "Diego", 3, 600));
		

		System.out.println("puerto.barcosConAlquilerMayorA 14000");
		System.out.println(puerto.barcosConAlquilerMayorA(14000));
		System.out.println("");
		System.out.println("puerto.barcoConMayorConsumo");		
		System.out.println(puerto.barcoConMayorConsumo());		
	}
	

}
