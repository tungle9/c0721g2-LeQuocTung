package com.example.quan_ly_dien_thoai.controller;


import com.example.quan_ly_dien_thoai.model.Smartphone;
import com.example.quan_ly_dien_thoai.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/smartphones")
public class SmartphoneController {

    @Autowired
    private ISmartphoneService smartphoneService;

    @PostMapping
    public ResponseEntity<Smartphone> createSmartphone(@RequestBody Smartphone smartphone) {
        return new ResponseEntity<>(smartphoneService.save(smartphone), HttpStatus.CREATED);
    }
    @GetMapping("/list")
    public String list(Model model){
//        Iterable<Smartphone> smartphones = smartphoneService.findAll();
        model.addAttribute("smartphones",smartphoneService.findAll());
        return  "phones/list";

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Smartphone> deleteSmartphone(@PathVariable Long id) {
        Optional<Smartphone> smartphoneOptional = smartphoneService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        smartphoneService.remove(id);
        return new ResponseEntity<>(smartphoneOptional.get(), HttpStatus.NO_CONTENT);
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id , Model model ){
        model.addAttribute("smartphone",smartphoneService.findById(id));
        return ("phones/edit");
    }

    @PostMapping("save")
    public String save(@ModelAttribute("smartphone") Smartphone smartphone,Model model){
        smartphoneService.save(smartphone);
        model.addAttribute("smartphone",new Smartphone());
        return "phones/list";
    }
}
