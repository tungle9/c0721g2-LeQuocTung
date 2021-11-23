package codegym.service;

import java.util.List;

public interface IGeneralBlog<T> {
    List<T> findAll();

    T findById(Integer id);

    void save(T t);

    void remove(Integer id);
}
