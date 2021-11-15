package codegym.controller;


import codegym.model.Login;
import codegym.model.User;
import dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("home")
    public String home(Model model) {
        model.addAttribute("login", new Login());
        return "home";
    }

    @PostMapping("login")
    public String login(@ModelAttribute("login") Login login, Model model) {
        User user = UserDao.checkLogin(login);
        if (user == null) {
        //    model.addAttribute("you nhap sai", "error");
            return "error";
        } else {
            model.addAttribute("user", user);
            return "user";
        }
    }
}
