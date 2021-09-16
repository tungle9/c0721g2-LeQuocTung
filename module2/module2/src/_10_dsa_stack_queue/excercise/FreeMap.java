package _10_dsa_stack_queue.excercise;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class FreeMap {
    public static void main(String[] args) {
        String str = "anh YEU yeu em EM";
        str = str.toLowerCase();
        String[] arr = str.split(" ");
        String key;
        Integer value;
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }
        Set set = map.keySet();
        Iterator i = set.iterator();
        while (i.hasNext()) { //duyệt phần tử
            key = (String) i.next();//pt hiện tại và di chuyển đến pt tiếp theo
            System.out.println("Từ '" + key + "' xuất hiện " + map.get(key) + " lần");
        }
    }
}

