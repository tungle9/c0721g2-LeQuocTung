package com.example.module4_exam.service;

import com.example.module4_exam.model.Film;
import com.example.module4_exam.reposility.FilmReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService implements IGeneral<Film> {

    @Autowired
    private FilmReposi filmReposi;

    @Override
    public Iterable<Film> findAll() {
        return filmReposi.findAll();
    }

    @Override
    public Optional<Film> findById(Integer id) {
        return filmReposi.findById(id);
    }

    @Override
    public Film save(Film film) {
        return filmReposi.save(film);
    }

    @Override
    public void remove(Integer id) {
        filmReposi.deleteById(id);
    }

    @Override
    public List<Film> searchByName(String name) {
        return filmReposi.findByNameContaining(name);
    }

    public boolean checkFilm(String name){
        return filmReposi.existsFilmByIdFilm(name);
    }
}
