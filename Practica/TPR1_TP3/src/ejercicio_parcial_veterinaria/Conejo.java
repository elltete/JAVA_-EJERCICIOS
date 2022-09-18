package ejercicio_parcial_veterinaria;

public class Conejo extends Mascota{
	
	private static double MULT_ALIMENTACION = 0.0022;
	private static int PORC_DESC_PESO = -2;
	
	public Conejo(String nombre, double peso, boolean vacuna, Estado estado) {
		super(nombre, peso, vacuna, estado);
	}

	@Override
	public void comer(double comida) {
		super.comer(comida, MULT_ALIMENTACION);
		if(super.getEstado().equals(Estado.FELIZ)) {
			System.out.println(this.getNombre() + super.getMSG_COM_FELIZ());
		} else	if(super.getEstado().equals(Estado.HAMBRIENTO)) {
			System.out.println(this.getNombre() + super.getMSG_COM_HAMBRIENTO());
		} else	if(super.getEstado().equals(Estado.ENFERMO)) {
			System.out.println(this.getNombre() + super.getMSG_COM_ENFERMO());
		}
	}

	@Override
	public void defecar() {
		this.actualizarPeso(PORC_DESC_PESO);
		System.out.println(super.getNombre() + " " + super.getEstado().getDescripcion());
	}

	@Override
	public void comer(double comida, double multiplicador) {
		// TODO Auto-generated method stub
		
	}

}
