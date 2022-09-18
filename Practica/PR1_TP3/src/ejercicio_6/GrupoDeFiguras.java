package ejercicio_6;

import java.util.ArrayList;

public class GrupoDeFiguras {
	
	private ArrayList<Figura> listaDeFiguras;
	
	public GrupoDeFiguras() {
		this.listaDeFiguras = new ArrayList<Figura>();
	}
	
	public void agregarFigura (Figura figura) {
		listaDeFiguras.add(figura);
	}
	
	public void mostrarInfoDeFiguras(){
		for(Figura fig: listaDeFiguras) {
			System.out.println("El color es " + fig.getColor());
			System.out.println("El area es " + fig.area());
			System.out.println("El perimetro es " + fig.perimetro());
			System.out.println("");
		}
	}
	
	public void listarArray() {
		for(Figura fig: listaDeFiguras) {
			System.out.println(fig);
		}
	}

}
