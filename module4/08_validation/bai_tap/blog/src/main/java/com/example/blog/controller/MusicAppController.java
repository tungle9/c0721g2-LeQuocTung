package com.example.blog.controller;

import com.example.blog.model.MusicApp;
import com.example.blog.service.IMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MusicAppController {

    @Autowired
    private IMusic iMusic;


    @GetMapping("create")
    public String formCreate(Model model) {
        model.addAttribute("music", new MusicApp());
        return ("create");
    }

    @GetMapping("music")
    public String showList(Model model) {
        List<MusicApp> music = iMusic.finAll();
        model.addAttribute("music", music);
        return ("list");
    }

    @PostMapping("save")
    private String save(@Valid @ModelAttribute("music") MusicApp music, BindingResult bindingResult, Model model) {
        new MusicApp().validate(music, bindingResult);
        if (bindingResult.hasErrors()) {
            return ("create");
        }
        iMusic.save(music);
        return ("redirect:music");
    }


}
