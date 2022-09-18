package ejercicio_3y4;

public class Lavarropa extends Producto {

		private int cargaMaxima;
		private boolean automatico; //Automatico(True) o SemiAutomatico(False)
		
		public Lavarropa() {
			super();
			this.cargaMaxima = 0;
			this.automatico = false;
		}
		
		public Lavarropa(String marca, String modelo, String numeroSerie, int voltaje, double precio, int cargaMaxima, boolean automatico) {
			super(marca, modelo, numeroSerie, voltaje, precio);
			this.cargaMaxima = cargaMaxima;
			this.automatico = automatico;
		}

		@Override
		public String listadoMenu() {
			return "Lavarropa" + " " + super.getMarca() + " " + super.getModelo();
		}
		
		private String esAuto() {
			String salida = "";
			if(automatico) {
				salida = "es automatico";
			} else {
				salida = "mo es automatico";
			}
			return salida;
		}
		
		public String listadoProdElegidos() {
			return "Lavarropa" + " " + super.getMarca() + ", modelo " + getModelo() + ", carga maxima " + this.cargaMaxima + "kg , " + esAuto() + ": $" + super.getPrecio();  
		}

		@Override
		public void imprimir() {
			System.out.println(listadoProdElegidos());			
		}
	
}
