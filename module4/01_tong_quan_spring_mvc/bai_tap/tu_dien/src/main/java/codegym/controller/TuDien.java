package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

@Controller
public class TuDien {
    @GetMapping("")
    public String showGet() {
        return "list";
    }

    @PostMapping
    public String showPost(Model model, @RequestParam String words) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("hello", "xin chao");
        map.put("grenade", "luu dan");
        map.put("love", "yeu");
        for (Map.Entry<String, String> o : map.entrySet()) {
            if (o.getKey().equals(words)) {
                model.addAttribute("translate",o.getKey());
                break;
            } else {
                model.addAttribute("message", "NOT FOUND");
            }
        }
        return "list";
    }
}