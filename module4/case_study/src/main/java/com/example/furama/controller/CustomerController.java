package com.example.furama.controller;


import com.example.furama.model.customer.Customer;
import com.example.furama.model.customer.CustomerType;
import com.example.furama.service.ICustomerService;
import com.example.furama.service.ICustomerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    @Autowired
    ICustomerService customerService;

    @Autowired
    ICustomerType customerType;

    @ModelAttribute("customerType")
    public Iterable<CustomerType> customerType(){
        return customerType.findAll();
    }


    @GetMapping("/")
    public String homePage(){
        return "login/giaodien";
    }

    @GetMapping("/customer")
    public String show(Model model){
        Iterable<Customer> customers = customerService.findAll();
        model.addAttribute("customers",customers);
        return "customer/list";
    }

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/create";
    }

    @PostMapping("save")
    public String save(Customer customer ) {
        customerService.save(customer);
        return "redirect:/customer";
    }


    @GetMapping("customer/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "customer/edit";
    }

    @GetMapping("customer/{id}/view")
    public String view(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("customer", customerService.findById(id).get());
        return "customer/detail";
    }

    @GetMapping("customer/{id}/delete")
    public String delete(@PathVariable Integer id,Model model){
        model.addAttribute("customer",customerService.findById(id).get());
        return "customer/delete";

    }
    @PostMapping("/delete")
    public String delete(Customer customer ) {
        customerService.remove(customer.getId());
//        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:customer";
    }

    @PostMapping("search")
    public String search(@RequestParam("name") String name,Model model){
        model.addAttribute("customer",customerService.searchByName(name));
        return "customer/list";
    }



}
