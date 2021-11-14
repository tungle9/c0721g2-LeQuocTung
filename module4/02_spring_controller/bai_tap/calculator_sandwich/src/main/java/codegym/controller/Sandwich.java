package codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sandwich {
    @GetMapping("/sandwich")
    public String show(){
        return "sandwich";
    }

    @PostMapping("/finish_sandwich")
    public String save(@RequestParam String[] spice, Model model){
    //    model.addAttribute("spice",spice);


      // kiểm tra dữ liệu
     for (int i = 0 ; i < spice.length ; i ++){
         System.out.println(spice[i]);
     }
        model.addAttribute("spice",spice);
        return "finish_sandwich";
    }
}



