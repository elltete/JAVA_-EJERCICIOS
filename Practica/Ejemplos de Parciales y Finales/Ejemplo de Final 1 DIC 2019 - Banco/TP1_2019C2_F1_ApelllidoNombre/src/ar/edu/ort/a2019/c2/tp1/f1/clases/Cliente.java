/**
 * 
 */
package ar.edu.ort.a2019.c2.tp1.f1.clases;

/**
 *
 */
public class Cliente {

	//TODO COMPLETAR
	
	/**
	 * Construye el Cliente
	 * @param nroCliente Número del cliente, mayor a 0
	 * @param cuit No nulo ni vacío
	 * @param nombreApellido Nombre y Apellido del cliente, no nulo ni vacío
	 * @param email No nulo ni vacío
	 * @param celular No nulo ni vacío
	 * @throws RuntimeException en caso de problemas de validación
	 */
	public Cliente(int nroCliente, String cuit, String nombreApellido, String email, String celular)
			throws RuntimeException {
		//TODO COMPLETAR
	}


	/**
	 * Indica la operación que desea realizar el cliente en su visita al banco.
	 * 
	 * @param operacion la operación que desea realizar el cliente.
	 * @throws RuntimeException en caso de algun problema (operación no valida para
	 *                          el tipo de cliente.)
	 */
	public void indicarOperacionRequerida(Operacion operacion) throws RuntimeException;

	/**
	 * Indica si el número de cliente indicado como parámetro coincide con el
	 * propio.
	 * 
	 * @param nroCliente
	 * @return <code>true</code> si el número pasado coincide con el del cliente,
	 *         <code>false</code> en cualquier otro caso.
	 */
//	public boolean esMiNumero(int nroCliente) {
////TODO Descomentar y COMPLETAR
//	}

	//TODO COMPLETAR
}
