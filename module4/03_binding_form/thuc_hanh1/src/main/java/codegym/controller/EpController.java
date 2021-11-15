package codegym.controller;


import codegym.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class EpController {
    @GetMapping("")
    public String showForm(Model model){
        model.addAttribute("emplomyee",new Employee());
        return "create";
    }

    @PostMapping("add")
    public String submit(@ModelAttribute("employee") Employee employee,Model model){
        model.addAttribute("name",employee.getName());
        model.addAttribute("contactNumber",employee.getContactNumber());
        model.addAttribute("id",employee.getId());
        return "infor";
    }
}
