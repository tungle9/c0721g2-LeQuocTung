package _16_binary_file_serialization.practice.read_write_student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void write(File path, List<Student> students) throws IOException {
        try {
            FileOutputStream fm = new FileOutputStream(path);
            ObjectOutputStream om = new ObjectOutputStream(fm);
            om.writeObject(students);
            fm.close();
            om.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> read(File path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fm = new FileInputStream(path);
            ObjectInputStream om = new ObjectInputStream(fm);
            students = (List<Student>) om.readObject();
            fm.close();
            om.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
    public static void main(String[] args) throws IOException {
       List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        File file = new File("src\\_16_binary_file_serialization\\practice\\read_write_student\\student.txt");
        write(file,students);
        List<Student> studentList = read(file);
        for(Student student : studentList){
            System.out.println(student);
        }
    }
}
