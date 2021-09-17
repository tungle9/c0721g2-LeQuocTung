package abc.Students;

import java.util.ArrayList;

public class Students {
    private ArrayList<ManangerStudents> list;

    public Students(ArrayList<ManangerStudents> list) {
        this.list = list;
    }

    public Students() {
        this.list = new ArrayList<ManangerStudents>();
    }

    public void add(ManangerStudents students) {
        this.list.add(students);
    }

    public void show() {
        for (ManangerStudents students : list) {
            System.out.println("tổng các sinh viên là " + students);
        }
    }

    public boolean check() {
        return this.list.isEmpty();
    }

    //tổng sinh viên
    public int result() {
        return this.list.size();
    }

    public void clear() {
        this.list.removeAll(list);
    }
    // tìm kiếm sinh viên bằng tên
    public void serach(String name) {
        for (ManangerStudents students : list) {
            if (students.getName().indexOf(name) >= 0) {
                System.out.println("sinh viên bạn tìm kiếm là : " + students);
            } else {
                System.out.println("tên không có");
            }
        }
    }
    public boolean delete(ManangerStudents id) {
        return this.list.remove(id);
    }
}