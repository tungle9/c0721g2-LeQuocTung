package codegym.controller;

import codegym.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {

    @GetMapping("email")
    public String showEmail(Model model) {
        String[] languages = {"English", "Vietnamese", "Japanese", "Chinese"};
        int[] page = {5, 10, 15, 25, 50, 100};
        model.addAttribute("languages", languages);
        model.addAttribute("page", page);


        model.addAttribute("email", new Email());
        return "email";
    }

    @PostMapping("update_email")
    public String Info(@ModelAttribute("email") Email email,Model model) {
        model.addAttribute("email",email);
        return "update_email";
    }
}
