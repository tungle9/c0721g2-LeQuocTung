package com.example.furama;


import java.util.List;
import java.util.Optional;

public interface IGeneral<T> {
    Iterable<T> findAll();

    Optional<T> findById(Integer id);

    Object save(T t);

    void remove(Integer id);

    List<T> searchByName(String name);

}
