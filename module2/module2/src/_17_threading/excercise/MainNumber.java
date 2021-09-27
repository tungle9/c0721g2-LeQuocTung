package _17_threading.excercise;

public class MainNumber extends  Thread{
    public static void main(String[] args) {
        NumberGenerator number1 = new NumberGenerator("A");
        NumberGenerator number2 = new NumberGenerator("B");
        //chạy xong 1 object rồi đến object kia
        number1.run();
        number2.run();
        //chạy song song
        TestThread test1 = new TestThread("TEST1");
        TestThread test2 = new TestThread("TEST2");
        test1.start();
        test2.start();
    }
}