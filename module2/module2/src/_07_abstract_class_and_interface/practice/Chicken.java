package _07_abstract_class_and_interface.practice;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chicken : quac quac";
    }

    @Override
    public String food() {
        return "corn";
    }
}
