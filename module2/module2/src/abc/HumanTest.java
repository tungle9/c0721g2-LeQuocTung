package abc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HumanTest {
    private static List<Human> humanList = new ArrayList<>();

    static {
        humanList.add(new Human("teo", 18, "game"));
        humanList.add(new Human("te213o", 18, "game"));
        humanList.add(new Human("teo", 18, "game"));
    }

    public  void show() {
        for (int i = 0; i < humanList.size(); i++) {
            System.out.println(i + 1 + ":" + humanList.get(i));
        }
    }

    public static void main(String[] args) {
        System.out.println(humanList);

    }
}
