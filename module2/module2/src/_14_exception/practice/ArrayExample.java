package _14_exception.practice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public int[] createRandom() {
        Random rd = new Random();
        int[] arr = new int[100];
        System.out.println("danh sách phần tử");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println("vị trí " + i + "phần tử" + arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử");
        try {
            int x = scanner.nextInt();
            System.out.println("giá trị của phần tử : " + x + "là : " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("chỉ số nhập quá giới hạn mảng");
        } catch (InputMismatchException e) {
            System.out.println("nhập sai");
        }
    }
}