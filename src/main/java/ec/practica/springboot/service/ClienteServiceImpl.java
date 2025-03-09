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
public class ClienteServiceImpl implements CrudService<Cliente> {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente create(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente update(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public void delete(long id) {
		throw new UnsupportedOperationException("Unimplemented method 'delete'");
	}

	@Override
	public List<Cliente> getAllItems() {
		// TODO Auto-generated method stub
		return this.clienteRepository.findAll();
	}

	@Override
	public Cliente getById(long clienteId) {
		// TODO Auto-generated method stub
		Optional<Cliente> clienteDb = this.clienteRepository.findById(clienteId);

		if (clienteDb.isPresent()) {
			return clienteDb.get();
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + clienteId);
		}
	}

}
