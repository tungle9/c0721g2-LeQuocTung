package codegym.service;

import codegym.model.Blog;
import codegym.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository BlogRepository;

    @Override
    public List<Blog> findAll() {
        return BlogRepository.findAll();
    }

    @Override
    public Blog findById(Integer id) {
        return BlogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        BlogRepository.save(blog);

    }

    @Override
    public void remove(Integer id) {
        BlogRepository.remove(id);
    }
}
