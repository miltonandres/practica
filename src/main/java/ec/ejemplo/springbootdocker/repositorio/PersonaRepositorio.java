package ec.ejemplo.springbootdocker.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dominio.Persona;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long> {

}
