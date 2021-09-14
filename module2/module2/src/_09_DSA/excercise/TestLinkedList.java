package _09_DSA.excercise;

import _05_modifier_static_method_static.practice.Student;

public class TestLinkedList {
    static class Human {
        public static int id = 1 ;
        String name;
        int age;

        Human(String name, int age) {
            this.id = Human.id++;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return id ++ +".Human{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public static void main(String[] args) {
            LinkedList<Human> linkedList = new LinkedList<>();
            linkedList.addFirst(new Human("teo", 10));
            linkedList.addFirst(new Human("te", 12));
            linkedList.addFirst(new Human("zx", 13));
            for (int i = 0; i < linkedList.size(); i++) {
                System.out.println(linkedList.get(i));
            }
            System.out.println("size của list là "+linkedList.size());
//            System.out.println(linkedList.get(linkedList.size-1));
        }
    }
}
