package codegym.controller;

import codegym.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Với value thì chúng ta thay tên bean từ studentController -> student
@Controller
public class StudentController {
    //Muốn triển theo lớp nào thì đặt tên phần @.
    @Qualifier("studentService")
    @Autowired
    private IStudentService iStudentService;

    @GetMapping(value = "")
    public String getPageHello(Model model) {
//        Dùng model để gửi dữ liệu sang view
        model.addAttribute("name", "welcome to c0721g2");
        return "hello";
    }

    @GetMapping("list")
    public String getListStudent(Model model) {
//        Dùng model để gửi dữ liệu sang view
        model.addAttribute("studentList", iStudentService.findAll());
        return "list";
    }

    @GetMapping("create")
    public String formCreate() {
        return "create";
    }

    @PostMapping("create")
    public String saveCreate(@RequestParam("name") String name, @RequestParam("dateOfBirth") String date, Model model) {
        iStudentService.save(name, date);
        model.addAttribute("msg", "created");
        return ("redirect:create");
    }


    @GetMapping("detail/{id}")
    public String showDetail(@PathVariable("id") int id,Model model ) {
        model.addAttribute("student", iStudentService.finById(id));
        return "detail";
    }

    @GetMapping("detail")
    public String showDetail1(@RequestParam int id,Model model ) {
        model.addAttribute("student", iStudentService.finById(id));
        return "detail";
    }
}

