package com.example.blog.controller;


import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/blog")
public class BlogApi {


    @Autowired
    private IBlogService blogService;

    @GetMapping
    public ResponseEntity<Iterable<Blog>> getBlog(){
        List<Blog> blogs = (List<Blog>) blogService.findAll();
        if(blogs.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog){
        return new ResponseEntity<>(blogService.save(blog),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> findById(@PathVariable Integer id){
        Optional<Blog> blog = blogService.findById(id);
        if(!blog.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog.get(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Blog> update(@PathVariable Integer id, @RequestBody Blog blog) {
        Optional<Blog> blogOptional = blogService.findById(id);
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blog.setId(blogOptional.get().getId());
        return new ResponseEntity<>(blogService.save(blog), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Blog> delete(@PathVariable Integer id){
        Optional<Blog> blog = blogService.findById(id);
        if(!blog.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blogService.remove(id);
        return new ResponseEntity<>(blog.get(),HttpStatus.OK);
    }
}
