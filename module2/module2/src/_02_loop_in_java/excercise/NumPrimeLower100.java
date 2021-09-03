package _02_loop_in_java.excercise;

public class NumPrimeLower100 {
    public static void main(String[] args) {
        int count = 1;
        int a = 2;
        while (count < 100) {
            boolean check = true;
            if (a < 2) {
                check = false;
            } else {
                for (int i = 2; i < a; i++) {
                    if (a % i == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                System.out.println("số nguyên tố là : " + a);
            }
            a++;
            count++;
        }
    }
}
