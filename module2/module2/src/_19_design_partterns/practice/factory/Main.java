package _19_design_partterns.practice.factory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a1 = animalFactory.getAniaml("feline");
        System.out.println(a1.makeSound());
        Animal a2 = animalFactory.getAniaml("canine");
        System.out.println(a2.makeSound());
    }
}
