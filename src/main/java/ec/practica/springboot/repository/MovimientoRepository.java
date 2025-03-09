package ec.practica.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.practica.springboot.model.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {

}
