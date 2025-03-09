package ec.practica.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.practica.springboot.model.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {

}
