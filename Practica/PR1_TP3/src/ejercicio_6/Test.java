package ejercicio_6;

public class Test {

	public static void main(String[] args) {

		GrupoDeFiguras grupo = new GrupoDeFiguras();
		
		grupo.agregarFigura(new Circunsferencia(3));
		grupo.agregarFigura(new Circunsferencia(5));
		grupo.agregarFigura(new Circunsferencia(Math.PI));
		grupo.agregarFigura(new Rectangulo(3,5));
		grupo.agregarFigura(new Rectangulo(2,10));
		grupo.agregarFigura(new Rectangulo(6,3));
		grupo.agregarFigura(new TrianguloEquilatero(3));
		grupo.agregarFigura(new TrianguloEquilatero(5));
		grupo.agregarFigura(new TrianguloEquilatero(8));
		
		//grupo.listarArray();
		
		grupo.mostrarInfoDeFiguras();

	}

}
