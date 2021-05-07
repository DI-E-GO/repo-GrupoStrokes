/**
 * 
 */
package ar.edu.unju.fi.tp4.service;

import java.util.List;

import ar.edu.unju.fi.tp4.model.Cliente;

/**
 * @author Diego
 *
 */
public interface IClienteService {
	public Cliente getCliente();
	public void addCliente(Cliente cliente);
	public List<Cliente> getClientes();
	public void generateTableClientes();
}
