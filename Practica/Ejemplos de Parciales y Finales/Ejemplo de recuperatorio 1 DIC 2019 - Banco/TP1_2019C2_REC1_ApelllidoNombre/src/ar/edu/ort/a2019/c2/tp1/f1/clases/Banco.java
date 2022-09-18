package ar.edu.ort.a2019.c2.tp1.f1.clases;

import java.util.ArrayList;

public class Banco {

	// DESCOMENTAR y UTILIZAR DONDE CORRESPONDA.
//	private static final String NO_HABIA_CLIENTES_PARA_ATENDER = "No había clientes para atender";
//
//	private static final String CLIENTE_INGRESADO_EN_LA_FILA_ESTANDAR = "Cliente ingresado en la fila Estandar";
//
//	private static final String NO_SE_PUEDEN_RECIBIR_MAS_CLIENTES_ESTANDAR = "No se pueden recibir mas clientes Estandar";
//
//	private static final String CLIENTE_INGRESADO_EN_LA_FILA_VIP = "Cliente ingresado en la fila VIP";
//
//	private static final String NO_SE_PUEDEN_RECIBIR_MAS_CLIENTES_VIP = "No se pueden recibir mas clientes VIP";
//
//	private static final String NOMBRE_DEL_BANCO_INVALIDO = "Nombre del banco inválido";
//
//	private static final String LISTADO_DE_CLIENTES_INVALIDO = "Listado de clientes inválido";
//
//	private static final String TAMANIO_DE_LAS_FILAS_INVALIDO = "Tamaï¿½o de las filas inválido";
//

//TODO COMPLETAR	
	/**
	 * Constructor del banco.
	 * 
	 * @param nombre             Nombre del banco
	 * @param clientes           Nomina de clientes del banco
	 * @param tamanioMaximoFilas Tamaño máximo de las filas.
	 * @throws RuntimeException En caso de haber un error construyendo el banco.
	 */
	public Banco(String nombre, ArrayList<Cliente> clientes, int tamanioMaximoFilas) throws RuntimeException {
		// TODO COMPLETAR
	}

	/**
	 * Recibe a un cliente que desea ser atendido.
	 * 
	 * @param nroCliente         Número de cliente que lo identifica
	 * @param operacionRequerida {@link Operacion} que desea realizar
	 * @throws RuntimeException En caso de ocurrir un error recibiendo a un cliente.
	 */
	public void recibirCliente(int nroCliente, Operacion operacionRequerida) throws RuntimeException {
		// TODO COMPLETAR
	}

	/**
	 * Busca un cliente en la nomina de clientes en base a su nï¿½mero.
	 * 
	 * @param nroCliente Número del cliente a buscar
	 * @return el cliente buscado, o null si no lo encuentra
	 */
	// TODO COMPLETAR

	/**
	 * Atiende al proximo cliente en la fila, primero agota los clientes vip, si no
	 * hay mas vip atiende a un estandar.
	 * 
	 * @throws RuntimeException si no hay clientes para atender.
	 */
	public void atender() throws RuntimeException {
		// TODO COMPLETAR
	}

	/**
	 * Atiende un cliente de la fila especificada
	 * 
	 * @param fila la fila de la cual atender al cliente.
	 */
	// TODO COMPLETAR

	/**
	 * Muestra un resumen con el diario de operaciones.
	 */
	public void finDelDia() {
		// TODO COMPLETAR
	}

	/**
	 * Calcula el total de operaciones realizadas
	 * 
	 * @return un entero conteniendo la cantidad de operaciones realizadas.
	 */
	// TODO COMPLETAR
}
