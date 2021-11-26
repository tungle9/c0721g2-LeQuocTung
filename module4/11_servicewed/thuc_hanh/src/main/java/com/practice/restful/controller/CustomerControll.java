package com.practice.restful.controller;


import com.practice.restful.model.Customer;
import com.practice.restful.repository.ICustomerRepository;
import com.practice.restful.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerControll {


    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customers")
    public String showList(Model model){
        Iterable<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "list";
    }
}
