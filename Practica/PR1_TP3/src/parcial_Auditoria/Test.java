package parcial_Auditoria;

public class Test {

	public static void main(String[] args) {

		Area area = new Area("RRHH", 10, new Responsable("Pepe", "Pepe", 23232));
		
		ObservacionInterna oi1 = new ObservacionInterna("1", "1", 40, new Auditor(" ", " ", 32323), true);
		ObservacionInterna oi2 = new ObservacionInterna("2", "2", 60, new Auditor(" ", " ", 32323), false);
		ObservacionInterna oi3 = new ObservacionInterna("3", "3", 80, new Auditor(" ", " ", 32323), true);
		ObservacionInterna oi4 = new ObservacionInterna("4", "4", 100, new Auditor(" ", " ", 32323), false);
		ObservacionInterna oi5 = new ObservacionInterna("5", "5", 120, new Auditor(" ", " ", 32323), false);
		ObservacionExterna oe1 = new ObservacionExterna("6", "6", 40, new Auditor(" ", " ", 32323), " ");
		ObservacionExterna oe2 = new ObservacionExterna("7", "7", 60, new Auditor(" ", " ", 32323), " ");
		ObservacionExterna oe3 = new ObservacionExterna("8", "8", 80, new Auditor(" ", " ", 32323), " ");
		ObservacionExterna oe4 = new ObservacionExterna("9", "9", 100, new Auditor(" ", " ", 32323), " ");
		ObservacionExterna oe5 = new ObservacionExterna("10", "10", 120, new Auditor(" ", " ", 32323), " ");
		
		area.agregarObservacion(oi1);
		area.agregarObservacion(oi2);
		area.agregarObservacion(oi3);
		area.agregarObservacion(oi4);
		area.agregarObservacion(oi5);
		area.agregarObservacion(oe1);
		area.agregarObservacion(oe2);
		area.agregarObservacion(oe3);
		area.agregarObservacion(oe4);
		area.agregarObservacion(oe5);
		
		Compromiso c1 = new Compromiso(" ", 30);
		Compromiso c2 = new Compromiso(" ", 60);
		Compromiso c3 = new Compromiso(" ", 90);
		Compromiso c4 = new Compromiso(" ", 120);

		oi1.agregarCompromiso(c1);
		oi1.agregarCompromiso(c2);
		oi2.agregarCompromiso(c3);
		oi2.agregarCompromiso(c4);
		oi3.agregarCompromiso(c1);
		oi3.agregarCompromiso(c2);
		oi4.agregarCompromiso(c3);
		oi4.agregarCompromiso(c4);
		oi1.agregarCompromiso(c1);
		oi2.agregarCompromiso(c2);
		oi3.agregarCompromiso(c2);
		oi4.agregarCompromiso(c3);
		
		oe1.agregarCompromiso(c1);
		oe1.agregarCompromiso(c2);
		oe2.agregarCompromiso(c3);
		oe2.agregarCompromiso(c4);
		oe3.agregarCompromiso(c1);
		oe3.agregarCompromiso(c2);
		oe4.agregarCompromiso(c3);
		oe4.agregarCompromiso(c4);
		oe1.agregarCompromiso(c1);
		oe2.agregarCompromiso(c2);
		oe3.agregarCompromiso(c2);
		oe4.agregarCompromiso(c3);		
		
		System.out.println(area.obtenerCantObservacionesInternas());
		
		System.out.println(area.obtenerObservacionesVencidas());
		
	}

}
