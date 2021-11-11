package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public  class  GreetingController {

    @GetMapping("")
    public String greeting( String name, Model model){
        model.addAttribute("msg","i'm bean");
        return "greeting";
    }
}
