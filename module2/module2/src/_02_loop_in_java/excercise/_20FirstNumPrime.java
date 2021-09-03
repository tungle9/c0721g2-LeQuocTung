package _02_loop_in_java.excercise;

public class _20FirstNumPrime {
    public static void main(String[] args) {
        int count = 1;
        int a = 2;
//        for (int i = 1;i <= 20 ; ) {
//            boolean check = true;
//            for (int j = 2; j < a; j++) {
//                if (a % j == 0) {
//                    check = false;
//                    break;
//                }
//            }
//            if (check) {
//                System.out.println(i+"số nguyên tố " + a);
//                i++;
//            }
//          count ++;
//            a++;

//        }

        while (count <= 20) {
            boolean check = true;
            if (a < 2) {
                check = false;
                break;
            } else {
                for (int i = 2; i < a; i++) {
                    if (a % i == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                System.out.println(count + "số nguyên tố là : " + a);
                count++;
            }
            a++;

        }
    }
}

