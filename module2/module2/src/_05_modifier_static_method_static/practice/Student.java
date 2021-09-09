package _05_modifier_static_method_static.practice;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    int old;
public Student(){

    }
    //constructor to initialize the variable
    Student(int r, String n, int b) {
        rollno = r;
        name = n;
        old = b;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college + " " + old);
    }
}