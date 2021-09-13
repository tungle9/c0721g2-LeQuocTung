package abc;

import java.util.ArrayList;
import java.util.Collections;

public class HumanTest {
    public static void main(String[] args) {
        ArrayList<String> aaaa = new ArrayList<>();
        aaaa.add("abc");
        aaaa.add("ac");
        aaaa.add("123");
        aaaa.set(0, "ax");
        Collections.sort(aaaa);
        for (int i = 0; i < aaaa.size(); i++) {
            System.out.println(aaaa.get(i));
        }
    }
}
