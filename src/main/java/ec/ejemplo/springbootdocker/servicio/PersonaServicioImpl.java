package ec.ejemplo.springbootdocker.servicio;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dominio.Persona;
import ec.ejemplo.springbootdocker.repositorio.PersonaRepositorio;

@Service
public class PersonaServicioImpl implements PersonaServicio {

    @Autowired
    private PersonaRepositorio personaRepositorio;

    @Override
    public Persona guardarPersona(Persona persona) {
        return personaRepositorio.save(persona);
    }

    @Override
    public List<Persona> listarPersona() {
        return (List<Persona>) personaRepositorio.findAll();
    }

    @Override
    public void eliminarPersonaId(Long identificacion) {
        // TODO Auto-generated method stub
        personaRepositorio.deleteById(identificacion);
    }

}
