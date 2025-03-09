package ec.practica.springboot.service;

import java.util.Collection;
import java.util.List;

import ec.practica.springboot.model.Cliente;

public interface CrudService<T> {
    public abstract T create(T t);

    public abstract T update(T t);

    public abstract void delete(long id);

    public abstract List<T> getAllItems();

    public T getById(long clienteId);
}
