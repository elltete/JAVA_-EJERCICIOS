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
	 * @param nroCliente N�mero del cliente, mayor a 0
	 * @param cuit No nulo ni vac�o
	 * @param nombreApellido Nombre y Apellido del cliente, no nulo ni vac�o
	 * @param email No nulo ni vac�o
	 * @param celular No nulo ni vac�o
	 * @throws RuntimeException en caso de problemas de validaci�n
	 */
	public Cliente(int nroCliente, String cuit, String nombreApellido, String email, String celular)
			throws RuntimeException {
		//TODO COMPLETAR
	}


	/**
	 * Indica la operaci�n que desea realizar el cliente en su visita al banco.
	 * 
	 * @param operacion la operaci�n que desea realizar el cliente.
	 * @throws RuntimeException en caso de algun problema (operaci�n no valida para
	 *                          el tipo de cliente.)
	 */
	public void indicarOperacionRequerida(Operacion operacion) throws RuntimeException;

	/**
	 * Indica si el n�mero de cliente indicado como par�metro coincide con el
	 * propio.
	 * 
	 * @param nroCliente
	 * @return <code>true</code> si el n�mero pasado coincide con el del cliente,
	 *         <code>false</code> en cualquier otro caso.
	 */
//	public boolean esMiNumero(int nroCliente) {
////TODO Descomentar y COMPLETAR
//	}

	//TODO COMPLETAR
}
