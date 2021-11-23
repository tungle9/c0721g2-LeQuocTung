package com.example.blog.controller;


import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;


    @GetMapping("/blog")
    public String listCustomers(Model model) {
        Iterable<Blog> blog = blogService.findAll();
        model.addAttribute("blog", blog);
        return ("list");
}


    @GetMapping("create")
    public String showCreateForm(Model model) {
        model.addAttribute("blog", new Blog());
        return ("create");
    }


    @PostMapping("save")
    public String saveForm(@ModelAttribute("blog") Blog blog, Model model) {
        blogService.save(blog);
        model.addAttribute("blog", new Blog());
        model.addAttribute("msg", "Created new blog");
        return ("create");
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id,Model model) {
        Optional<Blog> blog = blogService.findById(id);
        if(blog.isPresent()){
            model.addAttribute("blog",blog.get());
            return ("redirect:/blog");
        }
        return ("error");
    }

    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable("id") Integer id, Model model) {
        Optional<Blog> blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "edit";
    }

    @PostMapping("edit")
    public String update(@ModelAttribute("blog") Blog blog, Model model) {
        blogService.save(blog);
        model.addAttribute("blog", blog);
        return ("redirect:/blog");
    }
}
