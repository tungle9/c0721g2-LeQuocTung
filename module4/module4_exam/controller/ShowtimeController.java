package com.example.module4_exam.controller;


import com.example.module4_exam.model.Film;
import com.example.module4_exam.model.Showtime;
import com.example.module4_exam.reposility.ShowtimeReposi;
import com.example.module4_exam.service.FilmService;
import com.example.module4_exam.service.ShowtimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ShowtimeController {
    @Autowired
    private ShowtimeService showtimeService;

    @Autowired
    private FilmService filmService;



    @ModelAttribute("filmService")
    public Iterable<Film> filmService() {
        return filmService.findAll();
    }


    @GetMapping("showtime")
    public String show(Model model) {
        model.addAttribute("showtime", showtimeService.findAll());
        return "show_time/list";
    }

    @GetMapping("showtime/create")
    public String create(Model model){
        model.addAttribute("showtime",new Showtime());
        return "show_time/create";
    }



}
