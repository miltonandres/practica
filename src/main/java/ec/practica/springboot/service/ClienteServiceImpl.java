package ec.practica.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.practica.springboot.exception.ResourceNotFoundException;
import ec.practica.springboot.model.Cliente;
import ec.practica.springboot.repository.ClienteRepository;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente createcliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente updatecliente(Cliente cliente) {
		Optional<Cliente> clienteDb = this.clienteRepository.findById(cliente.getId());

		if (clienteDb.isPresent()) {
			Cliente clienteUpdate = clienteDb.get();
			clienteUpdate.setId(cliente.getId());
			clienteUpdate.setClave(cliente.getClave());
			clienteUpdate.setEstado(cliente.getEstado());
			clienteRepository.save(clienteUpdate);
			return clienteUpdate;
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + cliente.getId());
		}
	}

	@Override
	public List<Cliente> getAllcliente() {
		return this.clienteRepository.findAll();
	}

	@Override
	public Cliente getclienteById(long clienteId) {

		Optional<Cliente> clienteDb = this.clienteRepository.findById(clienteId);

		if (clienteDb.isPresent()) {
			return clienteDb.get();
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + clienteId);
		}
	}

	@Override
	public void deletecliente(long clienteId) {
		Optional<Cliente> clienteDb = this.clienteRepository.findById(clienteId);

		if (clienteDb.isPresent()) {
			this.clienteRepository.delete(clienteDb.get());
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + clienteId);
		}

	}

}
