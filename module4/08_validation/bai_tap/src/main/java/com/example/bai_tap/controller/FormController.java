package com.example.bai_tap.controller;


import com.example.bai_tap.model.Form;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FormController {

    @GetMapping("/form")
    public String showForm(Model model){
        model.addAttribute("form",new Form());
        return ("form/list");
    }


    @PostMapping("/check")
    public String checkValidation (@Valid @ModelAttribute("form")Form form, BindingResult bindingResult, Model model){
        new Form().validate(form, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "form/list";
        }
        else {
            model.addAttribute("form", form);
            return "form/result";
        }
    }
}
