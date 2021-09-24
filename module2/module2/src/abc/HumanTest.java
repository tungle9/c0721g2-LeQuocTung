package abc;

import java.util.*;

public class HumanTest {
    public static Integer a = 0  ;
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        HashMap<Object,String> abc = new HashMap<>();
        humanList.add(new Human("teo", 18, "game"));
        humanList.add(new Human("te213o", 18, "game"));
        humanList.add(new Human("teo", 18, "game"));
        Human human = new Human("bam",18,"game");
        Human human1 = new Human("ba",18,"game");
        Human human3 = new Human("abc",18,"game");
        abc.put(human,"a.txt");
        abc.put(human,"b.txt");
        System.out.println("Các entry có trong hashMap là: ");
        abc.forEach((a,b) -> System.out.println(a+ "value " + b ));

        for(Human human2 : humanList){
            System.out.println(human2);
        }
    }
}
