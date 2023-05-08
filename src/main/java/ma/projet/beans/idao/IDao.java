package ma.projet.beans.idao;

import java.util.List;

public interface IDao <T>{
    public T save(T object);

    public void delete(T object);

    public T findById(int id);

    public List<T> findAll();
    public T update(T p);
    void delete(int id);
}
