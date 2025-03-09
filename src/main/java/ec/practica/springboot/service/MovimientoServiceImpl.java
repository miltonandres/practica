package ec.practica.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.practica.springboot.exception.ResourceNotFoundException;
import ec.practica.springboot.model.Movimiento;
import ec.practica.springboot.repository.MovimientoRepository;

@Service
@Transactional
public class MovimientoServiceImpl implements CrudService<Movimiento> {

    @Autowired
    private MovimientoRepository movimientoRepository;

    @Override
    public Movimiento create(Movimiento movimiento) {
        // TODO Auto-generated method stub
        movimiento.getCuenta().setSaldoCuenta(movimiento.getCuenta().getSaldoCuenta().add(movimiento.getValor()));
        return movimientoRepository.save(movimiento);
    }

    @Override
    public Movimiento update(Movimiento movimiento) {
        // TODO Auto-generated method stub
        return movimientoRepository.save(movimiento);
    }

    @Override
    public void delete(long id) {
        movimientoRepository.delete(getById(id));
    }

    @Override
    public List<Movimiento> getAllItems() {
        // TODO Auto-generated method stub
        return movimientoRepository.findAll();
    }

    @Override
    public Movimiento getById(long clienteId) {
        // TODO Auto-generated method stub
        return movimientoRepository.getReferenceById(clienteId);
    }

}
