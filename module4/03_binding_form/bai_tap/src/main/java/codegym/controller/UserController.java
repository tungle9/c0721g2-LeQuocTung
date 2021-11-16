package codegym.controller;


import codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class UserController {

    @GetMapping("")
    public String showForm(Model model) {
        String[] gender = {"Male","Female"};
        model.addAttribute("gender",gender);
        String[] vehicle = {"Tau bay","Tau thuyen","O to","Khac"};
        boolean[] sign = {true,false};
        String[] city ={"Da Nang","Hoi an","TP HO CHI MINH","Hue"};
        String[] situation = {"YES","NO"};
        model.addAttribute("sign",sign);
        model.addAttribute("city",city);
        model.addAttribute("vehicle",vehicle);
        model.addAttribute("situation",situation);


        model.addAttribute("user", new User());
        return "form_info";
    }

    @PostMapping("user_form")
    public String fillForm(@ModelAttribute ("user") User user,Model model) {
        model.addAttribute("user",user);
        return "user_form";
    }
}
