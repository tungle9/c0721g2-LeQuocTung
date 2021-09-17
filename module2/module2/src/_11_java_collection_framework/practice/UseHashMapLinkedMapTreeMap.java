package _11_java_collection_framework.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class UseHashMapLinkedMapTreeMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>(); // sắp xếp ngẫu nhiên
        hashMap.put("Smith", 30);     //  cho phép key,giá trị  = null
        hashMap.put("null", 31); // ghi đè value
//        hashMap.put("Lewis", 29);
        hashMap.put("Lewis", 15);
        hashMap.put("Lewis", 16);
//        hashMap.put(null, 29);
        hashMap.put("ab", 1);  // không cho phép giá trị null
        hashMap.put("Cook", 100);
        System.out.println(hashMap);
        System.out.println(hashMap.get(1));
        //////
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);
        treeMap.put("a",12);
        System.out.println(treeMap.get("a"));
        System.out.println(treeMap.get("Lewis"));
        ////////
        Map<String,Integer> linkedHashmap = new LinkedHashMap<>(29,1000,false);
        linkedHashmap.put("Smith",30);
        linkedHashmap.put(null, 31);
        linkedHashmap.put("Lewis", 29);
        linkedHashmap.put("Cook", 29);
        linkedHashmap.put("Cook", null);
        System.out.println(linkedHashmap);
    }
}
