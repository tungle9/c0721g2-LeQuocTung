package abc;

import java.util.Arrays;
public class sort {
    public static void main(String[] args) {
        int temp = 0;
        int[] a = {13, 2, 21, 3, 213, 1};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    temp = a[j] ;
                    a[j] = a[i] ;
                    a[i] = temp ;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
