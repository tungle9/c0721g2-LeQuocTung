package codegym.service.impl;

import codegym.bean.Student;
import codegym.repository.IStudentRepository;
import codegym.repository.impl.StudentRepository;
import codegym.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    // DI = Dependency Inversion
    //DI bằng Interface
    //DI bằng construstor
    //DI bằng setter
    @Autowired
    private IStudentRepository iStudentRepository;
    //private IStudentRepository iStudentRepository = new  StudentRepository();

    @Override
    public List<Student> findAll() {
        return this.iStudentRepository.findAll();
    }

    @Override
    public void save(String name, String date) {
     this.iStudentRepository.save(name,date);

    }

    @Override
    public Student finById(int id) {
        return this.iStudentRepository.findById(id);
    }
}
