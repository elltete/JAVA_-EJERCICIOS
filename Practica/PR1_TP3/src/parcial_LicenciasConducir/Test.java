package parcial_LicenciasConducir;

public class Test {

	public static void main(String[] args) {
	
	Sede sede = new Sede();
	Persona persona = new Persona("32323232","Diego","Ponzo");
	
	Circuito c1 = new Circuito(50, 0);
	Circuito c2 = new Circuito(50, 0);
	Circuito c3 = new Circuito(50, 1);
	Circuito c4 = new Circuito(50, 1);
	Circuito c5 = new Circuito(50, 2);
	Circuito c6 = new Circuito(50, 2);
	Circuito c7 = new Circuito(50, 3);
	Circuito c8 = new Circuito(50, 3);
	Circuito c9 = new Circuito(50, 4);
	Circuito c10 = new Circuito(50, 4);
	Circuito c11 = new Circuito(50, 0);
	Circuito c12 = new Circuito(50, 0);
	Circuito c13 = new Circuito(50, 0);
	Circuito c14 = new Circuito(50, 0);
	
	sede.agregarExamen(new ExamenAuto("hoy", persona, c1, new Auto("WEW2323WE", "Fiat", 1300, 5)));
	sede.agregarExamen(new ExamenAuto("hoy", persona, c3, new Auto("WEW2323WE", "Fiat", 1300, 5)));
	sede.agregarExamen(new ExamenAuto("hoy", persona, c5, new Auto("WEW2323WE", "Fiat", 1300, 5)));
	sede.agregarExamen(new ExamenAuto("hoy", persona, c7, new Auto("WEW2323WE", "Fiat", 1300, 5)));
	
	ExamenMoto m1 = new ExamenMoto("hoy", persona, new Moto("WEW2323WE", "Zanella", 150, true));
	ExamenMoto m2 = new ExamenMoto("hoy", persona, new Moto("WEW2323WE", "Zanella", 150, true));
	ExamenMoto m3 = new ExamenMoto("hoy", persona, new Moto("WEW2323WE", "Zanella", 150, true));
	ExamenMoto m4 = new ExamenMoto("hoy", persona, new Moto("WEW2323WE", "Zanella", 150, true));
	ExamenMoto m5 = new ExamenMoto("hoy", persona, new Moto("WEW2323WE", "Zanella", 150, true));
	ExamenMoto m6 = new ExamenMoto("hoy", persona, new Moto("WEW2323WE", "Zanella", 150, true));
	
	m1.agregarCircuitos(c1, c3);
	m2.agregarCircuitos(c1, c3, c5, c7);
	m3.agregarCircuitos(c7, c10, c13);
	m4.agregarCircuitos(c1, c11, c12);
	m5.agregarCircuitos(c1, c13, c14);
	m6.agregarCircuitos(c1);
	
	sede.agregarExamen(m1);
	sede.agregarExamen(m2);
	sede.agregarExamen(m3);
	sede.agregarExamen(m4);
	sede.agregarExamen(m5);
	sede.agregarExamen(m6);
	
	System.out.println(sede.obtenerInforme());
	
	}
}
