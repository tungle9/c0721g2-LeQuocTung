package com.example.furama.controller;


import com.example.furama.model.customer.Customer;
import com.example.furama.model.employee.Division;
import com.example.furama.model.employee.EducationDegree;
import com.example.furama.model.employee.Employee;
import com.example.furama.model.employee.Position;
import com.example.furama.service.DivisonService;
import com.example.furama.service.EducationService;
import com.example.furama.service.EmployeeService;
import com.example.furama.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.Valid;
import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    PositionService positionService;

    @Autowired
    EducationService educationService;

    @Autowired
    DivisonService divisonService;

    @ModelAttribute("positionService")
    public Iterable<Position> getPosition() {
        return positionService.findAll();
    }

    @ModelAttribute("educationService")
    public Iterable<EducationDegree> getEducation() {
        return educationService.findAll();
    }

    @ModelAttribute("divisionService")
    public Iterable<Division> getDivision() {
        return divisonService.findAll();
    }


    @GetMapping("/employee")
    public String show(@RequestParam("search") Optional<String> search, Model model, @PageableDefault(size = 5) Pageable pageable) {
        Page<Employee> employee;
        if (search.isPresent()) {
            employee = employeeService.findAllByNameContaining(search, pageable);
        } else {
            employee = employeeService.findAllPage(pageable);
        }
        model.addAttribute("employee", employee);
        return "employee/list";
    }

    @GetMapping("employee/create")
    public String showCreate(Model model) {
        model.addAttribute("employee", new Employee());
        return ("employee/create");
    }

    @PostMapping("employee/save")
    public String save(@Valid Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "employee/create";
        } else {
            employeeService.save(employee);
            return "redirect:/employee";
        }
    }

    @GetMapping("employee/{id}/edit")
    public String edit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("employee", employeeService.findById(id));
        return "employee/edit";
    }

    @GetMapping("employee/{employeeId}/delete")
    public String delete(@PathVariable("employeeId") Integer id, Model model) {
        model.addAttribute("employee", employeeService.findById(id).get());
        return "employee/delete";
    }


//    @GetMapping("/delete/{idEmployee}/employee")
//    public String delete(@PathVariable("idEmployee") Integer id) {
//        employeeService.remove(id);
//        return "redirect:/employee";
//    }

    @PostMapping("/delete/employee")
    public String delete(Employee employee) {
        employeeService.remove(employee.getEmployeeId());
        return "redirect:/employee";
    }


//         new Customer().validate(customer, bindingResult);
//        if (bindingResult.hasFieldErrors()) {
//        return "customer/create";
//    } else {
//        customerService.save(customer);
//        return "redirect:/customer";
//    }


}
