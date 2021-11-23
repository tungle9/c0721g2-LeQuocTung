package codegym.controller;


import codegym.model.MusicApp;
import codegym.service.IMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MusicAppController {

    @Autowired
    private IMusic iMusic;

    //    public ModelAndView showList() {
//        ModelAndView modelAndView = new ModelAndView("music/list");
//        List<MusicApp> customers = iMusic.findAll();
//        modelAndView.addObject("customers", customers);
//        return modelAndView;
//    }


    @GetMapping("/music")
    public String show(Model model) {
        List<MusicApp> musicApps = iMusic.findAll();
        model.addAttribute("music", musicApps);
        return ("list");
    }

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("music", new MusicApp());
        return ("create");
    }

    @PostMapping("save")
    public String save(MusicApp musicApp, Model model) {

        iMusic.save(musicApp);
        model.addAttribute("msg", "Created");
        return "create";
    }
//<td><a th:href="@{delete/{id}(id=${c.id})}">delete</a></td>
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        iMusic.delete(id);
        return ("redirect:/music");
    }
}
