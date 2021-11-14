package codegym.service;

import codegym.bean.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void save(String name, String date);

    Student finById(int id);
}
