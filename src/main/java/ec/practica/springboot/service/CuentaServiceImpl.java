package ec.practica.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.practica.springboot.exception.ResourceNotFoundException;
import ec.practica.springboot.model.Cuenta;
import ec.practica.springboot.model.Movimiento;
import ec.practica.springboot.repository.CuentaRepository;

@Service
@Transactional
public class CuentaServiceImpl implements CrudService<Cuenta> {

    @Autowired
    private CuentaRepository cuentaRepository;

    @Override
    public Cuenta create(Cuenta cuenta) {
        // TODO Auto-generated method stub
        return cuentaRepository.save(cuenta);
    }

    @Override
    public Cuenta update(Cuenta cuenta) {
        // TODO Auto-generated method stub
        return cuentaRepository.save(cuenta);
    }

    @Override
    public void delete(long id) {
        cuentaRepository.delete(getById(id));
    }

    @Override
    public List<Cuenta> getAllItems() {
        // TODO Auto-generated method stub
        return cuentaRepository.findAll();
    }

    @Override
    public Cuenta getById(long idCuenta) {
        // TODO Auto-generated method stub
        return cuentaRepository.getReferenceById(idCuenta);
    }

}
