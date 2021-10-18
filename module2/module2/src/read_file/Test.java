package read_file;

public class Test {
    String name;

    public static  void talk() {
        System.out.println("talk");
    }

    public void change() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Test test = new Test();
        Test2 test2 = new Test2();
        test = test2;
        test.talk();
        ((Test2) test).say();
        test2.talk();
        test2.say();
    }
}
