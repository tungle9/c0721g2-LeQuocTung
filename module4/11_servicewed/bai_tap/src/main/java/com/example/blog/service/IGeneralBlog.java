package com.example.blog.service;

import com.example.blog.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IGeneralBlog<T> {
    Iterable<T> findAll();

    Optional<T> findById(Integer id);

    void save(T t);

    void remove(Integer id);
}
