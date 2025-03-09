package ec.ejemplo.springbootdocker.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cuenta")
public class CuentaControlador {

    @GetMapping(value = "/products", produces = "application/json")
    public String getProducts() {
        return "productService.getAllItems()";
    }
}
