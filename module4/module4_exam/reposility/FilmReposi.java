package com.example.module4_exam.reposility;

import com.example.module4_exam.model.Film;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmReposi extends PagingAndSortingRepository<Film, Integer> {

    List<Film> findByNameContaining(String name);

    Boolean existsFilmByIdFilm(String name);

}
