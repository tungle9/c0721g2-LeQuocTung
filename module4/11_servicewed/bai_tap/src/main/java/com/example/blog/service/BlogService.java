package com.example.blog.service;


import com.example.blog.model.Blog;
import com.example.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository BlogRepository;


    @Override
    public Iterable<Blog> findAll() {
        return BlogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Integer id) {
        return BlogRepository.findById(id);
    }

    @Override
    public Blog save(Blog blog) {
      return  BlogRepository.save(blog);

    }

    @Override
    public void remove(Integer id) {
        BlogRepository.deleteById(id);


    }
}
