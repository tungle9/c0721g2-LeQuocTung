package _09_DSA.excercise;

import abc.Human;

import java.util.Arrays;

public class TestMyList {
    static class Animal {
        public static int id = 1;
        String name;
        int age;

        Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return id++ + "Animal{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        MyList<Animal> myList = new MyList<>();//ban đầu là 10
        myList.ensureCapacity(100);
        myList.add(new Animal("bear", 17));
        myList.add(new Animal("fish", 17));
        myList.add(new Animal("meo", 17));
        System.out.println("xóa phần tử " + myList.remove(1));
        for (int i = 0; i < myList.size; i++) {
            System.out.println(myList.get(i));
        }

        System.out.println(myList.lenght()); // tổng độ dài
        System.out.println(myList.size());  // sộ lượng phần tử
//xóa tất cả
        myList.clear();
        for (int i = 0; i < myList.size; i++) {
            System.out.println(myList.get(i));
        }
    }
}
