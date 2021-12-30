package com.example.benhnhan;

import java.util.List;
import java.util.Optional;

public interface IGeneral<T> {

    Iterable<T> findAll();

    Optional<T> findById(Long id);

    Object save(T t);

    void remove(Long id);

    List<T> searchByName(String name);


}