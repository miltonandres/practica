package ec.practica.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.practica.springboot.model.Cliente;
import ec.practica.springboot.service.ClienteServiceImpl;

@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	private ClienteServiceImpl clienteServicio;

	@GetMapping("/clientes")
	public ResponseEntity<List<Cliente>> getAllcliente() {
		return ResponseEntity.ok().body(clienteServicio.getAllItems());
	}

	@GetMapping("/clientes/{id}")
	public ResponseEntity<Cliente> getclienteById(@PathVariable long id) {
		return ResponseEntity.ok().body(clienteServicio.getById(id));
	}

	@PostMapping("/clientes")
	public ResponseEntity<Cliente> createcliente(@RequestBody Cliente cliente) {
		return ResponseEntity.ok().body(this.clienteServicio.create(cliente));
	}

	@PutMapping("/clientes/{id}")
	public ResponseEntity<Cliente> updatecliente(@PathVariable long id, @RequestBody Cliente cliente) {
		cliente.setId(id);
		return ResponseEntity.ok().body(this.clienteServicio.update(cliente));
	}

	@DeleteMapping("/clientes/{id}")
	public HttpStatus deletecliente(@PathVariable long id) {
		this.clienteServicio.delete(id);
		return HttpStatus.OK;
	}
}
