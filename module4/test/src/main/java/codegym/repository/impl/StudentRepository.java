package codegym.repository.impl;

import codegym.bean.Student;
import codegym.repository.IStudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Repository
public class StudentRepository implements IStudentRepository {

    static Map<Integer, Student> studentMap = new TreeMap<>();

    static {
        studentMap.put(654, new Student(654, "Nguyen Van A",
                "2000-08-03", 1, 4.0));
        studentMap.put(874, new Student(874, "Mai Thi C",
                "2000-08-08", 0, 9.0));
        studentMap.put(435, new Student(435, "Le Van D",
                "2000-12-04", 1, 7.0));
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentMap.values());
    }

    @Override
    public void save(String name, String date) {
        int id = (int) (Math.random() * 100);
        Student student = new Student(id, name, date, (int) (Math.random() * 2), (double) (Math.random() * 100));
        studentMap.put(id, student);
    }

    @Override
    public Student findById(int id) {
        return studentMap.get(id);
    }
}
