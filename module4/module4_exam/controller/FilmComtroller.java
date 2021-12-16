package com.example.module4_exam.controller;

import com.example.module4_exam.model.Film;
import com.example.module4_exam.model.Showtime;
import com.example.module4_exam.reposility.FilmReposi;
import com.example.module4_exam.service.FilmService;
import com.example.module4_exam.service.ShowtimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FilmComtroller {
    @Autowired
    FilmService filmService;


    @Autowired
    private ShowtimeService showtimeService;

    @ModelAttribute("showtimeService")
    public Iterable<Showtime> showTime() {
        return showtimeService.findAll();
    }

    @GetMapping("/")
    public String showFilm(Model model) {
        model.addAttribute("film", filmService.findAll());
        return "film/list";
    }

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("film", new Film());
        return "film/create";
    }

    @PostMapping("save")
    public String save(@Valid Film film, BindingResult bindingResult, Model model) {

        if (bindingResult.hasFieldErrors()) {
            return "film/create";
        }

        if (filmService.checkFilm(film.getIdFilm())) {
            model.addAttribute("msg", "tên bạn nhập đã bị trùng");
            return "film/create";
        } else {
            filmService.save(film);
            return "redirect:/";
        }
    }

    @GetMapping("film/{id}/detail")
    public String view(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("film", filmService.findById(id).get());
        return "film/detail";
    }


}
