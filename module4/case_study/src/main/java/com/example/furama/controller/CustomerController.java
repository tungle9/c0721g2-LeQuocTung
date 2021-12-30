package com.example.furama.controller;


import com.example.furama.dto.Dto;
import com.example.furama.model.customer.Customer;
import com.example.furama.model.customer.CustomerType;
import com.example.furama.service.CustomerService;
import com.example.furama.service.ICustomerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    ICustomerType customerType;


    @ModelAttribute("customerType")
    public Iterable<CustomerType> customerType() {
        return customerType.findAll();
    }


//    @GetMapping("/")
//    public ModelAndView index() {
//        return new ModelAndView("login/index");
//    }


    @GetMapping("/")
    public String homePage() {
        return "login/giaodien";
    }

    @GetMapping("/customer")
    public String show(@RequestParam("search") Optional<String> search, Model model, @PageableDefault(size = 5) Pageable pageable) {
        Page<Customer> customers;
        if (search.isPresent()) {
            customers = customerService.findAllByNameContaining(search, pageable);
        } else {
            customers = customerService.findAllPage(pageable);
        }
        model.addAttribute("customers", customers);
        return "customer/list";
    }


//    @GetMapping("/search")
//    public String showList(@RequestParam("search") String name, Model model) {
//        List<Customer> customers = customerService.searchByName(name);
//        model.addAttribute("customers", customers);
//        return "customer/list";
//
//
//    }

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/create";
    }

    @PostMapping("save")
    public String save(@Valid Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "customer/create";
        } else {
            customerService.save(customer);
            return "redirect:/customer";
        }
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
    public String delete(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("customer", customerService.findById(id).get());
        return "customer/delete";
    }


    @PostMapping("/delete")
    public String delete(Customer customer) {
        customerService.remove(customer.getId());
//        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:customer";
    }


    @GetMapping("/customer_contract")
    public String customerContract(Pageable pageable, Model model) {
        Page<Dto> dto = customerService.CustomerContract(pageable);
        model.addAttribute("dto", dto);
        return "customer_and_contract/list";
    }


//    @GetMapping("search")
//    public String search(@RequestParam("name") String name, Model model) {
//        model.addAttribute("customers", customerService.searchByName(name));
//        return "customer/list";
//    }
}
