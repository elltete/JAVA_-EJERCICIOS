package examen.clases;

public class Estadistica implements Mostrable {
	ResultadoJuego resultado;
	String valor;
	int juegos;

	public Estadistica(ResultadoJuego resultado, String valor, int juegos) {
		this.setResultado(resultado);
		this.setValor(valor);
		this.setJuegos(juegos);
	}

	public void setResultado(ResultadoJuego resultado) {
		this.resultado = resultado;
	}

	public void setValor(String valor) {
		if (valor ==  null || valor.isEmpty()) {
			throw new IllegalArgumentException("valor incorrecto");
		}
		this.valor = valor;
	}

	public void setJuegos(int juegos) {
		if (juegos < 1) {
			throw new IllegalArgumentException("cantidad de juegos incorrecta");
		}
		this.juegos = juegos;
	}

	@Override
	public void mostrar() {
		System.out.println(this);
		
	}

	@Override
	public String toString() {
		return "Estadistica [resultado=" + resultado + ", valor=" + valor + ", juegos=" + juegos + "]";
	}

}
