package _07_abstract_class_and_interface.practice.animal_edible;

import _07_abstract_class_and_interface.practice.animal_edible.Animal;
import _07_abstract_class_and_interface.practice.animal_edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String food() {
        return "meat";
    }

    @Override
    public String makeSound(){
        return "tiger: roarr";

    }
}
