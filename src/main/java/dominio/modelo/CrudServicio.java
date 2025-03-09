package dominio.modelo;

import java.util.Collection;
import java.util.List;

public interface CrudServicio<T> {
    public abstract void create(T t);

    public abstract void update(String id, T t);

    public abstract void delete(String id);

    public abstract Collection<T> getItem();

    public abstract List<T> getAllItems();
}
