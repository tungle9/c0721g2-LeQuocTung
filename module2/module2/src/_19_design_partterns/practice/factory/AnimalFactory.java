package _19_design_partterns.practice.factory;

public class AnimalFactory {
    public Animal getAniaml(String string){
        if(string.equals("canine")){
            return new Dog();
        }
        else {
            return new Cat();
        }
    }
}
