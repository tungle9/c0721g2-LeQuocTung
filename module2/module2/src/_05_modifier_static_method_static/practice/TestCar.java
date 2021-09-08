package _05_modifier_static_method_static.practice;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("honda","abc");
        System.out.println(Car.numberOfCars);
        Car ca2 = new Car("Suzuki","xyz");
        System.out.println(Car.numberOfCars);
    }
}
