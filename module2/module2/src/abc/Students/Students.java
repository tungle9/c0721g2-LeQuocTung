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
      for(ManangerStudents students : list){
          System.out.println(students);
      }
    }
    public boolean check() {
        return this.list.isEmpty();
    }
    public int result() {
        return this.list.size();
    }
//    public static void main(String[] args) {
//        Students  students = new Students();
//
//
//
//    }
}
