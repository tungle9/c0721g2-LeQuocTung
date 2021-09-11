package _07_abstract_class_and_interface.practice.animal_edible;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        System.out.println(animals[0].makeSound());
        animals[1] = new Chicken();
        System.out.println(animals[1].makeSound());
        for (Animal animal : animals) {
            if (animal instanceof Chicken) {
                Edible edible1 = (Chicken) animal;
                System.out.println(edible1.food());
            }
            if (animal instanceof Tiger) {
                Edible edible = (Tiger) animal;
                System.out.println(edible.food());
            }
        }
    }
}