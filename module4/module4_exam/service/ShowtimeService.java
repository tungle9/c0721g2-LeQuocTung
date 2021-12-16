package com.example.module4_exam.service;

import com.example.module4_exam.model.Showtime;
import com.example.module4_exam.reposility.ShowtimeReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShowtimeService implements IGeneral<Showtime> {
    @Autowired
   private ShowtimeReposi showtimeReposi;

    @Override
    public Iterable<Showtime> findAll() {
        return showtimeReposi.findAll();
    }

    @Override
    public Optional<Showtime> findById(Integer id) {
        return showtimeReposi.findById(id);
    }

    @Override
    public Showtime save(Showtime showtime) {
        return showtimeReposi.save(showtime);
    }

    @Override
    public void remove(Integer id) {

        showtimeReposi.deleteById(id);

    }

    @Override
    public List<Showtime> searchByName(String name){
        return null;
    }
//    {
//        return showtimeReposi.findByNameContaining(name);
//    }
}
