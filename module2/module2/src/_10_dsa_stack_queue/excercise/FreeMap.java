package _10_dsa_stack_queue.excercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FreeMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "meo");
        map.put(2, "ga");
        map.put(3, "vit");
        System.out.println("chọn key muốn chuyển thành chữ HOA");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        if (map.containsKey(index) == true) {

            System.out.println(map.get(index).toUpperCase());

        } else {
            System.out.println("key bạn tìm k có trong list");
        }
//      for(Map.Entry<Integer,String> entry:map.entrySet()){
//            System.out.println(entry.getKey() +entry.getValue().toUpperCase());
//      }
    }
}
