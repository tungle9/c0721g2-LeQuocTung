package com.example.furama.controller;


import com.example.furama.model.customer.Customer;
import com.example.furama.model.service.Services;
import com.example.furama.service.IService;
import com.example.furama.service.UseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ServiceController {

    @Autowired
    IService iService;


    @GetMapping("/service")
    public String show(Model model){
//        Iterable<Services> services = iService.findAll();
        model.addAttribute("service",iService.findAll());
        return "service/list";
    }

    @GetMapping("service/create")
    public String create(Model model) {
        model.addAttribute("service", new Services());
        return "service/create";
    }

    @PostMapping("service/save")
    public String saveService(Services services){
        iService.save(services);
        return "redirect:/service";
    }

    @GetMapping("service/{id}/delete")
    public String showDelete(@PathVariable("id") Integer id, Model model){
        model.addAttribute("service",iService.findById(id).get());
        return "service/delete";
    }

    @PostMapping("/service/delete")
    public String delete(Services services){
        iService.remove(services.getId());
        return "redirect:/service";
    }
}
