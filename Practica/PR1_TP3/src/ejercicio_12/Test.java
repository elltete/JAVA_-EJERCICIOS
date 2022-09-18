package ejercicio_12;

public class Test {

	public static void main(String[] args) {

		Software soft = new Software();
		
		Programa pr1 = new Programa(1, "A", "Diego", false);
		Programa pr2 = new Programa(2, "B", "Diego", true);
		Programa pr3 = new Programa(3, "C", "Diego", true);
		Programa pr4 = new Programa(4, "D", "Diego", false);

		Metodo m1 = new Metodo("Metodo1", 5, 3, 2);		Metodo m2 = new Metodo("Metodo2", 5, 3, 2);
		Metodo m3 = new Metodo("Metodo3", 5, 3, 2);		Metodo m4 = new Metodo("Metodo4", 5, 3, 2);
		Metodo m5 = new Metodo("Metodo5", 5, 3, 2);		Metodo m6 = new Metodo("Metodo6", 5, 3, 2);
		Metodo m7 = new Metodo("Metodo7", 5, 3, 2);		Metodo m8 = new Metodo("Metodo8", 5, 3, 2);
		Metodo m9 = new Metodo("Metodo9", 5, 3, 2);
		
		LenguajeProgramacion l1 = new LenguajeProgramacion("Java", "C");
		LenguajeProgramacion l2 = new LenguajeProgramacion("C", "C");
		LenguajeProgramacion l3 = new LenguajeProgramacion("C#", "C");
		LenguajeProgramacion l4 = new LenguajeProgramacion("JavaScript", "C");
		LenguajeProgramacion l5 = new LenguajeProgramacion("Pascal", "C");
		LenguajeProgramacion l6 = new LenguajeProgramacion("Python", "C");
		
		l1.agregarMetodo(m1);		l1.agregarMetodo(m2); 		l1.agregarMetodo(m3);		l2.agregarMetodo(m4);
		l3.agregarMetodo(m5);		l3.agregarMetodo(m6);		l3.agregarMetodo(m7);		l4.agregarMetodo(m8);
		l4.agregarMetodo(m9);		l4.agregarMetodo(m1);		l5.agregarMetodo(m2);		l5.agregarMetodo(m3);
		l5.agregarMetodo(m4);		l6.agregarMetodo(m5);		l6.agregarMetodo(m6);		l6.agregarMetodo(m7);
		l6.agregarMetodo(m8);		l2.agregarMetodo(m9);
		
		LenguajeDeMarcado lm1 = new LenguajeDeMarcado("HTML", "D", 45);
		LenguajeDeMarcado lm2 = new LenguajeDeMarcado("HTML5", "D", 45);
		LenguajeDeMarcado lm3 = new LenguajeDeMarcado("CSS", "D", 45);
		LenguajeDeMarcado lm4 = new LenguajeDeMarcado("HTML", "D", 45);
		LenguajeDeMarcado lm5 = new LenguajeDeMarcado("HTML", "D", 45);
		LenguajeDeMarcado lm6 = new LenguajeDeMarcado("CSS", "D", 45);
		LenguajeDeMarcado lm7 = new LenguajeDeMarcado("HTML", "D", 45);
		LenguajeDeMarcado lm8 = new LenguajeDeMarcado("XML", "D", 45);
		LenguajeDeMarcado lm9 = new LenguajeDeMarcado("XML", "D", 45);
		
		pr1.agregarFuente(l1);
		pr1.agregarFuente(l2);
		pr1.agregarFuente(l3);
		pr1.agregarFuente(l4);
		pr2.agregarFuente(l5);
		pr2.agregarFuente(l6);
		pr2.agregarFuente(lm1);
		pr2.agregarFuente(lm2);
		pr3.agregarFuente(lm3);
		pr3.agregarFuente(lm4);
		pr3.agregarFuente(lm5);
		pr3.agregarFuente(lm6);
		pr4.agregarFuente(lm7);
		pr4.agregarFuente(lm8);
		pr4.agregarFuente(lm9);
		pr4.agregarFuente(l1);
		
		soft.agregarPrograma(pr1);
		soft.agregarPrograma(pr2);
		soft.agregarPrograma(pr3);
		soft.agregarPrograma(pr4);
		

		System.out.println(soft.programasPorDebajoDe(5));

		System.out.println(pr1.listadoFuentesMayoresAlPromedio());
		System.out.println(pr2.listadoFuentesMayoresAlPromedio());
		System.out.println(pr3.listadoFuentesMayoresAlPromedio());
		System.out.println(pr4.listadoFuentesMayoresAlPromedio());
		
		pr4.mostrarDetalleDeMetodo("Metodo7");
	}

}
