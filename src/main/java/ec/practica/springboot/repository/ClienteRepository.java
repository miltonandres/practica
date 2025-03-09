package ec.practica.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.practica.springboot.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
