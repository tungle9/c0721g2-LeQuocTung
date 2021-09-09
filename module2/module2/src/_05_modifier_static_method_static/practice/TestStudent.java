package _05_modifier_static_method_static.practice;

import _05_modifier_static_method_static.practice.Student;

public class TestStudent {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.change();
        Student.change();
        Student s1 = new Student(123,"Tung",23);
        Student s2 = new Student(123123,"Tufng",24);
        Student s3 = new Student(12233,"Tung`",25);
        s1.display();
        s2.display();
        s3.display();
    }
}
