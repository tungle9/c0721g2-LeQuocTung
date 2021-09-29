package _19_design_partterns.practice.object_pool;

public class TaxiNotFoundException extends  RuntimeException{
    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
