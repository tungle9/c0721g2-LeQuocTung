package _05_modifier_static_method_static.excersie;

//truyền dùng set , lấy dùng get
public class Student {
    private String name = "John";
    private String classes = "C02";
    public Student(){
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
   public void display(){
       System.out.println("name :" + name +",classes :"+classes);
   }
}
