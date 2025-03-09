package ec.practica.springboot;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import ec.practica.springboot.controller.ClienteController;
import ec.practica.springboot.model.Cliente;
import ec.practica.springboot.model.Persona;
import ec.practica.springboot.service.ClienteService;

@WebMvcTest
public class ClienteControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ClienteService clienteService;

    @Autowired
    private ObjectMapper objectMapper;

    // JUnit test for Get All employees REST API
    @Test
    public void getAllclienteTest() throws Exception {

        Persona personaUno = new Persona();
        Cliente clienteUno = new Cliente();
        personaUno.setIdentificacion(12345);

        clienteUno.setClave("1234");
        clienteUno.setPersona(personaUno);

        // given - precondition or setup
        List<Cliente> listOfClientes = new ArrayList<>();
        listOfClientes
                .add(clienteUno);
        given(clienteService.getAllcliente()).willReturn(listOfClientes);

        // when - action or the behaviour that we are going test
        ResultActions response = mockMvc.perform(get("/api/clientes"));

        // then - verify the output
        response.andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.size()",
                        is(listOfClientes.size())));

    }
}
