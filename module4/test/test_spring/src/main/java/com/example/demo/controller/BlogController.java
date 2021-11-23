package com.example.demo.controller;


import com.example.demo.model.Blog;
import com.example.demo.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
//
//
//    @GetMapping("create")
//    public String showCreateForm(Model model) {
//        model.addAttribute("blog", new Blog());
//        return ("create");
//    }
//
//
//    @PostMapping("save")
//    public String saveForm(@ModelAttribute("blog") Blog blog, Model model) {
//        blogService.save(blog);
//        model.addAttribute("blog", new Blog());
//        model.addAttribute("msg", "Created new blog");
//        return ("create");
//    }
//
//    @GetMapping("/delete/{id}")
//    public String delete(@PathVariable Integer id) {
//        Blog blog = blogService.findById(id);
//        blogService.remove(blog.getId());
//        return ("redirect:/blog");
//    }
//
//    @GetMapping("/edit/{id}")
//    public String showFormEdit(@PathVariable("id") Integer id, Model model) {
//        Blog blog = blogService.findById(id);
//        model.addAttribute("blog", blog);
//        return "edit";
//    }
//
//    @PostMapping("edit")
//    public String update(@ModelAttribute("blog") Blog blog, Model model) {
//        blogService.save(blog);
//        model.addAttribute("blog", blog);
//        return ("redirect:/blog");
//    }
}
