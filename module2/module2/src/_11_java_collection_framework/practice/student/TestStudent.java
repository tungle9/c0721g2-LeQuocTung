package _11_java_collection_framework.practice.student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Nam", 20, "DN");
        Student student1 = new Student("Thoa", 222, "DN");
        Student student2 = new Student("Thiu", 22, "DN");
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student);
        studentMap.put(3, student2);
        studentMap.put(2, student1);
// xếp theo thứ tự
        for (Map.Entry<Integer, Student> studentEntry : studentMap.entrySet()) {
            System.out.println(studentEntry.toString());
        }
        /////// không theo thứ tứ
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student);
        students.add(student2);
        for (Student student3 : students) {
            System.out.println(student3.toString());
        }

    }
}
