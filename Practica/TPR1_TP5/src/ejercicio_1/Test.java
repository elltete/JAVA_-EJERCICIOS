package ejercicio_1;

public class Test {

	public static void main(String[] args) {

		String[][] matriz = new String[3][3];
		
		for(int i=0; i<matriz.length; i++) {
			System.out.println();
			for(int j=0; j<matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
		
		System.out.println();
		
		for(String[] i: matriz){
			System.out.println();
			for(String j: i) {
				System.out.print(j + " ");
			}
		}

		System.out.println();
		System.out.println("** MESES DEL AÑO **");

		String [] mesesDelAnio = {"Enero","Febrero", "Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre" };
		
		for(String i: mesesDelAnio) {
			System.out.println(i);
		}

		System.out.println();
		System.out.println("getNombreDelMes:");
		Anio a = new Anio();
		System.out.println(a.getNombreDelMes(12));
		System.out.println();
		System.out.println("diasTranscurridos:");
		System.out.println(a.diasTranscurridos(6));		
	}

}
