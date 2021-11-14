package codegym.service.impl;

import codegym.bean.Student;
import codegym.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "testService")
public class TestService implements IStudentService {
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void save(String name, String date) {

    }

    @Override
    public Student finById(int id) {
        return null;
    }
}
