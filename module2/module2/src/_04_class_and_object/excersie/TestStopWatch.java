package _04_class_and_object.excersie;

import java.util.Random;

public class TestStopWatch {
    public void sort(int arr[]) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    // Driver code to test above
    /* This code is contributed by Rajat Mishra*/
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        TestStopWatch test = new TestStopWatch();
        int arr[] = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            Random rd = new Random();//khai báo một đối tượng random
            int number = rd.nextInt(100000);//trả về một số nguyên bất kì
            arr[i] = number;
        }
        watch.start();
        test.sort(arr);
        test.printArray(arr);
        watch.endTime();
        System.out.println("Kết quả là : " + watch.stop());
    }
}
