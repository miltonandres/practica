package ec.ejemplo.springbootdocker.servicio;

import java.util.List;
import dominio.Persona;

public interface PersonaServicio {
    // Save operation
    Persona guardarPersona(Persona persona);

    // Read operation
    List<Persona> listarPersona();

    // Delete operation
    void eliminarPersonaId(Long identificacion);
}
