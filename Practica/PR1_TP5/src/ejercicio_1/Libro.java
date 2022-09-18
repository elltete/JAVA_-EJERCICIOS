package ejercicio_1;

public class Libro {
	
	private String ISBN;
	private int paginas;
	
	public Libro(String iSBN, int paginas) {
		ISBN = iSBN;
		this.paginas = paginas;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getPaginas() {
		return paginas;
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", paginas=" + paginas + "]";
	}
	
	

}
