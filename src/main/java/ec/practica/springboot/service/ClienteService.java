package ec.practica.springboot.service;

import java.util.List;

import ec.practica.springboot.model.Cliente;

public interface ClienteService {
	Cliente createcliente(Cliente cliente);

	Cliente updatecliente(Cliente cliente);

	List<Cliente> getAllcliente();

	Cliente getclienteById(long clienteId);

	void deletecliente(long id);
}
