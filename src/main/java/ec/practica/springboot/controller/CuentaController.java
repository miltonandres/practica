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

import ec.practica.springboot.model.Cuenta;
import ec.practica.springboot.service.CuentaServiceImpl;

@RestController
@RequestMapping("/api")
public class CuentaController {
    @Autowired
    private CuentaServiceImpl cuentaServicio;

    @GetMapping("/cuentas")
    public ResponseEntity<List<Cuenta>> getAllCuenta() {
        return ResponseEntity.ok().body(cuentaServicio.getAllItems());
    }

    @GetMapping("/cuentas/{id}")
    public ResponseEntity<Cuenta> getCuentaById(@PathVariable long id) {
        return ResponseEntity.ok().body(cuentaServicio.getById(id));
    }

    @PostMapping("/cuentas")
    public ResponseEntity<Cuenta> createCuenta(@RequestBody Cuenta Cuenta) {
        return ResponseEntity.ok().body(this.cuentaServicio.create(Cuenta));
    }

    @PutMapping("/cuentas/{id}")
    public ResponseEntity<Cuenta> updateCuenta(@PathVariable long id, @RequestBody Cuenta Cuenta) {
        Cuenta.setIdCuenta(id);
        return ResponseEntity.ok().body(this.cuentaServicio.update(Cuenta));
    }

    @DeleteMapping("/cuentas/{id}")
    public HttpStatus deleteCuenta(@PathVariable long id) {
        this.cuentaServicio.delete(id);
        return HttpStatus.OK;
    }
}
