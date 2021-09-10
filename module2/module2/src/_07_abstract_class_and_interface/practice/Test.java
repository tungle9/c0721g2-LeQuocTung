package _07_abstract_class_and_interface.practice;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        Animal[] animals = new Animal[1];
//        animals[0] = new Tiger();
//        System.out.println(animals[0].makeSound());
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        System.out.println(animals[0].makeSound());
        animals[1] = new Chicken();
        System.out.println(animals[1].makeSound());

        if (animals[0] instanceof Chicken) {
            Edible edible1 = (Chicken) animals[0];
            System.out.println(edible1.food());
        }
        if (animals[1] instanceof Tiger) {
            Edible edible = (Tiger) animals[1];
            System.out.println(edible.food());

        }
    }
}