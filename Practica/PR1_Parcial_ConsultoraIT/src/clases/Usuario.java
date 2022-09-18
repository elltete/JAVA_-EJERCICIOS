package clases;

public class Usuario {
	
	
	private String nombre;
	private String apellido;
	private String nombreProyectoBase;
	private ListaOrdDeTareasPorPrioridad listaTareasAsignadas;
	
	public Usuario(String nombre, String apellido, String nombreProyectoBase) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreProyectoBase = nombreProyectoBase;
		this.listaTareasAsignadas = new ListaOrdDeTareasPorPrioridad();
	}

	public void agregarTarea(Tarea tarea) {
		listaTareasAsignadas.add(tarea);
	}

}
