package codegym.repository;

import codegym.bean.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();

    void save(String name , String date);

    Student findById (int id );
}
