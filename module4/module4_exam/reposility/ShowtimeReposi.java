package com.example.module4_exam.reposility;

import com.example.module4_exam.model.Showtime;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ShowtimeReposi extends PagingAndSortingRepository<Showtime,Integer> {

//     List<Showtime> findByNameContaining(String name);


}
