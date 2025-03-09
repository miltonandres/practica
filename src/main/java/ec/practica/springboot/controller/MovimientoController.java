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

import ec.practica.springboot.model.Movimiento;
import ec.practica.springboot.service.MovimientoServiceImpl;

@RestController
@RequestMapping("/api")
public class MovimientoController {
    @Autowired
    private MovimientoServiceImpl movimientoServicio;

    @GetMapping("/movimientos")
    public ResponseEntity<List<Movimiento>> getAllMovimiento() {
        return ResponseEntity.ok().body(movimientoServicio.getAllItems());
    }

    @GetMapping("/Movimientos/{id}")
    public ResponseEntity<Movimiento> getMovimientoById(@PathVariable long id) {
        return ResponseEntity.ok().body(movimientoServicio.getById(id));
    }

    @PostMapping("/Movimientos")
    public ResponseEntity<Movimiento> createMovimiento(@RequestBody Movimiento Movimiento) {
        return ResponseEntity.ok().body(this.movimientoServicio.create(Movimiento));
    }

    @PutMapping("/Movimientos/{id}")
    public ResponseEntity<Movimiento> updateMovimiento(@PathVariable long id, @RequestBody Movimiento movimiento) {
        movimiento.setIdMovimiento(id);
        return ResponseEntity.ok().body(this.movimientoServicio.update(movimiento));
    }

    @DeleteMapping("/Movimientos/{id}")
    public HttpStatus deleteMovimiento(@PathVariable long id) {
        this.movimientoServicio.delete(id);
        return HttpStatus.OK;
    }

}
