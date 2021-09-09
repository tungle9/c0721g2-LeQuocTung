package _05_modifier_static_method_static.excersie;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student2.display();
        student1.setName("David");
        student1.setClasses("H20");
        student1.display();
    }
}
